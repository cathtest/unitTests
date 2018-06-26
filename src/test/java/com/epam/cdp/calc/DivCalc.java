package com.epam.cdp.calc;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;
import static jdk.nashorn.internal.objects.Global.Infinity;

public class DivCalc extends Base{

    @Test(dataProvider = "valuesDivDouble")
    public void divDouble( double a, double b, double expectedValue) {
        double rslt = calc.div(a, b);
        Assert.assertTrue(rslt==expectedValue);
    }


    @DataProvider(name = "valuesDivDouble")

    public Object [][] valuesDivDouble(){
        return new Object[][] {
                {2.0, 5.0, 0.4},
                {-4.0, 5.0, -0.8}
        };
    }

    @Test (dataProvider = "valuesDivLong")
    public void divLong (long a, long b, long expectedValue) {

        long rslt = calc.div(a, b);
        Assert.assertEquals(rslt, expectedValue, "Invalid input");

    }

    @DataProvider(name = "valuesDivLong")

    public Object [][] valuesDivLong(){
        return new Object[][] {
                {2, 5, 0},
                {-4, 5, 0}
        };
    }

    @Test(dataProvider = "valuesDivDoubleZero")
    public void divDoubleZero( double a, double b, double expectedValue){
        double rslt = calc.div(a, b);
        Assert.assertEquals(rslt, expectedValue, "Invalid input");
    }


    @DataProvider(name = "valuesDivDoubleZero")

    public Object [][] valuesDivDoubleZero(){
        return new Object[][] {

                {0.0, 0.0, NaN},
                {-4.0, 0.0, -Infinity}
        };
    }

    @Test (dataProvider = "valuesDivLongZero", expectedExceptions = NumberFormatException.class)
    public void divLongZero (long a, long b, long expectedValue)throws NumberFormatException{

        long result = calc.div(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid input");

    }

    @DataProvider(name = "valuesDivLongZero")

    public Object [][] valuesDivLongZero(){
        return new Object[][] {
                {0, 0, 0},
                {-4, 0, 0}
        };
    }



}

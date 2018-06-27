package com.epam.cdp.calcTestng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultCalc extends Base{

    @Test(dataProvider = "valuesMultDouble")
    public void multDouble( double a, double b, double expectedValue) {
        double rslt = calc.mult(a, b);
        Assert.assertTrue(rslt==expectedValue, "There was an error");
    }


    @DataProvider(name = "valuesMultDouble")

    public Object [][] valuesSubDouble(){
        return new Object[][] {
                {2.0, 5.0, 10.0},
                {-4.0, 5.0, -20.0},
                {0.0, 0.0, 0.0},
                {-4.0, 0.0, 0.0}
        };
    }

    @Test (dataProvider = "valuesMultLong")
    public void multLong (long a, long b, long expectedValue) {

        long result = calc.mult(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid input");

    }

    @DataProvider(name = "valuesMultLong")

    public Object [][] valuesMultLong(){
        return new Object[][] {
                {2, 5, 10},
                {-4, 5, -20},
                {0, 0, 0},
                {-4, 0, 0}
        };
    }


}

package com.epam.cdp.calc;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

public class PosCalc extends Base{

    @Test(dataProvider = "valuesPosLong")
    public void sqrtDouble (long a,  boolean expectedValue) {

        boolean rslt = calc.isPositive(a);
        Assert.assertTrue(rslt==expectedValue, "Invalid input");

    }
    @DataProvider(name = "valuesPosLong")

    public Object [][] valuesPosDouble(){
        return new Object[][] {
                {4, true},
                {-1, false},
                {0, false},
                {1, true}
        };
    }
}

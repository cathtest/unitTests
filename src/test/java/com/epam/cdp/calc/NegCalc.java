package com.epam.cdp.calc;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

public class NegCalc extends Base{

    @Test(dataProvider = "valuesNegLong")
    public void sqrtDouble (long a,  boolean expectedValue) {

        boolean rslt = calc.isPositive(a);
        Assert.assertTrue(rslt== expectedValue, "Invalid input");

    }
    @DataProvider(name = "valuesNegLong")

    public Object [][] valuesNegLong(){
        return new Object[][] {
                {4, false},
                {-1, true},
                {0, false},
                {1, false}
        };
    }
}

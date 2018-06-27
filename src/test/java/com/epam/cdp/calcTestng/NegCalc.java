package com.epam.cdp.calcTestng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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

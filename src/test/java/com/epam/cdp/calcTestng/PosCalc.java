package com.epam.cdp.calcTestng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PosCalc extends Base{

    @Test(dataProvider = "valuesPosLong")
    public void sqrtDouble (long a,  boolean expectedValue) {

        boolean rslt = calc.isPositive(a);
        Assert.assertEquals(rslt, expectedValue, "Invalid input");

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

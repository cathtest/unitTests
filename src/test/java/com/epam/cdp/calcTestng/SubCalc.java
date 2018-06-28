
package com.epam.cdp.calcTestng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalc extends Base{

    @Test
    public void minusLong() {
        long rslt = calc.sub(3, 2);
        Assert.assertTrue(rslt==1, "There was an error");
    }

    @Test (dataProvider = "valuesSubDouble")
    public void minusDouble( double a, double b, double expectedValue) {
        double rslt = calc.sub(a, b);
        Assert.assertEquals(rslt, expectedValue, "There was an error");
    }


    @DataProvider(name = "valuesSubDouble")

    public Object [][] valuesSubDouble(){
        return new Object[][] {
                {2.0, 5.0, -3.0},
                {-4.0, 5.0, -9.0},
                {0.0, 0.0, 0.0},
                {-4.0, 0.0, -4.0}
        };
    }

}
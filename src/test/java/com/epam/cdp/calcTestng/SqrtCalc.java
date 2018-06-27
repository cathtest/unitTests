package com.epam.cdp.calcTestng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

public class SqrtCalc extends Base{

    @Test(dataProvider = "valuesSqrtDouble")
    public void sqrtDouble (double a,  double expectedValue) {

        double rslt = calc.sqrt(a);
        Assert.assertEquals(rslt, expectedValue, "Invalid input");

    }
    @DataProvider(name = "valuesSqrtDouble")

    public Object [][] valuesSqrtDouble(){
        return new Object[][] {
                {4.0, 2.0},
                {-4.0, NaN},
                {0.0, 0.0},
                {3.0, 1.7320508075688772}
        };
    }
}

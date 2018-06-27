package com.epam.cdp.calcTestng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


    @Test (groups = {"forTg"})
public class SinCalc extends Base{

    @Test(dataProvider = "valuesSinDouble", priority = 1)
    public void sinDouble (double a,  double expectedValue) {

        double rslt = calc.sin(a);
        Assert.assertEquals(rslt, expectedValue, "Invalid input");

    }
    @DataProvider(name = "valuesSinDouble")

    public Object [][] valuesSinDouble(){
        return new Object[][] {
                {4.0, -0.7568024953079282},
                {-4.0, 0.7568024953079282},
                {0.0, 0.0},
                {1.0, 0.8414709848078965}
        };
    }

}

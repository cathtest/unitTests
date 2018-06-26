package com.epam.cdp.calc;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

    @Test (groups = {"forTg"})
public class CosCalc extends Base{

    @Test(dataProvider = "valuesCosDouble", priority = 2)
    public void cosDouble (double a,  double expectedValue) {

        double rslt = calc.cos(a);
        Assert.assertEquals(rslt, expectedValue, "Invalid input");

    }
    @DataProvider(name = "valuesCosDouble")

    public Object [][] valuesCosDouble(){
        return new Object[][] {
                {4.0, -0.65364362086},
                {-4.0, -0.65364362086},
                {0.0, 1.0},
                {1.0, 0.54030230586}
        };
    }
}
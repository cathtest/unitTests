package com.epam.cdp.calcTestng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

    @Test (groups = "Tg")

public class TgCalc extends Base{
    SinCalc sin = new SinCalc();
    CosCalc cos = new CosCalc();

    @Test(dataProvider = "valuesTgDouble", dependsOnGroups = {"forTg"}, priority = 3)
    public void tgDouble (double a,  double expectedValue) {

        double rslt = calc.tg(a);
        Assert.assertEquals(rslt, expectedValue, "Invalid input");

    }
    @DataProvider(name = "valuesTgDouble")

    public Object [][] valuesTgDouble(){
        return new Object[][] {
                {2.0, 0.03492077},
                {-4.0, -0.06992681},
                {0.0, 0.0},
                {-1.0, -0.01745506}
        };
    }
}
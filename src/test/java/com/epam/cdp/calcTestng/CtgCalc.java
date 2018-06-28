package com.epam.cdp.calcTestng;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CtgCalc extends Base{

    @Test(dataProvider = "valuesCtgDouble")
    public void ctgDouble (double a,  double expectedValue) {

        double rslt = calc.ctg(a);
        Assert.assertEquals(rslt, expectedValue, "Invalid input");

    }
    @DataProvider(name = "valuesCtgDouble")

    public Object [][] valuesCtgDouble(){
        return new Object[][] {
                {4.0, 0.999329299739067},
                {-4.0, -0.999329299739067},
                {0.0, 0.0},
                {1.0, 0.7615941559557649}
        };
    }

}
package com.epam.cdp.calc;

        import org.testng.Assert;
        import org.testng.annotations.DataProvider;
        import org.testng.annotations.Test;

public class PowCalc extends Base{

    @Test(dataProvider = "valuesPowDouble")
    public void powDouble (double a, double b, double expectedValue) {

        double rslt = calc.pow(a, b);
        Assert.assertEquals(rslt, expectedValue, "Invalid input");

    }
    @DataProvider(name = "valuesPowDouble")

    public Object [][] valuesPowDouble(){
        return new Object[][] {
                {2.0, 2.0, 4.0},
                {-4.0, 5.0, -1024.0},
                {0.0, 0.0, 1.0},
                {-4.0, 0.0, 1.0}
        };
    }
}

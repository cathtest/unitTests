package com.epam.cdp.calcJUnit;


import com.epam.cdp.calcJUnit.JBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

import static org.testng.AssertJUnit.assertEquals;


@RunWith(value = Parameterized.class)
public class JCtgCalc extends JBase {

    private double expectedValue;
    private double a;


    @Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{4.0, 0.999329299739067}, {-4.0, -0.999329299739067}, {0.0, 0.0}, {1.0, 0.7615941559557649}});
    }

    public JCtgCalc(double a, double expectedValue){

        this.expectedValue = expectedValue;
        this.a = a;


    }

    @Test
    public void jCtgTestLong(){

        assertEquals(expectedValue, calc.ctg(a));

    }

}

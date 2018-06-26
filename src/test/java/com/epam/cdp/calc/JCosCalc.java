package com.epam.cdp.calc;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

import static org.testng.AssertJUnit.assertEquals;


@RunWith(value = Parameterized.class)
public class JCosCalc extends JBase{

    private double expectedValue;
    private double a;


    @Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{4.0, -0.65364362086}, {-4.0, -0.65364362086}, {0.0, 1.0}, {1.0, 0.54030230586}});
    }

    public JCosCalc(double a, double expectedValue){

        this.expectedValue = expectedValue;
        this.a = a;


    }

    @Test
    public void jCosTestLong(){

        assertEquals(expectedValue, calc.sin(a));

    }

}

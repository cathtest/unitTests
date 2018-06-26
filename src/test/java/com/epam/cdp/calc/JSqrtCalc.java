package com.epam.cdp.calc;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static java.lang.Double.NaN;
import static org.testng.AssertJUnit.assertEquals;



@RunWith(value = Parameterized.class)
public class JSqrtCalc extends JBase{

    private double expectedValue;
    private double a;



    @Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{4.0, 2.0}, {-4.0, NaN}, {0.0, 0.0}, {3.0, 1.7320508075688772}});
    }

    public JSqrtCalc(double a, double expectedValue){

        this.expectedValue = expectedValue;
        this.a = a;


    }

    @Test
    public void jSqrtTest(){


        assertEquals(expectedValue, calc.sqrt(a));

    }

}

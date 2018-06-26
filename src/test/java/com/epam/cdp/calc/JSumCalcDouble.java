package com.epam.cdp.calc;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.testng.AssertJUnit.assertEquals;


@RunWith(value = Parameterized.class)
public class JSumCalcDouble extends JBase{

    private double expectedValue;
    private double a;
    private double b;


    @Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{1.0, 0.0, 1.0}, {1.0, 1.0, 2.0}, {2.0, 2.0, 4.0}, {0.0, 0.0, 0.0}});
    }

    public JSumCalcDouble(double a, double b, double expectedValue){

        this.expectedValue = expectedValue;
        this.a = a;
        this.b = b;

    }

    @Test
    public void jSumTestDouble(){


        assertEquals(expectedValue, calc.sum(a, b));

    }

}

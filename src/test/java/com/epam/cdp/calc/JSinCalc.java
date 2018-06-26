package com.epam.cdp.calc;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.testng.AssertJUnit.assertEquals;


@RunWith(value = Parameterized.class)
public class JSinCalc extends JBase{

    private double expectedValue;
    private double a;


    @Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{4.0, -0.7568024953079282}, {-4.0, 0.7568024953079282}, {0.0, 0.0}, {1.0, 0.8414709848078965}});
    }

    public JSinCalc(double a, double expectedValue){

        this.expectedValue = expectedValue;
        this.a = a;


    }

    @Test
    public void jSinTestLong(){

        assertEquals(expectedValue, calc.sin(a));

    }

}

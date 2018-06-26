package com.epam.cdp.calc;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

import static org.testng.AssertJUnit.assertEquals;


@RunWith(value = Parameterized.class)
public class JTgCalc extends JBase{

    private double expectedValue;
    private double a;


    @Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{2.0, 0.03492077}, {-4.0, -0.06992681}, {0.0, 0.0}, {-1.0, -0.01745506}});
    }

    public JTgCalc(double a, double expectedValue){

        this.expectedValue = expectedValue;
        this.a = a;


    }

    @Test
    public void jTgTestLong(){

        assertEquals(expectedValue, calc.tg(a));

    }

}

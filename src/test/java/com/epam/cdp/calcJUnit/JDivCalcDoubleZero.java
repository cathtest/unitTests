package com.epam.cdp.calcJUnit;


import com.epam.cdp.calcJUnit.JBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static java.lang.Float.NaN;
import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.testng.AssertJUnit.assertEquals;


@RunWith(value = Parameterized.class)
public class JDivCalcDoubleZero extends JBase {

    private double expectedValue;
    private double a;
    private double b;


    @Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{1.0, 0.0, Infinity}, {0.0, 0.0, NaN}});
    }

    public JDivCalcDoubleZero(double a, double b, double expectedValue){

        this.expectedValue = expectedValue;
        this.a = a;
        this.b = b;

    }

    @Test
    public void jDivTestDouble() {


        assertEquals(expectedValue, calc.div(a, b));

    }

}

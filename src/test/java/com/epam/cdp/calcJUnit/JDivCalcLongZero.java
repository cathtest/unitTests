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
public class JDivCalcLongZero extends JBase {

    private long expectedValue;
    private long a;
    private long b;


    @Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{1, 0, 0},  {0, 0, 0}});
    }

    public JDivCalcLongZero(long a, long b, long expectedValue){

        this.expectedValue = expectedValue;
        this.a = a;
        this.b = b;

    }

    @Test (expected = NumberFormatException.class)
    public void jDivTestLong() throws NumberFormatException{


        assertEquals(expectedValue, calc.div(a, b));

    }

}

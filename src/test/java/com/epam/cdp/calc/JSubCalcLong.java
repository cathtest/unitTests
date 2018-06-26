package com.epam.cdp.calc;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.testng.AssertJUnit.assertEquals;


@RunWith(value = Parameterized.class)
public class JSubCalcLong extends JBase{

    private long expectedValue;
    private long a;
    private long b;


    @Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{1, 0, 1}, {1, 1, 0}, {-2, 2, -4}, {0, 0, 0}});
    }

    public JSubCalcLong(long a, long b, long expectedValue){

        this.expectedValue = expectedValue;
        this.a = a;
        this.b = b;

    }

    @Test
    public void jSubTestLong(){


        assertEquals(expectedValue, calc.sub(a, b));

    }

}

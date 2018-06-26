package com.epam.cdp.calc;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import static org.testng.AssertJUnit.assertTrue;


@RunWith(value = Parameterized.class)
public class JNegCalc extends JBase{

    private boolean expectedValue;
    private long a;



    @Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{1, false}, {-1, true}, {2, false}, {0, false}});
    }

    public JNegCalc(long a, boolean expectedValue){

        this.expectedValue = expectedValue;
        this.a = a;


    }

    @Test
    public void JNegTest(){


        assertTrue(expectedValue==calc.isNegative(a));

    }

}

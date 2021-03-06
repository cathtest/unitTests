package com.epam.cdp.calcJUnit;


import com.epam.cdp.calcJUnit.JBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import static org.testng.AssertJUnit.assertTrue;


@RunWith(value = Parameterized.class)
public class JPosCalc extends JBase {

    private boolean expectedValue;
    private long a;



    @Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{1, true}, {-1, false}, {2, true}, {0, false}});
    }

    public JPosCalc(long a, boolean expectedValue){

        this.expectedValue = expectedValue;
        this.a = a;


    }

    @Test
    public void jPostTest(){


        assertTrue(expectedValue==calc.isPositive(a));

    }

}

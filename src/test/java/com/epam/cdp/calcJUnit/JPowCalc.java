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
public class JPowCalc extends JBase {

    private double expectedValue;
    private double a;
    private double b;


    @Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{2.0, 2.0, 4.0}, {-4.0, 5.0, -1024.0}, {0.0, 0.0, 1.0}, {-4.0, 0.0, 1.0}});
    }

    public JPowCalc(double a, double b, double expectedValue){

        this.expectedValue = expectedValue;
        this.a = a;
        this.b = b;

    }

    @Test
    public void jPowTest(){


        assertTrue(expectedValue == calc.pow(a, b));

    }

}

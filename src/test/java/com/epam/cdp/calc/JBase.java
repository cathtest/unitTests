package com.epam.cdp.calc;


import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;

public class JBase {


    protected Calculator calc;

    @Before
    public void setUp() {

        calc = new Calculator();

    }
    @After
    public void clear() {

        calc = null;
    }


}
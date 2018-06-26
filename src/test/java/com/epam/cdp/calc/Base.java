package com.epam.cdp.calc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeTest;

public class Base {


    protected Calculator calc;

    @BeforeTest
    public void setUp() {

        calc = new Calculator();

    }
    @AfterTest
    public void clear() {
        calc = null;
    }


}
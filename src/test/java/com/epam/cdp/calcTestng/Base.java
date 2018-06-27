package com.epam.cdp.calcTestng;

import org.testng.annotations.AfterTest;

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
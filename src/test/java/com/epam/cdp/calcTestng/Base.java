package com.epam.cdp.calcTestng;
import org.testng.annotations.AfterMethod;
import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeMethod;


public class Base {


    protected Calculator calc;

    @BeforeMethod
    public void setUp() {

        calc = new Calculator();

    }
    @AfterMethod
    public void clear() {
        calc = null;
    }


}
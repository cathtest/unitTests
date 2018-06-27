package com.epam.cdp.calcTestng;
import org.testng.Assert;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;


public class SumCalc  extends Base {

    protected Calculator calc;


    @Test (dataProvider = "valuesSumLong")
    public void plusLong (long a, long b, long expectedValue) {

        long result = calc.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid input");

    }

    @DataProvider(name = "valuesSumLong")

    public Object [][] valuesSumLong(){
        return new Object[][] {
                {2, 5, 7},
                {-4, 5, 1},
                {0, 0, 0},
                {-4, 0, -4}
        };
    }

    @Test (dataProvider = "valuesSumDouble")
    public void plusDouble (double a, double b, double expectedValue) {

        double result = calc.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid input");

    }


    @DataProvider(name = "valuesSumDouble")

    public Object [][] valuesSumDouble(){
        return new Object[][] {
                {2.0, 5.0, 7.0},
                {-4.0, 5.0, 1.0},
                {0.0, 0.0, 0.0},
                {-4.0, 0.0, -4.0}
        };
    }

}
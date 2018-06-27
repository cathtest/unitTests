package com.epam.cdp.calcJUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;



    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            JCosCalc.class,
            JSinCalc.class,
            JBase.class,
            JCtgCalc.class,
            JTgCalc.class,
            JSqrtCalc.class,
            JSubCalcDouble.class,
            JSubCalcLong.class,
            JSumCalcDouble.class,
            JSumCalcLong.class,
            JDivCalcDouble.class,
            JDivCalcLong.class,
            JDivCalcDoubleZero.class,
            JDivCalcLongZero.class,
            JPosCalc.class,
            JMultCalcDouble.class,
            JMultCalcLong.class,
            JNegCalc.class,
            JPosCalc.class
    })
    public class AllJTests{

    }


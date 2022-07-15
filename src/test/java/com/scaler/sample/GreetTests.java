package com.scaler.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class GreetTests {

    @Test
    void testFetchGreetingWorks() {

        Calendar cal_10_00 = new Calendar.Builder().setTimeOfDay(10, 0, 0).build();
        Calendar cal_14_00 = new Calendar.Builder().setTimeOfDay(14, 0, 0).build();
        Calendar cal_19_00 = new Calendar.Builder().setTimeOfDay(19, 0, 0).build();

        Greet morn_greet = new Greet(cal_10_00);
        Greet aft_greet = new Greet(cal_14_00);
        Greet eve_greet = new Greet(cal_19_00);

        Assertions.assertEquals(morn_greet.fetchGreeting(), Greet.GOOD_MORN);
        Assertions.assertEquals(aft_greet.fetchGreeting(), Greet.GOOD_AFT);
        Assertions.assertEquals(eve_greet.fetchGreeting(), Greet.GOOD_EVE);
    }
}

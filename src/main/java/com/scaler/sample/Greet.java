package com.scaler.sample;

import java.util.Calendar;

public class Greet {

    public static final String GOOD_MORN = "Good Morning";
    public static final String GOOD_AFT = "Good Afternoon";
    public static final String GOOD_EVE = "Good Evening";

    public static final String  fetchGreeting() {
        int hotd = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if (hotd < 12) {
            return GOOD_MORN;
        } else if (hotd < 18) {
            return GOOD_AFT;
        }
        else {
            return GOOD_EVE;
        }
    }
}

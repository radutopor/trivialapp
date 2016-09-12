package com.radutopor.trivialapp;

import java.util.Calendar;

/**
 * Created by radutopor on 08/09/2016.
 */
public class GreetingGenerator {
    public static String createGreeting(long timeInMillis) {
        Calendar time = Calendar.getInstance();
        time.setTimeInMillis(timeInMillis);
        int hourOfDay = time.get(Calendar.HOUR_OF_DAY);
        if (hourOfDay < 12) {
            return "Good morning!";
        } else if (hourOfDay < 17) {
            return "Good afternoon!";
        } else {
            return "Good evening!";
        }
    }
}

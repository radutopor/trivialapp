package com.radutopor.trivialapp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

/**
 * Created by radutopor on 08/09/2016.
 */
public class GreetingGeneratorTest {
    private Calendar calendar;

    @Before
    public void setUp() throws Exception {
        calendar = Calendar.getInstance();
    }

    @Test
    public void testCreateMorningGreeting() throws Exception {
        calendar.set(Calendar.HOUR_OF_DAY, 7);
        Assert.assertEquals(GreetingGenerator.createGreeting(calendar.getTimeInMillis()), "Good morning!");
    }

    @Test
    public void testCreateAfternoonGreeting() throws Exception {
        calendar.set(Calendar.HOUR_OF_DAY, 15);
        assertEquals(GreetingGenerator.createGreeting(calendar.getTimeInMillis()), "Good afternoon!");
    }

    @Test
    public void testCreateEveningGreeting() throws Exception {
        calendar.set(Calendar.HOUR_OF_DAY, 20);
        assertEquals(GreetingGenerator.createGreeting(calendar.getTimeInMillis()), "Good evening!");
    }
}

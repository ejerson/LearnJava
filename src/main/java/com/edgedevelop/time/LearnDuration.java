package com.edgedevelop.time;

import java.time.*;

public class LearnDuration {





    private static Duration daily = Duration.ofDays(1);                // PT24H
    private static Duration hourly = Duration.ofHours(1);              // PT1H
    private static Duration everyMinute = Duration.ofMinutes(1);       // PT1M
    private static Duration everyTenSeconds = Duration.ofSeconds(10);  // PT10S
    private static Duration everyMilli = Duration.ofMillis(1);         // PT0.001S
    private static Duration everyNano = Duration.ofNanos(1);           // PT0.000000001S



    public static void main (String args[]) {

        System.out.println(daily);
        System.out.println(hourly);
        System.out.println(everyMinute);
        System.out.println(everyTenSeconds);
        System.out.println(everyMilli);
        System.out.println(everyNano);

    }




}

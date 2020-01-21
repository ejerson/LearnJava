package com.edgedevelop.time;

import java.sql.SQLOutput;
import java.time.*;

public class LearnTime {

    public static void main (String... args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        // LocalDate does not include time!!!!
        // Use LocalTime instead
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        System.out.println(date2.getDayOfWeek());
        System.out.println(date1);

        // To count months, they all start at 1
        // To count days, they all start at 1


        LocalTime time1 =  LocalTime.of(6, 15);               // hour and minute
        LocalTime time2 =  LocalTime.of(6, 15, 30);           // + seconds
        LocalTime time3 =  LocalTime.of(6, 15, 30, 200);      // + nanoseconds

        LocalDateTime dateTime = LocalDateTime.now();


        System.out.println(time1);
        System.out.println(time2);

        ZonedDateTime zone1 = ZonedDateTime.now();
        System.out.println(zone1.getZone());

        ZonedDateTime zonedDateTime = ZonedDateTime.ofLocal(dateTime, zone1.getZone(), ZoneOffset.UTC);
        System.out.println(zonedDateTime);


    }
}






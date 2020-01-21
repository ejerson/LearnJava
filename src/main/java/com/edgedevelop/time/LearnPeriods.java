package com.edgedevelop.time;

import java.time.*;


public class LearnPeriods {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1);          // create a period
        performAnimalEnrichment(start, end, period);
    }
    private static void performAnimalEnrichment(LocalDate start, LocalDate end,
                                                Period period) {                             // uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }
    }

    // FIVE WAYS TO CREATE a PERIOD CLASS
    // YOU CANNOT CHAIN METHODS WHEN USING PERIOD
    // Can be used with LocalDate and LocalDateTime
    Period annually = Period.ofYears(1);               // every 1 year
    Period quarterly = Period.ofMonths(3);             // every 3 months
    Period everyThreeWeeks = Period.ofWeeks(3);        // every 3 weeks
    Period everyOtherDay = Period.ofDays(2);           // every 2 days
    Period everyYearAndAWeek = Period.of(1, 0, 7);     // every year and 7 days

    /*
    * Does NOT use the Period class
    *
    * */
//    public static void main(String... args) {
//        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
//        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
//        performAnimalEnrichment(start, end);
//    }
//
//    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
//        LocalDate upTo = start;
//        while (upTo.isBefore(end)) {          // check if still before end
//            System.out.println("give new toy: " + upTo);
//            upTo = upTo.plusDays(3);           // add a month
//        }
//    }


}

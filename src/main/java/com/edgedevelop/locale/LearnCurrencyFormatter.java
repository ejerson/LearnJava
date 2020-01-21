package com.edgedevelop.locale;

import java.text.NumberFormat;
import java.util.Locale;

public class LearnCurrencyFormatter {

    public static void main(String[] args) {

        /* Create custom Locale for India.
          used the "IANA Language Subtag Registry" to find India's country code */
        Locale indiaLocale = new Locale("en", "IN");

        /* Create NumberFormats using Locales */
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        /* Print output */
        System.out.println("US: "     + us.format(12324.134));
        System.out.println("India: "  + india.format(12324.134));
        System.out.println("China: "  + china.format(12324.134));
        System.out.println("France: " + france.format(12324.134));

    }
}

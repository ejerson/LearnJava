package com.edgedevelop.locale;

import java.util.Locale;

public class LearnLocale {

    public static void main(String[] args) {

        // gets my default locale
        // EXAM IMPORTANT
        // 1. en_US ---- the only allowed format
        // 2. fr ------- only language format is also allowed
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        // samples of other locales that I can use
        System.out.println(Locale.GERMAN);  // de
        System.out.println(Locale.GERMANY); // de_DE

        // a more flexible way to build a locale is to use the
        // Locale.Builder()
        // the advantage of the builder pattern is that
        // you can easily use different combinations of setter methods
        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        System.out.println(l1);

        // to set a default locale
        Locale locale1 = new Locale("fr");
        Locale.setDefault(locale1);
        System.out.println(Locale.getDefault()); // fr

    }
}

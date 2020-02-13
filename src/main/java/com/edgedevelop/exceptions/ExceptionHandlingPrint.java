package com.edgedevelop.exceptions;

import java.util.Scanner;

public class ExceptionHandlingPrint {

    public static void main(String[] args) {

        try {
            int div = 3/0;

        } catch (Exception e) {

            System.out.println(e);
        }


    }

}

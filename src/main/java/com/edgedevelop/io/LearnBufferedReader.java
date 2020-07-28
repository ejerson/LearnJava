package com.edgedevelop.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LearnBufferedReader {
    public static void main(String[] args) {
        // BufferedReader and InputStreamReader are both subclasses of the java.io.Reader class
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String test = null;
        try {
            test = reader.readLine();
            System.out.println(test);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

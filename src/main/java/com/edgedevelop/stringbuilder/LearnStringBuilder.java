package com.edgedevelop.stringbuilder;

public class LearnStringBuilder {

    public static void main(String[] args) {
        String madam = "madam";

        StringBuilder sb = new StringBuilder(madam);
        String reversed = sb.reverse().toString();

        if (madam.equals(reversed)) {
            System.out.println("yes");
        }
    }
}

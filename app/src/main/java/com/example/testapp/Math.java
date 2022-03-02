package com.example.testapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Math {
    public String plus(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        return String.valueOf(num1 + num2);
    }

    public String divide(String a, String b) {
        int num1 = Integer.parseInt(a.trim());
        int num2 = Integer.parseInt(b.trim());
        if (num2 == 0) {
            return "нельзя делить на 0";
        }
        return String.valueOf(num1 / num2);
    }

    public String multi(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        return String.valueOf(num1 * num2);
    }

    public String checkSymbol(String a, String b) {
        Pattern pattern = Pattern.compile("[a-zA-Z]", Pattern.CASE_INSENSITIVE);
        Matcher matcherA = pattern.matcher(a);
        Matcher matcherB = pattern.matcher(b);
        boolean num1 = matcherA.find();
        boolean num2 = matcherB.find();
        if (num1 || num2) {
            return "у вас есть лишние символы";
        }
        return String.valueOf(a + b);
    }

    public String minus(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        if (num1 < 0 || num2 < 0) {
            return "вы использовали отрицательно число";
        }
        return String.valueOf(num1 - num2);
    }
}


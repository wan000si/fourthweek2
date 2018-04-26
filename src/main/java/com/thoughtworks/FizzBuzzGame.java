package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private int count;

    public void start(int count) {
        this.count = count;
    }

    public List<String> getResults() {

        for (int i = 1; i <= count; i++) {
            if (contains3(i)) {
                results.add("Fizz");
            } else if (isMultipleOf3_5_7(i)) {
                results.add("FizzBuzzWhizz");
            } else if (isMultipleOf3_5(i)) {
                results.add("FizzBuzz");
            } else if (isMultipleOf3_7(i)) {
                results.add("FizzWhizz");
            } else if (isMultipleOf5_7(i)) {
                results.add("BuzzWhizz");
            } else if (isMultipleOf3(i)) {
                results.add("Fizz");
            } else if (isMultipleOf5(i)) {
                results.add("Buzz");
            } else if (isMultipleOf7(i)) {
                results.add("Whizz");
            } else {
                results.add(String.valueOf(i));
            }
        }
        return results;
    }

    public static boolean contains3(int number) {
        String str = String.valueOf(number);
        return str.contains("3");
    }

    public static boolean isMultipleOf3_5_7(int number) {
        return (number % 3 == 0 && number % 5 == 0 && number % 7 == 0);
    }

    public static boolean isMultipleOf3_5(int number) {
        return (number % 3 == 0 && number % 5 == 0);
    }

    public static boolean isMultipleOf3_7(int number) {
        return (number % 3 == 0 && number % 7 == 0);
    }

    public static boolean isMultipleOf5_7(int number) {
        return (number % 5 == 0 && number % 7 == 0);
    }

    public static boolean isMultipleOf3(int number) {
        return ((!isMultipleOf3_5_7(number)) && (!isMultipleOf3_5(number)) && (!isMultipleOf3_7(number)) && (number % 3 == 0));
    }

    public static boolean isMultipleOf5(int number) {
        return ((!isMultipleOf3_5_7(number)) && (!isMultipleOf3_5(number)) && (!isMultipleOf5_7(number)) && (number % 5 == 0));
    }

    public static boolean isMultipleOf7(int number) {
        return ((!isMultipleOf3_5_7(number)) && (!isMultipleOf3_7(number)) && (!isMultipleOf5_7(number)) && (number % 7 == 0));
    }
}



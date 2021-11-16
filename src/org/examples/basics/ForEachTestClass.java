package org.examples.basics;

public class ForEachTestClass {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        // from 1 to 10
        for (int i=0; i < numbers.length; i++) {
            numbers[i] = i; //numbers[0] = 0; numbers[1] = 1; etc.
        }

        //forEach
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

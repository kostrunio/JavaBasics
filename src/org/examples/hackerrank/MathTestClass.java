package org.examples.hackerrank;

public class MathTestClass {
    public static void main(String[] args) {
        double lower = 3.1;
        double higher = 3.9;

        System.out.println(Math.round(lower));//3.1 -> 3
        System.out.println(Math.round(higher));//3.9 -> 4

        System.out.println(Math.PI);
        System.out.println(Math.abs(-3.5));

        System.out.println(Math.pow(2,3));
        System.out.println(Math.random()*100);//0-100
    }
}

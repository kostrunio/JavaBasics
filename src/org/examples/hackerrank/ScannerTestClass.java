package org.examples.hackerrank;

import java.util.Scanner;

public class ScannerTestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something and press Enter");
        double input = scanner.nextDouble();
        scanner.nextLine();
        String nextInput = scanner.nextLine();
        System.out.println("input: " + input);
        System.out.println("nextInput: " + nextInput);
    }
}

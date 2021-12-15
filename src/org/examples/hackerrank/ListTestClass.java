package org.examples.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ListTestClass {
    public static void main(String[] args) {
        int[] intArray = new int[2];
        intArray[0] = 0;
        intArray[1] = 1;
//        intArray[2] = 2;
        System.out.println("intArray.length=" + intArray.length);
        System.out.println("intArray[0]=" + intArray[0]);

        List<Integer> intList = new ArrayList<>(2);
        intList.add(0);//0
        intList.add(1);//1
        intList.add(2);//2
        System.out.println("intList.size()=" + intList.size());
        System.out.println("intList.get(0)=" + intList.get(0));
    }
}

package org.examples.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class MapTestClass {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("michal", 123456789);

        System.out.println("michal's phone number:" + map.get("michal"));
        System.out.println("karol's phone number:" + map.get("karol"));
    }
}

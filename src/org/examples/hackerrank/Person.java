package org.examples.hackerrank;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void whoAmI() {
        System.out.println("my name is " + name + ", and I'm " + age + " years old");
    }
}

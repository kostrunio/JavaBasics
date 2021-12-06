package org.examples.hackerrank;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("michał", 38);
        System.out.println(person.getName());

        person.whoAmI();
    }
}

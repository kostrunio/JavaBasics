public class IfTestClass {
    public static void main(String[] args) {
        int number = 4;
        int lower = 3;
        int higher = 5;

        if (number > lower) {
            System.out.println(number + " is higher than " + lower);
        }

        if (number < higher) {
            System.out.println(number + " is lower than " + higher);
        }

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd numer");
        }

        if (number >= 10 || number <= 0) {
            System.out.println(number + " has wrong value");
        } else if (number < 2) {
            System.out.println("try better");
        } else if (number < 4) {
            System.out.println("quite good");
        } else if (number < 6) {
            System.out.println("pretty awesome");
        } else if (number < 8) {
            System.out.println("excellent");
        } else {
            System.out.println("that's amazing");
        }

        if (number > 3 && number < 6) {
            if (number % 2 == 0) {
                System.out.println("that's 4");
            } else {
                System.out.println("that's 5");
            }
        }
    }
}

public class MethodTestClass {
    public static void main(String[] args) {
        myFirstMethod();
        myFirstMethod();

        mySecondMethod("mySecondMethod");

        myThirdMethod("myThirdMethod", 30);

        System.out.println(concatTwoStrings("I like", "coding"));

        mySecondMethod(concatTwoStrings("My use", "of second method"));

        mySecondMethod(concatTwoStrings(concatTwoStrings("My", "use"), concatTwoStrings("of", "second method")));
    }

    public static void myFirstMethod() {
        System.out.println("myFirstMethod");
    }

    public static void mySecondMethod(String textToPrint) {
        System.out.println(textToPrint);
    }

    public static void myThirdMethod(String textToPrint, int numberToPrint) {
        System.out.println(textToPrint + " " + numberToPrint);
    }

    public static String concatTwoStrings(String first, String second) {
        return first + " " + second;
    }
}

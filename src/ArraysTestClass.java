import java.util.Arrays;

public class ArraysTestClass {
    public static void main(String[] args) {
        int[] array = new int[5]; //array with length of 0 - empty array
        String[] words = new String[5]; //array with length of 5
        double[] numbers = {1.2, 2.3, 3.4, 4.5}; //array with initialization - 4 elements

        words[0] = "first"; //index of elements starts from 0!!
        System.out.println(words[0]); //print first element from an array
        System.out.println(words); //wrong way to print array
        System.out.println(Arrays.toString(numbers));
        words[4] = "last"; //exception!! last element has index 4 (because we start from 0)

        // change array to size 5 and print it
        System.out.println(Arrays.toString(array));
        // print words in proper way
        System.out.println(Arrays.toString(words));
    }
}

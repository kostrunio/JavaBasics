import java.util.Arrays;

public class ForTestClass {
    public static void main(String[] args) {
        for (int i=0; i < 5; i++) { //i = i+1 -> i += 1 -> i++ post increment
            System.out.println(i);  //i = i-1 -> i -= 1 -> i-- post decrement
        }

        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;

        // from 1 to 10
        for (int i=0; i < numbers.length; i++) {
            numbers[i] = i+1; //numbers[0] = 1; numbers[1] = 2; etc.
        }
        System.out.println(Arrays.toString(numbers));

        // from 10 to 1
        for (int i=numbers.length; i > 0; i--) {
            //numbers.length(10) - i(10) = 0
            //numbers.length(10) - i(9) = 1 etc.
            numbers[numbers.length - i] = i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}

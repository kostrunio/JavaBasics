import java.util.Random;

public class WhileTestClass {
    public static void main(String[] args) {
        Random random = new Random();
        int result = random.nextInt(10);

        while(result != 0) {
            System.out.println("result = " + result);
            result = random.nextInt(10);
        }

        System.out.println("result is " + result);
    }
}

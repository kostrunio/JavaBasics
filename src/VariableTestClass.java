public class VariableTestClass {
    public static void main(String[] args) {
        byte myByte = 127;
        short myShort = 32000;
        int myInteger = 200000;
        long myLong = 300000000;

        float myFloat = 3.5f;
        double myDouble = 5.1;

        boolean myBoolean = true;
        char myChar = 'M';
        String myString = "Hello World";

        int result = myByte + myShort + myInteger;
        System.out.println(result);

        System.out.println(myString + " : " + result);

        System.out.println(myBoolean);
    }
}

package HomeSixPasswod;

public class PositiveAndEqual {
    public static void main(String[] args) {

        //Positive number
        int num1 = 5;
        int num2 = 8;
        int num3 = -2;

        if (num1 > 0) {
            System.out.println("The number 5 is positive.");
        } else if (num1 < 0) {
            System.out.println("This number 5 is negative.");
        }

        if (num2 > 0) {
            System.out.println("The number 8 is positive.");
        } else if (num2 < 0) {
            System.out.println("The number 8 is negative.");
        }

        if (num3 > 0) {
            System.out.println("The number -2 is positive.");
        } else if (num3 < 0) {
            System.out.println("The number -2 is negative.");
        }

        //Equal number
        int a = 5;
        int b = 6;
        int c = 7;

        if ((a == b) && (b == c)) {
            System.out.println("This number equal.");
        } else if ((a != b) && (b != c)) {
            System.out.println("This number not equal.");
        }


    }
}

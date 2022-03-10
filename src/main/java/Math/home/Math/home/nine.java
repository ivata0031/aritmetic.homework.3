package Math.home.Math.home;

import java.util.Random;
import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Maximum between three numbers
        System.out.println("The system is waiting for your three numbers.");
        System.out.println("Enter your first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter your second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter your third number:");
        int thirdNumber = scanner.nextInt();
        System.out.println("The greatest number is " + theGreatestNumber(firstNumber,secondNumber,thirdNumber));

        //Face of a triangle
        System.out.println("Calculate the area of a triangle by two sides and an angle between them!");
        System.out.println("Enter first side of the triangle:");
        double a = scanner.nextInt();
        System.out.println("Enter second side:");
        double b = scanner.nextInt();
        System.out.println("Enter the angel between the two sides of the triangle:");
        double angle = scanner.nextInt();
        System.out.printf("The area of the triangle is %.2f", findTriangleAreaByTwoSidesAndAngle(a, b, angle));

        System.out.println(".");

        //Third task
        System.out.println("Haw many random numbers do you want to see between 1 and 100?");
        int arrayLength = scanner.nextInt();
        printRandom(arrayLength);

    }
    public static int theGreatestNumber(int firstNumber, int secondNumber, int thirdNumber){
        return(Math.max(firstNumber,Math.max(secondNumber,thirdNumber)));

    }
    public static double findTriangleAreaByTwoSidesAndAngle(double a, double b, double angle){
        return (((a*b)/2) * Math.sin(Math.toRadians(angle)));
    }
    public static void printRandom(int arrayLength){
        Random random = new Random();
        int [] array = new int[arrayLength];

        for (int i=1; i <= arrayLength; i++){
            System.out.println(random.nextInt(1,100) + "; ");
        }
    }

}

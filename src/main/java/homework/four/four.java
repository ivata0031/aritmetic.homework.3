package homework.four;

import java.util.ArrayList;
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //task 1.
        int[] arrayInts = new int[20];
        System.out.println("The elements of the Array are: ");
        for (int i = 0; i < arrayInts.length; i++) {
            arrayInts[i] = i * 5;
        }
        for (int i = 0; i < arrayInts.length; i++) {
            System.out.println(arrayInts[i]);
        }

        System.out.println("\n");

        //task 2
        int sum = 0;
        for (int i = 0; i < arrayInts.length; i++) {
            sum += arrayInts[i];
        }
        int averageValue = sum / arrayInts.length;
        System.out.printf("The average value is : %d%n", averageValue);


        //task 3
        System.out.println("Enter the elements of the array one by one:");

        int[] array = new int[6];
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

            if (array[i] % 2 == 0) {
                evenSum = evenSum + array[i];
            } else if (array[i] % 2 != 0) {
                oddSum = oddSum + array[i];
            }

        }
        System.out.println("The sum of even numbers is " + evenSum + " add the sum of odd number is " + oddSum + ".");

        //task 4
        System.out.println("Please enter parameter ");
        int N = scanner.nextInt();
        printNumbersParameterN(N);
        printNumbersNotDivisibleThreeSeven(N);
        printSumFibonacci(N);
    }

    public static void printNumbersParameterN(int N) {
        System.out.println("The entered numbers from 1 to N are :");
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

    }

    public static void printNumbersNotDivisibleThreeSeven(int N) {
        System.out.println("The not divisible by 3 and 7 numbers are: ");
        for (int i = 0; i <= N; i++) {
            if (!(i % 3 == 0) && !(i % 7 == 0)) {
                System.out.println(i);
            }
        }

    }

    public static void printSumFibonacci(int N) {
        int sum = 0;
        int[] numFibonacci = new int[N];
        numFibonacci[0] = 0;
        numFibonacci[1] = 1;
        for (int i = 2; i < numFibonacci.length; i++) {
            numFibonacci[i] = numFibonacci[i - 1] + numFibonacci[i - 2];
        }
        for (int i = 0; i < numFibonacci.length; i++) {
            sum += numFibonacci[i];
        }
        System.out.println("The sum of the Fibonacci numbers till N is " + sum);
    }

}


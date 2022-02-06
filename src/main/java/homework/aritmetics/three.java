package homework.aritmetics;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {

        //1.Determine which number is the largest.
        int firstNumber = 9;
        int secondNumber = 6;
        int threeNumber = 3;

        int result = firstNumber >>= secondNumber >>= threeNumber;
        System.out.println("The largest number is: " + result);

        System.out.println("==================================");

        //2.Perimeter and face.
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int _result = a * b;

        System.out.print("Face is: " + _result);
        System.out.println("\n");


        System.out.println("===========================");

        Scanner _scanner = new Scanner(System.in);

        int $result = 2*(a + b);

        System.out.println("Perimeter is:" + $result);
        System.out.println("\n");

        System.out.println("===========================");


        //3.The number is oven or add?
        Scanner $scanner = new Scanner(System.in);
        int number = $scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        System.out.println("=================================");

        //4.From 1 to 7 and the day of the week.
        Scanner console = new Scanner(System.in);
        int day = Integer.parseInt(console.nextLine());

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;



    }


    }

}

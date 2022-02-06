package homework.aritmetics;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String name = "Iva";
        String switchName = ("Your name is <myname> ");
        System.out.println(switchName.replace("<myname>", name));

        //Compare two strings to see if they are the same
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter second string:");
        String secondString = scanner.nextLine();

        if (firstString.equals(secondString)) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");


            //How many words are in a string?
            System.out.println("Enter some text and I will count the words in it:");
            String toBeCounted = scanner.nextLine();
            String[] stringArray = toBeCounted.split(" ");
            System.out.println("\"" + toBeCounted + "\"" + " has " + stringArray.length + "words.");

            //Combine two strings into one and write it in the console.

            String String1 = "My name ";
            String String2 = "is ";
            String String3 = "Iva.";
            System.out.println(String1 + String2 + String3);


        }

    }


}

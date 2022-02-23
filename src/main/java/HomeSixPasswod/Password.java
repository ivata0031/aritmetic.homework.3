package HomeSixPasswod;

import java.util.Random;
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 8;
        int Strength = 2;
        System.out.println(Password(length, Strength));
    }

    static char[] Password(int len, int Strength) {
        System.out.println("Generating password... ");
        System.out.println("===============================");
        System.out.print("Your password is : ");

        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String values = Capital_chars + Small_chars;
        String values1 = Capital_chars + Small_chars + numbers;
        String values2 = Capital_chars + Small_chars + numbers + symbols;

        Random rn = new Random();

        char[] password = new char[len];
        if (Strength == 1) {
            for (int i = 0; i < len; i++) {
                password[i] = values.charAt(rn.nextInt(values.length()));
            }
            return password;

        } else if (Strength == 2) {
            for (int i = 0; i < len; i++) {
                password[i] = values1.charAt(rn.nextInt(values1.length()));
            }
            return password;
        } else if (Strength == 3) {
            for (int i = 0; i < len; i++) {
                password[i] = values2.charAt(rn.nextInt(values2.length()));
            }
            return password;
        }
        return password;
    }

    //Enter your password
    public static void checkPassword(String pwd) {
        int letterCount = 0;
        int digitCount = 0;
        int symbolCount = 0;
        if (pwd.length() >= 7) {
            for (int i = 0; i < pwd.length(); i++) {
                if (Character.isLetter(pwd.charAt(i))) {
                    letterCount++;
                }
                if (Character.isDigit(pwd.charAt(i))) {
                    digitCount++;
                }
                if ((pwd.contains("!")) || (pwd.contains("&")) || (pwd.contains("@"))) {
                    symbolCount++;
                }
            }
            if ((letterCount == 0) && (digitCount > 0) && (symbolCount > 0)) {
                System.out.println("Valid password!");
            } else {
                if (letterCount == 0) {
                    System.out.println("Password must contain letter!");
                }
                if (symbolCount == 0) {
                    System.out.println("Password must contain digit!");
                }
                if (symbolCount == 0) {
                    System.out.println("Password must contain symbol ! & @ * / .");
                }
            }
        } else {
            System.out.println("Password must be minimum 8 symbols!");

        }
    }
}

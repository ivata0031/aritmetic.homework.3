package HomeSixPasswod;

import java.util.Scanner;

public class CheckPassword {
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

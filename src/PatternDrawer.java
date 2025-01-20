package src;

import java.util.EnumMap;
import java.util.Scanner;

public class PatternDrawer {
    private final static String[] patterns = {
        "RightAngledTriangle",
        "SquareWithHollowCenter",
        "Diamond",
        "LeftAngledTriangle",
        "HollowSquare",
        "Pyramid",
        "ReversePyramid",
        "RectangleWithHollowCenter"
    };

    /*
     **
     ***
     ****
     *****/
    private static StringBuilder drawRightAngledTriangle(byte rows) {
        StringBuilder pattern = new StringBuilder();
        for (byte row = 1; row <= rows ; row++) {
            for (int col = 1; col <= row; col++) {
                pattern.append("*");
                if (col == row) {
                    pattern.append("\n");
                }
            }
        }
        return pattern;
    }

    /*****
     *   *
     *   *
     *   *
     *****/
    private static StringBuilder drawSquareWithHollowCenter(byte rows) {
        StringBuilder pattern = new StringBuilder();
        for (byte row = 1; row <= rows ; row++) {
            for (int col = 1; col <= rows; col++) {
                if (row == 1 || row == rows) {
                    pattern.append("*");
                }
                else {
                    if (col == 1 || col == rows) {
                        pattern.append("*");
                    }
                    else {
                        pattern.append(" ");
                    }
                }
                if (col == rows) {
                    pattern.append("\n");
                }
            }
        }
        return pattern;
    }

    public static void main(String[] args) {
        System.out.println("\uD83C\uDF1F Welcome to the Java Pattern Drawing Program!");
        Scanner sc = new Scanner(System.in);

        byte choice = -1;
        while (choice != 0){
            System.out.println("Enter the number corresponding to your choice: ");
            for (int i = 0; i < patterns.length ; i++) {
                System.out.printf("%d) %s%n", i+1 , patterns[i]);
            }
            System.out.println("0) Exit");

            try {
                choice = Byte.parseByte(sc.nextLine());
            } catch (Exception e) {
                //TODO: make it a func
                System.out.println("❌ Invalid choice!");
                continue;
            }
            if (choice > 0
                    && choice < patterns.length) {
                //TODO: call implementations
                if (choice == 1) {
                    System.out.println("Enter a number of rows between 1 and 127");
                    try {
                        byte rows = Byte.parseByte(sc.nextLine());
                        if (rows <= 0) {
                            throw new UnsupportedOperationException("Rows should be between 1 and 127");
                        }
                        StringBuilder pattern = drawRightAngledTriangle(rows);
                        System.out.println(pattern.toString());
                    }
                    catch (Exception e) {
                        if (e instanceof UnsupportedOperationException) {
                            System.out.printf("Error: %s%n", e.getLocalizedMessage());
                        }
                        else {
                            System.out.println("❌ Invalid choice!");
                        }
                        continue;
                    }
                }
                else if (choice == 2) {
                    System.out.println("Enter a number of rows between 2 and 127");
                    try {
                        byte rows = Byte.parseByte(sc.nextLine());
                        if (rows <= 0) {
                            throw new UnsupportedOperationException("Rows should be between 2 and 127");
                        }
                        StringBuilder pattern = drawSquareWithHollowCenter(rows);
                        System.out.println(pattern.toString());
                    }
                    catch (Exception e) {
                        if (e instanceof UnsupportedOperationException) {
                            System.out.printf("Error: %s%n", e.getLocalizedMessage());
                        }
                        else {
                            System.out.println("❌ Invalid choice!");
                        }
                        continue;
                    }
                }
                else {
                    System.out.println("Coming soon");
                }
                System.out.println("1) New pattern");
                System.out.println("0) Exit");
                byte newChoice = 0;
                try {
                    newChoice = Byte.parseByte(sc.nextLine());
                }
                catch(Exception e) {
                    newChoice = -1;
                }
                while (newChoice != 0 && newChoice != 1) {
                    System.out.println("❌ Invalid choice!");
                    System.out.println("1) New pattern");
                    System.out.println("0) Exit");
                    try {
                        newChoice = Byte.parseByte(sc.nextLine());
                    }
                    catch (Exception e) {
                        System.out.println("❌ Invalid choice!");
                        continue;
                    }
                }
                if (newChoice == 1) {
                    continue;
                }
                else if (newChoice == 0) { // in case of new options
                    return;
                }
            }
           else if (choice < 0 || choice > patterns.length) {
              // obfuscate checks
                System.out.println("❌ Invalid choice!");
            }
        }
    }
}
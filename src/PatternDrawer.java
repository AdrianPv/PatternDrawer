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


    public static void main(String[] args) {
        System.out.println("\uD83C\uDF1F Welcome to the Java Pattern Drawing Program!");
        System.out.println("Enter the number corresponding to your choice: ");
        for (int i = 0; i < patterns.length ; i++) {
            System.out.printf("%d) %s%n", i+1 , patterns[i]);
        }
        System.out.println("0) Exit");

        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                // TODO: split messages by exception types
                System.out.println("❌ Invalid choice!");
                continue;
            }
            if (choice == 0) {
                //return;
            }
           else if (choice < 0 || choice > patterns.length) {
              // obfuscate checks
                System.out.println("❌ Invalid choice!");
            }
            else {  // choice is valid
              //TODO: call implementations
                System.out.printf("Your choice is %d) %s%n", choice, patterns[choice - 1]);
                return;
            }
        }
    }
}
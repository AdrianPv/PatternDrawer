package src;

import java.util.EnumMap;
import java.util.Scanner;

public class PatternDrawer {
    private static enum Pattern {
        RightAngledTriangle,
        SquareWithHollowCenter,
        Diamond,
        LeftAngledTriangle,
        HollowSquare,
        Pyramid,
        ReversePyramid,
        RectangleWithHollowCenter
    }


    public static void main(String[] args) {
        final EnumMap<Pattern, Integer> patternIndexes = new EnumMap<Pattern, Integer>(Pattern.class);
        patternIndexes.put(Pattern.RightAngledTriangle, 1);
        patternIndexes.put(Pattern.SquareWithHollowCenter, 2);
        patternIndexes.put(Pattern.Diamond, 3);
        patternIndexes.put(Pattern.LeftAngledTriangle, 4);
        patternIndexes.put(Pattern.HollowSquare, 5);
        patternIndexes.put(Pattern.Pyramid, 6);
        patternIndexes.put(Pattern.ReversePyramid, 7);
        patternIndexes.put(Pattern.RectangleWithHollowCenter, 8);

        System.out.println("\uD83C\uDF1F Welcome to the Java Pattern Drawing Program!");
        System.out.println("Enter the number corresponding to your choice: ");
        for (Pattern pat : Pattern.values()) {
            System.out.printf("%d) %s%n", patternIndexes.get(pat), pat);
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
           else if (choice < 0 || !patternIndexes.containsValue(choice)) {
              // obfuscate checks
                System.out.println("❌ Invalid choice!");
            }
            else {  // choice is valid
              //TODO: call implementations
                System.out.printf("Your choice is %d) %s%n", choice, patternIndexes.getClass());
            }
        }
    }
}
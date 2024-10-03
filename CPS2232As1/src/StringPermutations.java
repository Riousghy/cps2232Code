import java.util.Scanner;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Permutations of '" + input + "':");
        displayPermutation(input);
    }

    public static void displayPermutation(String s) {
        displayPermutation("", s);
    }

    public static void displayPermutation(String s1, String s2) {
        if (s2.isEmpty()) {
            System.out.println(s1);
        } else {
            for (int i = 0; i < s2.length(); i++) {
                char charAtIndex = s2.charAt(i);
                String newS1 = s1 + charAtIndex;
                String newS2 = s2.substring(0, i) + s2.substring(i + 1);
                displayPermutation(newS1, newS2);
            }
        }
    }
}


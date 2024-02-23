package AssignmentFeb20;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String 1 : ");
        String input1 = scanner.nextLine();
        System.out.print("Enter the String 2 : ");
        String input2 = scanner.nextLine();
        char[] arr1 = input1.toLowerCase().toCharArray();
        char[] arr2 = input2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram strings");
        } else {
            System.out.println("Not Anagram strings");
        }
    }
}

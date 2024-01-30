package AssignmentJan29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        Map<Character, Integer> hmap = new HashMap<>();
        hmap.put('I', 1);
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);
        hmap.put('M', 1000);

        int decimalNumber = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = hmap.get(currentChar);

            if (currentValue < prevValue) {
                decimalNumber -= currentValue;
            } else {
                decimalNumber += currentValue;
            }

            prevValue = currentValue;
        }
        System.out.println("Decimal Number is: " + decimalNumber);
    }
}

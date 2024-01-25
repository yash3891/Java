package AssignmentJan25;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
        scanner.close();
    }
}

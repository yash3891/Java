package AssignmentJan25;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Month : ");
        int monthNum = scanner.nextInt();
        if (monthNum >= 1 && monthNum <= 12) {
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            System.out.println("Month: " + months[monthNum - 1]);
        } else {
            System.out.println("Invalid month number");
        }
        scanner.close();
    }

}

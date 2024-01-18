import java.util.Scanner;
import java.lang.Math;
public class ProgramJan17Assignment {
    public static void main(String [] args) {
        int inches;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inches : ");
        inches = sc.nextInt();
        double meters = (double)(inches)/12.0;
        System.out.println(inches + " inches equals to " + meters + " meters.");
        System.out.println("Enter a int to calculate its square, cube and fourth power:");
        double number = sc.nextDouble();
        System.out.println("Square of given number is : " + Math.pow(number, 2));
        System.out.println("Cube of given number is : " + Math.pow(number, 3));
        System.out.println("Fourth power of given number is : " + Math.pow(number, 4));
        System.out.println("Enter any four integers to check they are equal or not : ");
        int firstNumber, secondNumber, thirdNumber, fourthNumber;
        firstNumber = sc.nextInt();
        secondNumber = sc.nextInt();
        thirdNumber = sc.nextInt();
        fourthNumber = sc.nextInt();
        if((firstNumber == secondNumber) && (secondNumber == thirdNumber) && (thirdNumber == fourthNumber)) {
            System.out.println("Numbers are equal!");
        }
        else {
            System.out.println("Numbers are not equal!");
        }
        System.out.println("Enter a integer to check given number is even or odd : ");
        int number1 = sc.nextInt();
        System.out.println("The given number is " + ((number1 % 2 == 0) ? "Even" : "Odd"));

    }
}

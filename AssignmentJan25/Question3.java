package AssignmentJan25;

public class Question3 {
    public static void main(String[] args) {
        int sumEven = 0, sumOdd = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Sum of first 10 even numbers: " + sumEven);
        System.out.println("Sum of first 10 odd numbers: " + sumOdd);
    }
}

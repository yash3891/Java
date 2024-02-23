package AssignmentFeb20;

public class SumOfDigits {
    public static void main(String[] args) {
        String input1 = "123";
        String input2 = "678";
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < input1.length(); i++) {
            if (Character.isDigit(input1.charAt(i))) {
                sum1 += Character.getNumericValue(input1.charAt(i));
            }
        }
        for (int i = 0; i < input2.length(); i++) {
            if (Character.isDigit(input2.charAt(i))) {
                sum2 += Character.getNumericValue(input2.charAt(i));
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}

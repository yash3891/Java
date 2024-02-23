package AssignmentFeb20;

public class IsPalindrome {
    public static void main(String[] args) {
        String input1 = "java";
        String input2 = "eye";
        int left = 0, right = input1.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (input1.charAt(left) != input1.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        left = 0;
        right = input2.length() - 1;
        isPalindrome = true;
        while (left < right) {
            if (input2.charAt(left) != input2.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}

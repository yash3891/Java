public class ProgramJan16Assignment {
    public static void main(String [] args) {
        int number1 = 23, number2 = 45;
        System.out.println("The two numbers "+number1 +" and " + number2 + " are equal is " + (number2 == number1));
        int a = 50, b = 70;
        System.out.println(a + " < " + 50 + " is " + (a < 50));
        System.out.println(a + " < " + b + " is " + (a < b));
        int subject1Marks = 78, subject2Marks = 45, subject3Marks = 62;
        int totalMarks = (subject1Marks + subject2Marks + subject3Marks);
        System.out.println("Total marks of Robert in 3 subjects are : " + totalMarks);
        System.out.println("Percentage for Robert is: " + (totalMarks/3) + "%");
    }
}

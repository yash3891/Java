package AssignmentFeb20;

public class CountWords {
    public static void main(String[] args) {
        String input = "my favourite cricker is MS.Dhoni";
        String[] words = input.trim().split("\\s+");
        System.out.println(words.length);
    }
}

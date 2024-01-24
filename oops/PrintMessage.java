package oops;

public class PrintMessage {
    public void methodToPrintMessage() {
        System.out.println("Hello, this is a message from the MessagePrinter class.");
    }

    public static void main(String[] args) {
        PrintMessage messagePrinter = new PrintMessage();
        messagePrinter.methodToPrintMessage();
    }
}
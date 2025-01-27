import java.util.Scanner;

class GreetingMessage {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = myScanner.nextLine();
        System.out.println("Your age: ");
        int age = myScanner.nextInt();
        System.out.println("Hello " +name + "! I heard you're " +age + " years old!");
    }
}
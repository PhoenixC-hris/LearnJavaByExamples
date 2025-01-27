import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = myScanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }
    }
}
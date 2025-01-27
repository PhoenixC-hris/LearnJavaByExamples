import java.util.Scanner;

class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("First number: ");
        int num1 = myScanner.nextInt();
        System.out.println("Second number: ");
        int num2 = myScanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of the two given numbers is " +sum);
    }
}

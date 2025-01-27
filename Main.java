import java.util.Scanner;

class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("You are asked to give three numbers: ");
        int num1 = myScanner.nextInt();
        int num2 = myScanner.nextInt();
        int num3 = myScanner.nextInt();
        double average = (num1 + num2 + num3)/3.0;
        System.out.println("The average of the given numbers is: " +average);
    }
}
import java.util.Scanner;

class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Current age: ");
        int currentAge = myScanner.nextInt();
        int ageInFiveYears = currentAge + 5;
        System.out.println("Your age in five years is: " +ageInFiveYears);
    }
}
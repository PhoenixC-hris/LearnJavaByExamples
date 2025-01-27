import java.util.Scanner;

class UserAge {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int userAge = myScanner.nextInt();
        if (userAge >= 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are a minor!");
        }
    }
}

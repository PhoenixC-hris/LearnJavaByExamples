import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please give me your score: ");
        int score = myScanner.nextInt();
        if (score >= 90) {
            System.out.println("Your grade is A");
        } else if (score >=80) {
            System.out.println("Your grade is B");
        } else if (score >=70) {
            System.out.println("Your grade is C");
        } else if (score >=60) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("You've got a F!");
        }
    }
}
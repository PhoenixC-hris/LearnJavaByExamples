import java.util.Scanner;

class NumberInWords {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1-9: ");
        int numberUser = myScanner.nextInt();
        if (numberUser == 1) {
            System.out.println(numberUser+"=> One");
        }
        if (numberUser == 2) {
            System.out.println(numberUser+ " => Two");
        }
        if (numberUser == 3) {
            System.out.println(numberUser+" => Three");
        }
        if (numberUser == 4) {
            System.out.println(numberUser+ " => Four");
        }
        if (numberUser == 5) {
            System.out.println(numberUser+ " => Five");
        }
        if (numberUser == 6) {
            System.out.println(numberUser+ " => Six");
        }
        if (numberUser == 7) {
            System.out.println(numberUser+ " => Seven");
        }
        if (numberUser == 8) {
            System.out.println(numberUser+ " => Eight");
        }
        if (numberUser == 9) {
            System.out.println(numberUser+ " => Nine");
        }
    }
}
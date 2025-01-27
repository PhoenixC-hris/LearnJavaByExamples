import java.util.Scanner;

class TemperatureConverter {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me the temperature: ");
        int temperatureCelsius = myScanner.nextInt();
        int temperatureFahrenheit = temperatureCelsius * 9/5 + 32;
        System.out.println("The temperature in Fahrenheit is: " +temperatureFahrenheit + "F");
    }
}

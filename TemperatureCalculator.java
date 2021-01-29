import java.util.Scanner;

public class TemperatureCalculator {
    public static void main(String[] args) {
        Scanner myTemperature = new Scanner(System.in);
        System.out.println(
                "This is a Temperature Calculator, press 0 to calculate Celsius to Fahrenheit and press 1 to calculate Fahrenheit to Celsius.");
        int myTemp = myTemperature.nextInt();
        switch (myTemp) {
            case 0:
                Scanner myCelsiusScanner = new Scanner(System.in);
                System.out.println("Enter Degrees Celsius to get Fahrenheit:");
                int myCelsius = myCelsiusScanner.nextInt();
                double temp = ((myCelsius * 1.8) + 32);
                System.out.println(myCelsius + " °C is " + temp + " °F.");
                break;
            case 1:
                Scanner myFahrenheitScanner = new Scanner(System.in);
                System.out.println("Enter Degrees Fahrenheit to get Celsius:");
                int myFahrenheit = myFahrenheitScanner.nextInt();
                double temp2 = ((myFahrenheit - 32) * 1.8);
                System.out.println(myFahrenheit + " °F is " + temp2 + " °C.");
                break;
            // Written By Avaneesh Joshi
        }

    }
}

import java.util.Scanner;

public class celsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Fahrenheit to Celsius");
        System.out.println("2.Celsius to Fahrenheit");
        System.out.println("0.Exit");


        int choice = scanner.nextInt();
        switch (choice){
            case 2:
                double fahrenheit = scanner.nextDouble();
                System.out.println( celsiusToFahrenheit(fahrenheit));
                break;
            case 1:
                double celsius =scanner.nextDouble();
                System.out.println(fahrenheitToCelsius(celsius));
                break;
            case 0:
                System.exit(0);
        }


    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}

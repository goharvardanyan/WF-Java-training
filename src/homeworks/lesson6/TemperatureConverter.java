package homeworks.lesson6;

public class TemperatureConverter {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertFahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double convertCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double convertKelvinToFahrenheit(double kelvin) {
        return kelvin * 9 / 5 - 459.67;
    }

    public static double convertKelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}

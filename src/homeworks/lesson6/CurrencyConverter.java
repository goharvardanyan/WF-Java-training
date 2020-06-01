package homeworks.lesson6;

public class CurrencyConverter {

    public static double convertDollarToEuro(double dollar) {
        return dollar * 0.9;
    }

    public static double convertDollarToDram(double dollar) {
        return dollar * 482;
    }

    public static double convertDollarToRuble(double dollar) {
        return dollar * 70.38;
    }

    public static double convertEuroToDollar(double euro) {
        return euro * 1.11;
    }

    public static double convertEuroToDram(double euro) {
        return euro * 537.62;
    }

    public static double convertEuroToRuble(double euro) {
        return euro * 78.23;
    }

    public static double convertDramToDollar(double dram) {
        return dram * 0.0021;
    }

    public static double convertDramToEuro(double dram) {
        return dram * 0.0019;
    }

    public static double convertDramToRuble(double dram) {
        return dram * 0.15;
    }

    public static double convertRubleToDollar(double ruble) {
        return ruble * 0.014;
    }

    public static double convertRubleToDram(double ruble) {
        return ruble * 6.89;
    }

    public static double convertRubleToEuro(double ruble) {
        return ruble * 0.013;
    }
}

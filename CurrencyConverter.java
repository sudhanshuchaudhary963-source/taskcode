package taskjava;

import java.util.Scanner;

public class CurrencyConverter {
    public static double convert(String from, String to, double amount) {
        double rate = 1.0;

        if (from.equals("USD") && to.equals("INR")) rate = 74.5;
        else if (from.equals("INR") && to.equals("USD")) rate = 0.013;
        else if (from.equals("USD") && to.equals("EUR")) rate = 0.85;
        else if (from.equals("EUR") && to.equals("USD")) rate = 1.18;
        else if (from.equals("INR") && to.equals("EUR")) rate = 0.011;
        else if (from.equals("EUR") && to.equals("INR")) rate = 88.5;

        return amount * rate;
    }
    public static String getCurrencySymbol(String currency) {
        switch (currency) {
            case "USD": return "$";
            case "INR": return "₹";
            case "EUR": return "€";
            default: return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base currency (USD, INR, EUR): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter target currency (USD, INR, EUR): ");
        String toCurrency = scanner.next().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double result = convert(fromCurrency, toCurrency, amount);
        String symbol = getCurrencySymbol(toCurrency);
        System.out.printf("Converted Amount: %s%.2f%n", symbol, result);



        scanner.close();
    }
}

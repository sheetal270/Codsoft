package Task5.java;

import java.util.Scanner;

class CurrencyConverter {
    double exchangeRate;

    public void fetchExchangeRate(String baseCurrency, String targetCurrency) {
       
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            exchangeRate = 0.85; // 1 USD to EUR
        } else if (baseCurrency.equals("USD") && targetCurrency.equals("GBP")) {
            exchangeRate = 0.73; // 1 USD to GBP
        } else {
            System.out.println("Exchange rate not available for selected currencies.");
            exchangeRate = 0;
        }
    }

    public double convert(double amount) {
        return amount * exchangeRate;
    }
}

public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base currency (e.g., USD): ");
        String baseCurrency = scanner.nextLine();

        System.out.print("Enter target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine();

        CurrencyConverter converter = new CurrencyConverter();
        converter.fetchExchangeRate(baseCurrency, targetCurrency);

        if (converter.exchangeRate != 0) {
            System.out.print("Enter amount to convert: ");
            double amount = scanner.nextDouble();

            double convertedAmount = converter.convert(amount);

            System.out.printf("%.2f %s = %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);
        }

        scanner.close();
    }
}

package com.deepan;

import java.util.Scanner;

public class CurrencyConverterApp {

    public static void main(String[] args) {
        System.out.println("Currency Conversion using Exchange Rate API");
        System.out.println("================================================");

        Scanner scanner = new Scanner(System.in);
        String from = scanner.next();
        String to = scanner.next();
        String amount = scanner.next();

//        get the conversion amount using the exchange rate api with the above inputs
//        https://api.apilayer.com/exchangerates_data/convert?to=INR&from=SGD&amount=100

        System.out.println(from);
        System.out.println(to);
        System.out.println(amount);

    }
}

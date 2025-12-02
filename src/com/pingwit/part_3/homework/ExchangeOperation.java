package com.pingwit.part_3.homework;

public class ExchangeOperation {
    static void main(String[] args) {

        // Сумма в долларах, которую хотим обменять
        int dollars = 100;

        // ID валюты, в которую хотим перевести
        // Например: 1 = евро, 2 = рубли, 3 = фунты
        int currencyId = 6;

        // Курс валют (пример)
        double euroRate = 0.91;   // 1 USD = 0.91 EUR
        double rubleRate = 75.0;  // 1 USD = 75 RUB
        double poundRate = 0.78;  // 1 USD = 0.78 GBP

        // Используем switch по currencyId
        switch (currencyId) {
            case 1 -> System.out.println("Сумма в евро: " + (dollars * euroRate));
            case 2 -> System.out.println("Сумма в рублях: " + (dollars * rubleRate));
            case 3 -> System.out.println("Сумма в фунтах: " + (dollars * poundRate));
            default -> System.out.println("Ваш банк не может обменять на данную валюту.");
        }
    }
}

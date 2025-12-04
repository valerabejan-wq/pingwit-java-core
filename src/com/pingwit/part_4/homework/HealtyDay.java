package com.pingwit.part_4.homework;
//Task 1
public class HealtyDay { // Очень клевое название класса, но с опечаткой. Правильно HealthyDay - пропущена буква "h"
    static void main(String[] args) {
        int dayFirst = 10;
        double dailyProgress = 1.1;
        double total = dayFirst;
        int i = 1;
        do {
            System.out.println("Day " + i + ": " + total);
            total *= dailyProgress;
            i++;
        } while (i <= 10);
    }
}

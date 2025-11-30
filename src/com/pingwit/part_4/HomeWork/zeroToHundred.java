package com.pingwit.part_4.HomeWork;
//Task8
public class zeroToHundred {
    static void main(String[] args) {
        int sumX = 0;
        int sumY = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sumX += i;
            }

        }
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sumY += i;
            }

        }
        System.out.println("Сумма чётных чисел: " + sumX);
        System.out.println("Сумма НЕ чётных чисел: " + sumY);
        System.out.println("Cумма всех чисел: " + (sumX + sumY));
    }
}

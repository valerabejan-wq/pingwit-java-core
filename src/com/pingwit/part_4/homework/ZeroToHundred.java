package com.pingwit.part_4.HomeWork;// HomeWork поменяй на homework, в данном случае можно без рефакторинга, просто исправь название пакета
//Task8
public class ZeroToHundred {
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
        // Cумма - IntellijIdea подчеркивает зеленым и на первый взгляд ошибки нету, но первая буква "С" написана латиницей, а не кириллицей, поменяй раскладку на русскую и попробуй заменить букву "С"
        System.out.println("Cумма всех чисел: " + (sumX + sumY));
    }
}

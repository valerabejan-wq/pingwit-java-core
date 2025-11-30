package com.pingwit.part_4.HomeWork;

//2. Таблица умножения:
//Вывести таблицу умножения на 7 от 1 до 10 (например, 7 x 1 = 7).
public class dop2 {
    static void main(String[] args) {
        int x = 7;
        int i = 1; // начинаем с 1

        do {
            System.out.println(x + " x " + i + " = " + (x * i));
            i++;
        } while (i <= 10);
    }
}

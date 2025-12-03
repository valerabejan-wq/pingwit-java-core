package com.pingwit.part_4.homework;

public class Dop2 {
    static void main(String[] args) {
        int x = 7;
        int i = 1; // начинаем с 1

        do {
            System.out.println(x + " x " + i + " = " + (x * i));
            i++;
        } while (i <= 10);
    }
}

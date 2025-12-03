package com.pingwit.Part_55.homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер бабочки: ");
        int n = sc.nextInt();

        // Верхняя часть
        for (int i = 1; i <= n; i++) {

            // Левое крыло
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Пробелы
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Правое крыло
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Нижняя часть
        for (int i = n; i >= 1; i--) {

            // Левое крыло
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Пробелы
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Правое крыло
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}


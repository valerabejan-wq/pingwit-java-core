package com.pingwit.part_4.homework;
//Task 7
public class Sum {
    static void main(String[] args) {
        int i = 1;
        int sum = 0;  //

        do {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
            i++;
        } while (i <= 99);

        System.out.println("Сумма нечётных чисел от 1 до 99: " + sum);
    }
}
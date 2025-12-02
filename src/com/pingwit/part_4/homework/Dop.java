package com.pingwit.part_4.HomeWork;
//1. Числа кратные 5:
//Вывести все числа от 1 до 100, которые делятся на 5, и посчитать их сумму.
public class Dop {
    static void main(String[] args) {
        int sum =0;
        for (int i = 0; i <= 100; i++ ) {
            if(i % 5 == 0) {
                System.out.println(i);
                sum += i;

            }
        }
        System.out.println("Сумма чисел :" + sum );
    }



}

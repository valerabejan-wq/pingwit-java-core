package com.pingwit.part_4.homework;
//1. Числа кратные 5:
// public class Dop {
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

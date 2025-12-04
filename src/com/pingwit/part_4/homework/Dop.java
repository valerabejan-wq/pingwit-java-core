package com.pingwit.part_4.homework;
//1. Числа кратные 5:
// public class Dop {
// в строке выше у тебя комментарий перед названием класса, из-за этого код не компилируется, поэтому даже другие программы не запустятся. Делай коммит+пуш только когда код компилируется и работает, даже если он полностью не готов.
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

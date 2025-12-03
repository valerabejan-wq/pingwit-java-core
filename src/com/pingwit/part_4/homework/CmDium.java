package com.pingwit.part_4.homework;
//Task5
public class CmDium {
    public static void main(String[] args) {
        double dium = 2.54;

        for (int i = 1; i <= 20; i++) {
            double cm = i * dium;
            System.out.println(i + " Dium" + " -> " + cm + " cm");
        }
    }
}
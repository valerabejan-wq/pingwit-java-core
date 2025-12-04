package com.pingwit.part_4.homework;
//Task5
public class CmDium { // -> CmInch
    public static void main(String[] args) {
        double dium = 2.54; // dium -> inch. Названия переменных пишем на английском всегда

        for (int i = 1; i <= 20; i++) {
            double cm = i * dium;
            System.out.println(i + " Dium" + " -> " + cm + " cm"); // Dium -> Inch
        }
    }
}
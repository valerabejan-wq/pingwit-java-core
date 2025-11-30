package com.pingwit.part_4.HomeWork;
//Task1
public class SportWeek {
    static void main(String[] args) {
        double dayDistance = 10; // первый день
        double factor = 1.1;     // увеличение на 10%
        double total = dayDistance;

        System.out.println("Day 1: " + dayDistance + " km");

        for (int i = 2; i <= 7; i++) {
            dayDistance *= factor;
            total += dayDistance;
            System.out.println("Day " + i + ": " + dayDistance + " km");
        }

        System.out.println("Total for 7 days: " + total + " km");
    }
}

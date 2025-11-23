package com.pingwit.part_3;

import java.io.PrintStream;
import java.util.Scanner;

public class ScannerEXE {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.next();

        System.out.println("How old r u?");
        int age = scanner.nextInt();

        System.out.println("Enter your name: " + name);
        System.out.println("How old r u: " + age);
    }
}

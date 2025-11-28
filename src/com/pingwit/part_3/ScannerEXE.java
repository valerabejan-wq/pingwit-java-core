package com.pingwit.part_3;

// если идея выделяет что-то серым цветом - значит это не используется, import java.io.PrintStream; можно удалить
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerEXE { // Стиль названия классов - PascalCase / UpperCamelCase, т.е. каждое слово с большой буквы, а затем маленькие буквы, поэтому ScannerEXE -> ScannerExe, а лучше ScannerExample
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

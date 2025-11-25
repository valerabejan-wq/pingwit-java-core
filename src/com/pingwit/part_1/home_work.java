package com.pingwit.part_1;

//1. отформатируй код
//2. Классы с задачами должны называться Task1, Task2 и тд, либо и даже лучше давать информативные названия классов, например HelloWorld, SumCalculator и тд
//3. внутри каждой части (part_1, part_2 и тд) должен быть свой пакет (папка) homework, в котором уже будут классы с задачами

public class home_work { // Название класса необходимо поменять на HomeWork (первая буква заглавная тоже) через refactor -> rename
    static void main(String[] args) {
       //Task 4
        System.out.println("Hellow world");
        System.out.println("Helow " + args[0]);
        System.out.println("Hellow " + args[0] + args[1]);
        System.out.println("Hellow " + args[0] + "  " + args[1]);

        //Task 5
        int num_1 = 10;
        int num_2 = 15;
        int sum = num_1 + num_2;
        System.out.println(sum);

        //Task 6
        System.out.println(num_1*num_2);

        //Task 7
        System.out.println(8%3);

        //Task 8 gpt помог =)
        String str1 = "Hellow ";
        String str2 = "world!";
        String resoult = str1 + str2;
        System.out.println(resoult);

    }
}

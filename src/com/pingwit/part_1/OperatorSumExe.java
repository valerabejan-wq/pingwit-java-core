package com.pingwit.part_1;

public class OperatorSumExe {
   public static void main(String[] args) {

        byte num_1 = 50;
        byte num_2 = 50;

        int num_3 = 100;
        int num_4 = 100;

        short num_5 = 200;
        short num_6 = 200;

        long longNum = 300;

        double doubleNum = 100.0;

        byte sum =(byte) (num_1 + num_2);
        System.out.println(sum);

        int shortSum = num_3 + num_4;
        System.out.println(shortSum);

        int intSum = num_5 + num_6;
        System.out.println(intSum);

        long longSum = longNum + intSum;
        System.out.println(longSum);

        double doubleSum = doubleNum + longNum;
        System.out.println(doubleNum);

        long result = num_5 - longNum;
        System.out.println(result);


    }
}

package com.pingwit.part_1;

public class TypeCastingExe {
    public static void main (String [] args) {
       //+
        byte myByte = 127;
        int myInt = myByte;
        System.out.println(myByte);

        //
        double myDouble = myInt;
        System.out.println(myDouble);

        //-
        int highInt =200;
        byte highByte = (byte) highInt;
        System.out.println(highByte);

        //

        double highDouble = 100.9;
        highInt = (int) highDouble;
        System.out.println(highInt);

    }
}

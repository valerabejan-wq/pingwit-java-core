package com.pingwit.part_1;

public class PrimitivisExe {
    public static void main(String[] args) {
        /*
        byte 2^8 -> 256/2 -> -128 +0 +127
        short 2^16 ->65536 -> 32768 +32767
        char 2^32 -> 0 65536
        int 2^32
        long 2^64
         */

        /*
        float ->min=1.4E-45 max=3.4028235E38 -> 1.4*10^-45
        double > min=4. 9E-324 max=1.7976931348623157E308
         */

        /*
        boolean -> true/false
         */
        byte myByte = 110;
        System.out.println(myByte);
        int myInt = 220;
        System.out.print(myInt);
        char myChar = 1200;
        System.out.println(myChar);
        char myCharSymbol = 'm';
        System.out.println(myCharSymbol);
        char myCharUnicod = '\u77F4';
        System.out.println(myCharUnicod);
        boolean myBollean = true;
        System.out.println(myBollean);



    }
}
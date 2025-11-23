package com.pingwit.part_3;

public class IfExe {
    static void main(String[] args) {
        int x = 100;
        int y = 200;

        if(x==y) System.out.println("Heloow for If");
        System.out.println("Happy end");

        System.out.println("===");

        boolean resoult = x < y;

        if(resoult){
            System.out.println("GG");
        } else if (x > y){
            System.out.println("x > y");
        } else {
            System.out.println("x < y");
        }


        String resoultMessage = x >0 ?  "x<0" : "x>0";
        System.out.println(resoultMessage);

    }
}

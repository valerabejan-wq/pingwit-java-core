package com.pingwit.part_3;

// отформатируй код
public class IfExe { // Если Exe имелось ввиду Example, то лучше назвать IfExample
    static void main(String[] args) {
        int x = 100;
        int y = 200;

        if(x==y) System.out.println("Heloow for If");
        System.out.println("Happy end");

        System.out.println("===");

        // Опечатка в названии переменной resoult -> result
        boolean resoult = x < y;

        if(resoult){
            System.out.println("GG");
        } else if (x > y){
            System.out.println("x > y");
        } else {
            System.out.println("x < y");
        }
// лишняя строка, давай удалим

        //Опечатка в названии переменной resoultMessage -> resultMessage
        String resoultMessage = x >0 ?  "x<0" : "x>0";
        System.out.println(resoultMessage);
// лишняя строка, давай удалим
    }
}

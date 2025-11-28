package com.pingwit.part_4;

public class breakExe {
    static void main(String[] args) {
        for( int i = 0; i < 10 ; i++ ) {
            if (i % 2 != 0) {
                continue; // продолжает печатать
                // brake - остонавливает пррограму на первои потому что не совпадает с уловтем
            }
                System.out.println(i);
            }
        }
    }

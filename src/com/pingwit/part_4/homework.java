package com.pingwit.part_4;

public class homework {
    static void main() {

        int x = 10; // 1 day

        double y = 1.1; // 10% for total by day

        double z = ( x * y );
        System.out.println("Total for day 2 :" + z + "km");

        double c = ( z * y);
        System.out.println("day 3 :" + c + "km");

        double v = ( c * y);
        System.out.println("day 4 :" + v + "km");

        double b = ( v * y);
        System.out.println("day 5 :" + b + "km");

        double n = ( b * y);
        System.out.println("day 6 :" + n + "km");

        double m = ( n * y);
        System.out.println("day 7 :" + m + "km");

        double resoult = (z+c+v+b+n+m+x);
        System.out.println("Total for 7 day : " + resoult + "km");












    }
}

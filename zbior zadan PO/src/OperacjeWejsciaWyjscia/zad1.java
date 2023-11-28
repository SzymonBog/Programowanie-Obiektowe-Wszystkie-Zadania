package OperacjeWejsciaWyjscia;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        double x;
        double y;

        Scanner input = new Scanner(System.in);
        System.out.println("x = ");
        x = input.nextDouble();
        System.out.println("y = ");
        y = input.nextDouble();

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
    }
}

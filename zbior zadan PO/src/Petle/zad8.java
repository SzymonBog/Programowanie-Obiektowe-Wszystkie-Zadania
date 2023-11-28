package Petle;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, q;
        System.out.println("a1 = ");
        a = input.nextDouble();
        System.out.println("q = ");
        q = input.nextDouble();
        for (int i=0; i<10; i++){
            System.out.println(a);
            a = a * q;
        }
    }
}

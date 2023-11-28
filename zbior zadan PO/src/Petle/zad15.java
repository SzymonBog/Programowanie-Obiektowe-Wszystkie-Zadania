package Petle;

import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a0 = 4;
        int qa = -2;
        int b0 = 2;
        int qb = 3;
        int c0 = 8;
        int rc = -5;
        for (int i=0; i<n; i++) {
            a0 *= qa;
            b0 *= qb;
            c0 += rc;
        }
        System.out.println("a" + n + " = " + a0 + "\nb" + n + " = " + b0 + "\nc" + n + " = " + c0);
    }
}

package OperacjeWejsciaWyjscia;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, a, b, c;
        System.out.println("x = ");
        x = input.nextDouble();
        System.out.println("a = ");
        a = input.nextDouble();
        System.out.println("b = ");
        b = input.nextDouble();
        System.out.println("c = ");
        c = input.nextDouble();
        System.out.println("a + b - x^2 = " + ((a + b) + -x*x));
        System.out.println("(a + b)/(c - 3) = " + ((a + b)/(c - 3)));
        System.out.println("3(4 + 5a)(b - c^3) = " + (3*(4 + 5*a)*(b - c*c*c)));
    }
}

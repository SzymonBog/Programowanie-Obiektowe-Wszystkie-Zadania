package Instrukcje.Warunkowe;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, delta, x0, x1, x2;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        delta = b*b - 4*a*c;
        if (delta < 0){
            System.out.println("Delta mniejsza od zera: brak rozwiązań");
        } else if (delta == 0) {
            x0 = (-b)/(2*a);
            System.out.println("Delta równa zero: x0 = " + x0);
        } else {
            x1 = (-b - Math.sqrt(delta))/2*a;
            x2 = (-b + Math.sqrt(delta))/2*a;
            System.out.println("Delta większa od zera: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}

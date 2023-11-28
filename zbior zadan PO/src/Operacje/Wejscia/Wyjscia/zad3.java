package Operacje.Wejscia.Wyjscia;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;
        double d;
        // input with ',' not '.'
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();

        System.out.println(a+b+c+d);
    }
}

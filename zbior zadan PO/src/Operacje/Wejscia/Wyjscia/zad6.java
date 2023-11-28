package Operacje.Wejscia.Wyjscia;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, d;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        double wa = a, wb = b, wc = c, wd = d;
        wa += 4;
        wb -= a;
        wc *= (2-4*a);
        wd /= (4-a*a);
        System.out.println("a + 4 = " + wa);
        System.out.println("b - a = " + wb);
        System.out.println("c(2 - 4a) = " + wc);
        System.out.println("d/(4 - a^2) = " + wd);
    }
}

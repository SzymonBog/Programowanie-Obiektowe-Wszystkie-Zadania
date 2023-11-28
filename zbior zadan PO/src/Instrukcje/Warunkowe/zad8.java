package Instrukcje.Warunkowe;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dochod = input.nextDouble();
        double podatek;

        if (dochod <= 85528){
            podatek = dochod * 0.18;
        } else {
            podatek = 14839.02 + 0.32 * (dochod-85528);
        }
        System.out.println(podatek);
    }
}

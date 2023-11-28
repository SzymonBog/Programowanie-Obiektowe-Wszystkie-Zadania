package Instrukcje.Warunkowe;

import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        if (1000 > liczba && liczba > 99){
            int ls = liczba/100;
            int ld = (liczba - ls*100)/10;
            int lj = liczba - ls*100 - ld*10;
            if (ls == lj){
                System.out.println("Liczba " + liczba + " jest palindromem");
            } else {
                System.out.println("Liczba " + liczba + " nie jest palindromem");
            }
        } else {
            System.out.println("Liczba ma być 3-cyfrowa");
        }
    }
}

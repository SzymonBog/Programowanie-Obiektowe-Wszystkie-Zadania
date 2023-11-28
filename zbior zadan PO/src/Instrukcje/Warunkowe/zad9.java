package Instrukcje.Warunkowe;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] dniWMies = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] dniWMiesPrzes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Podaj dzien: ");
        int dzien = input.nextInt();
        System.out.println("Podaj miesiac: ");
        int mies = input.nextInt();
        System.out.println("Podaj rok: ");
        int rok = input.nextInt();

        if (mies >= 1 && mies <= 12) {
            if (rokPrzestepny(rok) == true) {
                if (dzien <= dniWMiesPrzes[mies-1] && dzien >= 1){
                    System.out.println("Poprawna data");
                } else {
                    System.out.println("Błędna data");
                }
            } else {
                if (dzien <= dniWMies[mies-1] && dzien >= 1){
                    System.out.println("Poprawna data");
                } else {
                    System.out.println("Błędna data");
                }
            }
        } else {
            System.out.println("Błędna data");
        }
    }

    public static boolean rokPrzestepny(int rok){
        boolean przestepny;
        if (rok % 400 == 0){
            przestepny = true;
        } else if (rok % 4 == 0 && rok % 100 != 0) {
            przestepny = true;
        } else {
            przestepny = false;
        }
        return przestepny;
    }
}

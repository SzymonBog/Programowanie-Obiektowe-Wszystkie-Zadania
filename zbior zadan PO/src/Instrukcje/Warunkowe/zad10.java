package Instrukcje.Warunkowe;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int godz, min, sec;
        godz = input.nextInt();
        min = input.nextInt();
        sec = input.nextInt();

        if (godz >= 0 && godz <= 23 && min >= 0 && min <= 59 && sec >= 0 && sec <= 59){
            System.out.println("Poprawna godzina!");
        } else {
            System.out.println("Błędna godzina");
        }
    }
}

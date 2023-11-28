package Instrukcje.Warunkowe;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dzien = input.nextInt();
        if (dzien >= 1 && dzien <= 7){
            switch (dzien) {
                case 1 -> System.out.println("Poniedziałek");
                case 2 -> System.out.println("Wtorek");
                case 3 -> System.out.println("Środa");
                case 4 -> System.out.println("Czwartek");
                case 5 -> System.out.println("Piątek");
                case 6 -> System.out.println("Sobota");
                case 7 -> System.out.println("Niedziela");
            }
        } else {
            System.out.println("Niepoprawny numer dnia tygodnia");
        }
    }
}

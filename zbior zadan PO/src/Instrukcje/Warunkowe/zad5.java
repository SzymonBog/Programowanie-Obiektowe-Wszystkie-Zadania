package Instrukcje.Warunkowe;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wiek = input.nextInt();
        if (wiek < 18){
            System.out.println("Jesteś niepełnoletni");
        } else if (wiek >= 65) {
            System.out.println("Jesteś emerytem");
        } else {
            System.out.println("Jesteś dorosły");
        }
    }
}

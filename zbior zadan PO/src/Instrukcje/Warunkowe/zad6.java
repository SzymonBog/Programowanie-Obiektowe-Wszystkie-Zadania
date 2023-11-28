package Instrukcje.Warunkowe;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rok = input.nextInt();
        if (rok % 400 == 0){
            System.out.println("Rok przestępny");
        } else if (rok % 4 == 0 && rok % 100 != 0) {
            System.out.println("Rok przestępny");
        } else {
            System.out.println("Rok nie jest przestępny");
        }
    }
}

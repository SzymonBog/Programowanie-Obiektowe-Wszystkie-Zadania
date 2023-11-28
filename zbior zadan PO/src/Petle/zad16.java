package Petle;

import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = 0;
        int a;
        while (suma <= 100) {
            a = input.nextInt();
            suma += a;
        }
        System.out.println(suma);
    }
}

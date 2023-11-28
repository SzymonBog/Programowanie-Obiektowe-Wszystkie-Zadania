package Petle;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int suma=0;
        for (int i=1; i<=n; i++){
            suma += (i*i);
        }
        System.out.println(suma);
    }
}

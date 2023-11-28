package Petle;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wynik = 0;
        int i = input.nextInt();
        String j = String.valueOf(i);
        int l = j.length();
        int ten = 1;
        for (int p=1; p<l; p++){
            ten*=10;
        }
        int liczba;
        for (int p=0; p<l; p++){
            liczba = i/ten;
            wynik += liczba;
            i=i-liczba*ten;
            ten /= 10;
        }
        System.out.println(wynik);
    }
}

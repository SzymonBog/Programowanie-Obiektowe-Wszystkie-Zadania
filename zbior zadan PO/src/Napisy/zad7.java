package Napisy;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String napis = s.next();
        beginingEqualsEnd(napis);
    }

    public static void beginingEqualsEnd(String napis){
        if (napis.charAt(0) == napis.charAt(napis.length()-1)){
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }
    }
}

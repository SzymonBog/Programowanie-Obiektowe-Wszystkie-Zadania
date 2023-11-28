package Petle;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        boolean pier = true;
        for (int i=2; i<l; i++){
            if(l%i==0){
                pier = false;
                break;
            }
        }
        if (l == 1){
            pier=false;
        } else if (l == 2) {
            pier=true;
        }
        if(pier){
            System.out.println(l + " jest liczba pierwsza");
        } else {
            System.out.println(l + " nie jest liczba pierwsza");
        }
    }
}

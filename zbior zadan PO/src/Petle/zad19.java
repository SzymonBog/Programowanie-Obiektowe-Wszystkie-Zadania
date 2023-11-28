package Petle;

import java.util.Scanner;

public class zad19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int suma = 0;
        boolean ok = true;
        for(int i=0; i<5; i++){
            a = input.nextInt();
            if (a<0){
                ok = false;
                break;
            } else {
                suma += a;
            }
        }
        if (ok) {
            System.out.println(suma);
        }
    }
}

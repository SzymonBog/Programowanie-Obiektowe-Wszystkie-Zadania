package Petle;

import java.util.Scanner;

public class zad24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int najw = -1;
        int najm = -1;
        int a = 0;
        a = input.nextInt();
        if (a>=0){
            najm = a;
            najw = a;
        }
        while (a>=0) {
            a = input.nextInt();
            if (a>=0){
                if (a>najw){
                    najw = a;
                } else if (a<najm) {
                    najm = a;
                }
            }
        }
        if(najm>=0 && najw>=0){
            System.out.println(najm + " " + najw);
        }
    }
}

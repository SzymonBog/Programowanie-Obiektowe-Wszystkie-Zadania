package Petle;

import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int limit = 1;
        String s;
        for (int i=1; i<=a; i++){
            s = "";
            for (int j=1; j<=limit; j++){
                s += (j + " ");
            }
            System.out.println(s);
            limit+=1;
        }
    }
}

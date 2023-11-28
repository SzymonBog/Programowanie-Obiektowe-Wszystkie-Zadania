package Petle;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a >= 0){
            String s = String.valueOf(a);
            int l = s.length();
            String s1 = "";
            for(int i=l-1; i>=0; i--){
                s1 += s.charAt(i);
            }
            int a1 = Integer.valueOf(s1);
            System.out.println(a1);
        } else {
            System.out.println("Tylko dodatnie");
        }
    }
}

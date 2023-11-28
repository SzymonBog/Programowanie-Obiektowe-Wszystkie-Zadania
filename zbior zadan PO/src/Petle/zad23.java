package Petle;

import java.util.Scanner;

public class zad23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String s = String.valueOf(a);
        int ile=0;
        if (a >= 0){
            for (int i=0; i<s.length(); i++) {
                String s1 = "";
                s1 += s.charAt(i);
                int ok = Integer.valueOf(s1);
                if(ok==7){
                    ile += 1;
                }
            }
        }
        System.out.println(ile);
    }
}

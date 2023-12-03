package Napisy;

import java.util.Random;

public class zad1 {
    public static void main(String[] args) {
        String str = "Ala ma kota";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){
        String rev = "";
        for (int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }
}

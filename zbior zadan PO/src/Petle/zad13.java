package Petle;

import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        int ab = a;
        int bb = b;
        while(true) {
            if (a < b) {
                a += ab;
            } else if (b < a) {
                b += bb;
            } else {
                System.out.println(a);
                break;
            }
        }
    }
}

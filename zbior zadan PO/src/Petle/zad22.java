package Petle;

import java.util.Scanner;

public class zad22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        // print x where b>x>=a && x%c==0
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        for (int i=a; i<b; i++){
            if (i%c==0){
                System.out.println(i);
            }
        }
    }
}

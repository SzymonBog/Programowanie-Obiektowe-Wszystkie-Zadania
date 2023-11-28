package InstrukcjeWarunkowe;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        int a1, b1, c1;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a >= b && a >= c){
            if (b >= c){
                a1 = a;
                b1 = b;
                c1 = c;
            } else {
                a1 = a;
                b1 = c;
                c1 = b;
            }
        } else if (b >= a && b >= c) {
            if (a >= c){
                a1 = b;
                b1 = a;
                c1 = c;
            } else {
                a1 = b;
                b1 = c;
                c1 = a;
            }
        } else {
            if (b >= a){
                a1 = c;
                b1 = b;
                c1 = a;
            } else {
                a1 = c;
                b1 = a;
                c1 = b;
            }
        }
        System.out.println(c1 + " " + b1 + " " + a1);
    }
}

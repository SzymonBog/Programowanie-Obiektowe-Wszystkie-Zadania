package InstrukcjeWarunkowe;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a >= b && a >= c){
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

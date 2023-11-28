package InstrukcjeWarunkowe;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        boolean mozna = false;
        if (a*a + b*b == c*c){
            mozna = true;
        } else if (a*a + c*c == b*b) {
            mozna = true;
        } else if (b*b + c*c == a*a) {
            mozna = true;
        }
        if (mozna) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}

package FunkcjeMetody;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(jestDoskonala(n));
    }

    public static boolean jestDoskonala(int n){
        boolean doskonala = false;
        int suma = 0;
        for (int i=1; i<=n; i++){
            if(n==1) {
                if (n % i == 0) {
                    suma += i;
                }
            } else {
                if (i != n) {
                    if (n % i == 0) {
                        suma += i;
                    }
                }
            }
        }
        if (suma == n){
            doskonala = true;
        }
        return doskonala;
    }
}

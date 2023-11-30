package FunkcjeMetody;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(szereg(n));

    }

    public static int szereg(int n){
        int wynik = 0;
        if (n >= 0){
            for (int i=1; i<=n; i++){
                wynik += i*(Math.pow((-1), i+1));
            }
        }
        return wynik;
    }
}

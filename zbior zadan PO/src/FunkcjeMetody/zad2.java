package FunkcjeMetody;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(pierwszaMniejsza(n));
    }

    public static int pierwszaMniejsza(int n){
        int liczba = -1;
        for (int i=2; i<n; i++){
            boolean ok = true;
            for(int j=1; j<=i; j++){
                if (i%j==0 && (j != 1 && j != i)){
                    ok = false;
                }
            }
            if(ok==true){
                liczba = i;
            }
        }
        return liczba;
    }
}

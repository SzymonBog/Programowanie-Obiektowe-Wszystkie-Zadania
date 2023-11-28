package Petle;


import java.util.Scanner;

public class zad17 { // nwm czy dobrze
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n = ");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.println("a: \n");
        for (int i=0; i<n; i++){
            a[i] = input.nextInt();
        }

        int ksil = 1;
        int trzyk = 1;
        int ile = 0;

        for (int k=1; k<=n; k++){
            ksil *= k;
            trzyk *= 3;

            if(a[k-1] < ksil && a[k-1] > trzyk){
                ile++;
            }
        }
        System.out.println(ile);
    }
}

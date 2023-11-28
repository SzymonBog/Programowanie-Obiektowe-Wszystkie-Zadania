package Petle;

import java.util.Scanner;

public class zad20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m, ntemp, mtemp;
        n = input.nextInt();
        m = input.nextInt();
        ntemp = n;
        mtemp = m;
        if (ntemp > mtemp){
            n = mtemp;
            m = ntemp;
        }
        int iloczyn = 1;
        for (int i=n; i<=m; i++){
            iloczyn *= i;
        }
        System.out.println(iloczyn);
    }
}

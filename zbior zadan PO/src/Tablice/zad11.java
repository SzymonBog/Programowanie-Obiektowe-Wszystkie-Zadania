package Tablice;

import java.util.Random;

public class zad11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[50];
        for (int i=0; i<50; i++){
            arr[i] = rand.nextInt(0, 100);
        }
        int count = 0;
        for (int i=0; i<50; i++){
            boolean ok = true;
            for (int j=1; j<=i; j++){
                if(arr[i]%j==0 && j!=1 && j!=arr[i]){
                    ok=false;
                    break;
                }
            }
            if (ok){
                count+=1;
            }
        }
        System.out.println("Ilość: " + count);
    }
}

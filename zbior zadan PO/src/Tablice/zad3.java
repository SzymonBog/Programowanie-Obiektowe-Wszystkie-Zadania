package Tablice;

import java.util.Random;

public class zad3 { //zastosowano rand z ograniczeniem
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[15];
        for (int i=0; i<15; i++){
            arr[i] = rand.nextInt(0, 10000);
        }
        int najm = arr[0];
        int najw = arr[0];
        for (int i=1; i<15; i++){
            if(arr[i]<najm){
                najm = arr[i];
            } else if (arr[i]>najw) {
                najw = arr[i];
            }
        }
        System.out.println("Wartości: najmniejsza= " + najm + ", największa: " + najw);
    }
}

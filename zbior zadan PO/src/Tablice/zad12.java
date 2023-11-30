package Tablice;

import java.util.Random;

public class zad12 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[15];
        for (int i=0; i<15; i++){
            arr[i] = rand.nextInt(0, 1000);
        }
        int suma = 0;
        for (int i=0; i<15; i++){
            if(arr[i]%3==0){
                suma += arr[i];
            }
        }
        System.out.println(suma);
    }
}

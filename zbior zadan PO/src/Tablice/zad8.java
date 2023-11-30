package Tablice;

import java.util.Random;

public class zad8 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] arr = new double[10];
        for (int i=0; i<10; i++){
            arr[i] = rand.nextDouble(0, 1);
        }
        double suma = 0;
        for(int i=0; i<10; i++){
            if (arr[i]>0.5){
                suma+=arr[i];
            }
        }
        System.out.println(suma);
    }
}

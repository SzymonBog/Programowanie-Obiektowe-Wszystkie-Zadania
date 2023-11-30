package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad6 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] arr = new double[10];
        for (int i=0; i<10; i++){
            arr[i] = rand.nextDouble(0, 20);
        }
        double sumap = 0;

        for (int i=0; i<10; i++){
            sumap+=arr[i];
        }
        System.out.println(sumap + "\n" + Arrays.toString(arr));
    }
}

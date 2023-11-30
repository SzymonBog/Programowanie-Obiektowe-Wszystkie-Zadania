package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i=0; i<10; i++){
            arr[i] = rand.nextInt(0, 101);
        }
        int sumap = 0;

        for (int i=0; i<10; i++){
            if(arr[i]%2==0){
                sumap+=arr[i];
            }
        }
        System.out.println(sumap + "\n" + Arrays.toString(arr));
    }
}

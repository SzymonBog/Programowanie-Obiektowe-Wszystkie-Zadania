package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[30];
        for (int i=0; i<30; i++){
            arr[i] = rand.nextInt(0, 20);
        }
        int count = 0;
        for (int i=0; i<30; i++){
            for(int j=0; j<i; j++){
                if(j*j==i){
                    count += 1;
                }
            }
        }
        System.out.println("Ilość: " + count);
        System.out.println(Arrays.toString(arr));
    }
}

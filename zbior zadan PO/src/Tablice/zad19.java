package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad19 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(1, 10);
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i]= rand.nextInt(-80, 123);
        }
        System.out.println("Org: " + Arrays.toString(arr));
        System.out.println("Copy: " + Arrays.toString(copyArray(arr)));
    }

    public static int[] copyArray(int[] arr){
        int[] arr2 = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        return arr2;
    }
}

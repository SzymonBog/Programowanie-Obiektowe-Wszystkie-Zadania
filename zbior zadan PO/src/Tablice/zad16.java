package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad16 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(1, 30);
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i]= rand.nextInt(-100, 101);
        }
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr){
        int[] arr2 = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            arr2[i] = arr[i];
        }

        for (int i=0; i<arr.length; i++){
            arr[i] = arr2[arr.length-1-i];
        }
    }
}

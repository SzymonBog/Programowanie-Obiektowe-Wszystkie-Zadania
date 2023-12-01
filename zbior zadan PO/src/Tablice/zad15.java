package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad15 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(1, 30);
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i]= rand.nextInt(-100, 101);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    public static int[] reverseArray(int[] arr){
        int[] arr2 = new int[arr.length];
        int j=0;
        if (arr.length > 0){
            for (int i=arr.length-1; i>=0; i--){
                arr2[j] = arr[i];
                j++;
            }
        }
        return arr2;
    }
}

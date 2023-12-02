package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad23 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 3;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(-80, 123);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextInt(-80, 123);
        }

        System.out.println("Arr1: " + Arrays.toString(arr1));
        System.out.println("Arr2: " + Arrays.toString(arr2));
        System.out.println("Merge: " + Arrays.toString(mergeArrays(arr1, arr2)));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int len=arr1.length+arr2.length;
        int[] arr = new int[len];
        int j=0;
        for(int i=0; i<arr1.length; i++){
            arr[j]=arr1[i];
            j++;
        }
        for(int i=0; i<arr2.length; i++){
            arr[j]=arr2[i];
            j++;
        }
        return arr;
    }
}

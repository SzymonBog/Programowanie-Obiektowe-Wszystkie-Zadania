package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad26 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 3;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-80, 123);
        }

        System.out.println("Arr: " + Arrays.toString(arr));
        System.out.println("Filled: " + Arrays.toString(fillArray(arr, 5)));
    }

    public static int[] fillArray(int[] arr, int a) {
        Arrays.fill(arr, a);
        return arr;
    }
}

package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad24 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 3;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-80, 123);
        }

        System.out.println("Arr1: " + Arrays.toString(arr));
        System.out.println("In order: " + Arrays.toString(sortArray(arr)));
    }

    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}

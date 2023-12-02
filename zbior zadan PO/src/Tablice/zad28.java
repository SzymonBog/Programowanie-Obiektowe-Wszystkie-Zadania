package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad28 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 3;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-80, 123);
        }

        System.out.println("Arr1: " + Arrays.toString(arr));
        System.out.println("In order: " + Arrays.toString(copyArray(arr)));
    }

    public static int[] copyArray(int[] arr) {
        int [] arrCopy = Arrays.copyOf(arr, arr.length);
        return arrCopy;
    }
}

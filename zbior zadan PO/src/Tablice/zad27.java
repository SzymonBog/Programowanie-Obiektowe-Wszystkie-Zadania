package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad27 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 3;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-80, 123);
        }

        System.out.println("Arr: " + printArray(arr));
    }

    public static String printArray(int[] arr) {
        String text = Arrays.toString(arr);
        return text;
    }
}

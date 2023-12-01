package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad20 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(1, 10);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-80, 123);
        }
        System.out.println("Org: " + Arrays.toString(arr));
        System.out.println("Reversed copy: " + Arrays.toString(copyArrayReverse(arr)));
    }

    public static int[] copyArrayReverse(int[] arr) {
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        for (int i=0; i<arr.length; i++){
            arr[i] = arr2[arr.length-1-i];
        }
        return arr;
    }
}

package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad29 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 5;
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble(-80, 123);
        }

        System.out.println("Arr1: " + Arrays.toString(arr));
        System.out.println("In order: " + Arrays.toString(sortArray(arr)));
    }

    public static double[] sortArray(double[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}

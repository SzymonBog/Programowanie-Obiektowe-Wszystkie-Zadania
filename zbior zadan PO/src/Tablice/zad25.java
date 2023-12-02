package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad25 {
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
        System.out.println("Are equal: : " + checkEquality(arr1, arr2));

        int[] arr3 = {1,2,3};
        int[] arr4 = {1,2,3};
        System.out.println("Arr3: " + Arrays.toString(arr3));
        System.out.println("Arr4: " + Arrays.toString(arr4));
        System.out.println("Are equal: : " + checkEquality(arr3, arr4));
    }

    public static boolean checkEquality(int[] arr1, int[] arr2) {
        boolean are = true;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
               if (arr2[i] != arr1[i]){
                   are = false;
                   break;
               }
            }
        } else {
            are = false;
        }
        return are;
    }
}

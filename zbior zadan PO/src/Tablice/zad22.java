package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad22 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-80, 123);
        }
        int a = rand.nextInt(0,4);
        int b = rand.nextInt(5, 7);
        System.out.println("Org: " + Arrays.toString(arr));
        System.out.println("a="+a+" b="+b);
        System.out.println("Cut copy: " + Arrays.toString(copyArrayWithIndex(arr, a, b)));
    }

    public static int[] copyArrayWithIndex(int[] arr, int a, int b) {
        int len=b-a+1;
        int[] arr2 = new int[len];
        int j=0;
        for(int i=a; i<=b; i++){
            arr2[j]=arr[i];
            j++;
        }
        return arr2;
    }
}

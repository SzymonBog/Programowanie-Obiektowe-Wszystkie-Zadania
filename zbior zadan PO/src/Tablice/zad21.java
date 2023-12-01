package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad21 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(1, 10);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-80, 123);
        }
        System.out.println("Org: " + Arrays.toString(arr));
        System.out.println("Reversed copy: " + Arrays.toString(copyArrayEven(arr)));

        int[] arr2 = {1,3,9,11,13};
        System.out.println("Org: " + Arrays.toString(arr2));
        System.out.println("Reversed copy: " + Arrays.toString(copyArrayEven(arr2)));
    }

    public static int[] copyArrayEven(int[] arr) {
        int len=0;
        int[] arr2;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0 || arr[i]%(-2)==0){
                len+=1;
            }
        }
        if (len==0){
            arr2 = new int[0];
        } else {
            arr2 = new int[len];
            int j=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]%2==0 || arr[i]%(-2)==0) {
                    arr2[j] = arr[i];
                    j++;
                }
            }
        }
        return arr2;
    }
}

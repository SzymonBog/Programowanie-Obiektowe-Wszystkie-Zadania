package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad17 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(1, 30);
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i]= rand.nextInt(-10, 10);
        }
        System.out.println(countZeros(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int countZeros(int[] arr){
        int count = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count+=1;
            }
        }
        return count;
    }
}

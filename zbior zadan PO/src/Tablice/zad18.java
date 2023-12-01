package Tablice;

import java.util.Arrays;
import java.util.Random;

public class zad18 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(1, 30);
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i]= rand.nextInt(-10, 10);
        }
        System.out.println(oddElementsSum(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int oddElementsSum(int[] arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]%2==1 || arr[i]%2==(-1)){
                sum+=arr[i];
            }
        }
        return sum;
    }
}

package Tablice;

import java.util.Random;

public class zad13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(1, 30);
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i]= rand.nextInt(-100, 101);
        }
        System.out.println(minimumValue(arr));
    }

    public static int minimumValue(int[] arr){
        int najm = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<najm){
                najm = arr[i];
            }
        }
        return najm;
    }
}

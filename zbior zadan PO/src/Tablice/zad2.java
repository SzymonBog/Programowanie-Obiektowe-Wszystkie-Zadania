package Tablice;

import java.util.Random;

public class zad2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        int[] arr = new int[20];
        for (int i=0; i<20; i++){
            arr[i] = rand.nextInt(1, 101);
        }
        for (int i=0; i<20; i++){
            sum += arr[i];
        }
        System.out.println(sum/20);
    }
}

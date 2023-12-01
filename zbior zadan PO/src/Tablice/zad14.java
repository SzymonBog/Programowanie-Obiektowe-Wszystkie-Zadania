package Tablice;

import java.util.Random;

public class zad14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(1, 30);
        double[] arr = new double[n];
        for (int i=0; i<arr.length; i++){
            arr[i]= rand.nextDouble(-100, 101);
        }
        System.out.println(average(arr));
    }

    public static double average(double[] arr){
        double average = 0;
        if (arr.length > 0){
            for (int i=0; i<arr.length; i++){
                average += arr[i];
            }
            average = average/arr.length;
        }
        return average;
    }
}

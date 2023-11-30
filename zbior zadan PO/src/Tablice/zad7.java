package Tablice;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.SortedSet;

public class zad7 {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] arr = new double[20];
        for (int i=0; i<20; i++){
            arr[i] = rand.nextDouble(0, 20);
        }
        double sumap = 0;
        double sr;
        double mediana;
        Arrays.sort(arr);
        mediana = (arr[10]+arr[9])/2;

        for (int i=0; i<20; i++){
            sumap+=arr[i];
        }
        sr = sumap/20;
        System.out.println(sr + "\n" + mediana);
    }
}

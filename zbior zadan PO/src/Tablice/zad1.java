package Tablice;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<10; i++){
            System.out.println("arr["+ i +"] = ");
            arr[i] = input.nextInt();
        }
        for (int i=9; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}

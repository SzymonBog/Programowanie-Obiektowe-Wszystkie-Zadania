package Tablice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zad4 { // ograniczono zakres
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[30];
        for (int i=0; i<30; i++){
            arr[i] = rand.nextInt(0, 10);
        }
        Scanner input = new Scanner(System.in);
        int tried = input.nextInt();
        int count = 0;
        for (int i=0; i<30; i++){
            if (tried == arr[i]){
                count += 1;
            }
        }
        if(count==0){
            System.out.println("Liczba " + tried + " nie występuje w tablicy\nTablica: " + Arrays.toString(arr));
        } else {
            System.out.println("Liczba " + tried + " występuje w tablicy " + count + " razy\nTablica: " + Arrays.toString(arr));
        }
    }
}

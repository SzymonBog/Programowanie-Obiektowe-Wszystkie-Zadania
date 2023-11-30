package Tablice;

import java.util.Random;

public class zad9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[20];
        for (int i=0; i<20; i++){
            arr[i] = rand.nextInt(0, 20);
        }
        int countN = 0;
        int countP = 0;
        for (int i=0; i<20; i++){
            if(arr[i]%2==0){
                countP += 1;
            } else {
                countN += 1;
            }
        }
        System.out.println("Ilość:\nparzystych: " + countP + "\nnieparzystych: " + countN);
    }
}

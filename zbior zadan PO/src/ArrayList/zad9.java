package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class zad9 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int l = rand.nextInt(5, 11);
        for(int i=0; i<l; i++){
            arr.add(rand.nextInt(0,10));
        }
        System.out.println(arr);
        System.out.println(oddElementsSum(arr));
    }

    public static int oddElementsSum(ArrayList<Integer> arr){
        int suma = 0;
        for (int i=arr.size()-1; i>=0; i--){
            if (arr.get(i) % 2 == 1 || arr.get(i) % 2 == -1){
                suma += arr.get(i);
            }
        }
        return suma;
    }
}

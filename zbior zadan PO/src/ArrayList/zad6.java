package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class zad6 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int l = rand.nextInt(5, 11);
        for(int i=0; i<l; i++){
            arr.add(rand.nextInt(0,100));
        }
        System.out.println(arr);
        arr = reverseArray(arr);
        System.out.println(arr);
    }

    public static ArrayList<Integer> reverseArray(ArrayList<Integer> arr){
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i=arr.size()-1; i>=0; i--){
            arr1.add(arr.get(i));
        }
        return arr1;
    }
}

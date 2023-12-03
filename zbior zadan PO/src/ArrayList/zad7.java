package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class zad7 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int l = rand.nextInt(5, 11);
        for(int i=0; i<l; i++){
            arr.add(rand.nextInt(0,100));
        }
        System.out.println(arr);
        reverseArray(arr);
        System.out.println(arr);
    }

    public static void reverseArray(ArrayList<Integer> arr){
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i=0; i<arr.size(); i++){
            arr1.add(arr.get(i));
        }

        for (int i=arr1.size()-1; i>=0; i--){
            arr.set(arr.size()-1-i, arr1.get(i));
        }
    }
}

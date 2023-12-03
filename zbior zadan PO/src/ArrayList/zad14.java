package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class zad14 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int l = rand.nextInt(3, 5);
        for(int i=0; i<l; i++){
            arr1.add(rand.nextInt(0,100));
        }
        for (int i=0; i<l; i++){
            arr2.add(rand.nextInt(0, 100));
        }
        System.out.println(arr1);
        System.out.println(arr2);
        ArrayList<Integer> arr = mergeArrays(arr1, arr2);
        System.out.println(arr);
    }

    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i<arr1.size(); i++){
            arr.add(arr1.get(i));
        }
        for (int i=0; i<arr2.size(); i++){
            arr.add(arr2.get(i));
        }
        return arr;
    }
}

package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class zad13 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int l = rand.nextInt(5, 11);
        for(int i=0; i<l; i++){
            arr.add(rand.nextInt(0,100));
        }
        System.out.println(arr);
        ArrayList<Integer> arr1 = copyArrayWithIndex(arr, 1, 3);
        System.out.println(arr1);
    }

    public static ArrayList<Integer> copyArrayWithIndex(ArrayList<Integer> arr, int a, int b){
        ArrayList<Integer> arrCopy = new ArrayList<>();
        for (int i=a; i<=b; i++){
            arrCopy.add(arr.get(i));
        }
        return arrCopy;
    }
}

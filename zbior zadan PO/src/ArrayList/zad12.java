package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class zad12 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int l = rand.nextInt(5, 11);
        for(int i=0; i<l; i++){
            arr.add(rand.nextInt(0,100));
        }
        System.out.println(arr);
        ArrayList<Integer> arr1 = copyArrayEven(arr);
        System.out.println(arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println(arr2);
    }

    public static ArrayList<Integer> copyArrayEven(ArrayList<Integer> arr){
        ArrayList<Integer> arrCopy = new ArrayList<>();
        for (int i=0; i<arr.size(); i++){
            if(arr.get(i) % 2 == 0) {
                arrCopy.add(arr.get(i));
            }
        }
        return arrCopy;
    }
}

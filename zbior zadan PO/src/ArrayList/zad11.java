package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class zad11 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int l = rand.nextInt(5, 11);
        for(int i=0; i<l; i++){
            arr.add(rand.nextInt(0,100));
        }
        System.out.println(arr);
        ArrayList<Integer> arr1 = copyArrayReverse(arr);
        System.out.println(arr1);
    }

    public static ArrayList<Integer> copyArrayReverse(ArrayList<Integer> arr){
        ArrayList<Integer> arrCopyRev = new ArrayList<>();
        for (int i=arr.size()-1; i>=0; i--){
            arrCopyRev.add(arr.get(i));
        }
        return arrCopyRev;
    }
}

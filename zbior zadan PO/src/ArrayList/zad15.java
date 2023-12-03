package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class zad15 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int l = rand.nextInt(5, 11);
        for(int i=0; i<l; i++){
            arr.add(rand.nextInt(0,100));
        }
        System.out.println(arr);
        ArrayList<Integer> arr1 = sortArray(arr);
        System.out.println(arr1);
    }

    public static ArrayList<Integer> sortArray(ArrayList<Integer> arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i=0; i<arr.size(); i++){
            arr1.add(arr.get(i));
        }

        int n = arr1.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr1.get(j) > arr1.get(j + 1)) {
                    // Swap elements if they are in the wrong order
                    int temp = arr1.get(j);
                    arr1.set(j, arr1.get(j + 1));
                    arr1.set(j + 1, temp);
                }
            }
        }
        return arr1;
    }
}

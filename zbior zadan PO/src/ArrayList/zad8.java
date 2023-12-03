package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class zad8 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int l = rand.nextInt(5, 11);
        for(int i=0; i<l; i++){
            arr.add(rand.nextInt(0,2));
        }
        System.out.println(countZeros(arr));
        System.out.println(arr);
    }

    public static int countZeros(ArrayList<Integer> arr){
        int zeros = 0;
        for (int i=arr.size()-1; i>=0; i--){
            if (arr.get(i) == 0){
                zeros += 1;
            }
        }
        return zeros;
    }
}

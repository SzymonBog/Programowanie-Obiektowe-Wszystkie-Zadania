package ArrayList;

import java.util.ArrayList;

public class zad3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<10; i++){
            arr.add(10-i);
        }
        System.out.println(minimumValue(arr));
    }

    public static int minimumValue(ArrayList arr){
        int minimum = (int) arr.get(0);
        System.out.println(arr.size());
        for(int i=0; i<arr.size(); i++){
            if((int) arr.get(i)<minimum){
                minimum = (int) arr.get(i);
            }
        }
        return minimum;
    }
}

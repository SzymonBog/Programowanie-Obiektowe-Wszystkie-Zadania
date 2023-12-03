package ArrayList;

import java.util.ArrayList;

public class zad4 {
    public static void main(String[] args) {
        ArrayList<Float> arr = new ArrayList<>();
        for(int i=0; i<10; i++){
            arr.add(10.0F-i);
        }
        System.out.println(minimumValue(arr));
    }

    public static double minimumValue(ArrayList arr){
        Float minimum = (Float) arr.get(0);
        System.out.println(arr.size());
        for(int i=0; i<arr.size(); i++){
            if((Float) arr.get(i)<minimum){
                minimum = (Float) arr.get(i);
            }
        }
        return minimum;
    }
}

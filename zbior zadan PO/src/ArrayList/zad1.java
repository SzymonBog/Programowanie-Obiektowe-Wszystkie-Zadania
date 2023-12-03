package ArrayList;

import java.util.ArrayList;

public class zad1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        for(int i=0; i<10; i++){
            arr.add(i);
        }
        for(int i=9; i>=0; i--){
            System.out.println(arr.get(i));
        }
    }
}

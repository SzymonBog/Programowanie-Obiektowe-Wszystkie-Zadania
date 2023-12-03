package ArrayList;

import java.util.ArrayList;

public class zad2 {
    public static void main(String[] args) {
        ArrayList<Float> arr = new ArrayList<>(10);
        Float a = 20.0F;
        Float suma = 0.0F;
        for (int i=0; i<10; i++){
            arr.add(a);
            a-=2F;
        }

        for (int i=0; i<10; i++){
            suma += arr.get(i);
        }
        System.out.println(suma);
    }
}

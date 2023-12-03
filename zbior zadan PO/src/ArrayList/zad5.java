package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class zad5 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Float> arr = new ArrayList<>();
        for (int i=0; i<30; i++){
            arr.add(rand.nextFloat(-25.0F, 75.0F));
        }
        System.out.println(average(arr));
    }

    public static Float average(ArrayList<Float> arr){
        Float av = 0.0F;
        for(int i=0; i<arr.size(); i++){
            av += arr.get(i);
        }
        av = av/arr.size();
        return av;
    }
}

package GenerowanieLiczbPseudolosowych;

import java.util.Random;

public class zad5 {
    public static void main(String[] args) {
        System.out.println(generateRandomBoolean());
    }

    public static boolean generateRandomBoolean(){
        boolean los;
        Random rand = new Random();
        los = rand.nextBoolean();
        return los;
    }
}

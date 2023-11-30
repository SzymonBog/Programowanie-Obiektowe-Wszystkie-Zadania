package GenerowanieLiczbPseudolosowych;

import java.util.Random;

public class zad3 {
    public static void main(String[] args) {
        System.out.println(generateRandomIntInRange(5,11));
    }

    public static int generateRandomIntInRange(int a, int b){
        int los;
        Random rand = new Random();
        los = rand.nextInt(a, b);
        return los;
    }
}

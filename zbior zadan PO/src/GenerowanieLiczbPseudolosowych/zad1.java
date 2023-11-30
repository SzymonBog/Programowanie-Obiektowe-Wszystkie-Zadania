package GenerowanieLiczbPseudolosowych;

import java.util.Random;

public class zad1 {
    public static void main(String[] args) {
        System.out.println(generateRandomInt());
    }

    public static int generateRandomInt(){
        int los;
        Random rand = new Random();
        los = rand.nextInt();
        return los;
    }
}

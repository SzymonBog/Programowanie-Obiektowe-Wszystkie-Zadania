package GenerowanieLiczbPseudolosowych;

import java.util.Random;

public class zad2 {
    public static void main(String[] args) {
        System.out.println(generateRandomDouble());
    }

    public static double generateRandomDouble(){
        double los;
        Random rand = new Random();
        los = rand.nextDouble(0, 1);
        return los;
    }
}

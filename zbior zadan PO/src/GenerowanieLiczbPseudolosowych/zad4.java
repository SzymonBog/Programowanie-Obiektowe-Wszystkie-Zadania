package GenerowanieLiczbPseudolosowych;

import java.util.Random;

public class zad4 {
    public static void main(String[] args) {
        System.out.println(generateRandomGausian());
    }

    public static double generateRandomGausian(){
        double los;
        double meanValue = 0;  // Średnia
        double stddevValue = 1;  // Odchylenie standardowe
        Random rand = new Random();
        los = rand.nextGaussian() * stddevValue + meanValue;
        return los;
    }
}

package Petle;

public class zad11 {
    public static void main(String[] args) {
        for(int i=0; i<10000; i++){
            int suma = 0;
            for (int j=1; j<i; j++){
                if (i%j==0){
                    suma += j;
                }
            }
            if (suma == i){
                System.out.println(i);
            }
        }
    }
}

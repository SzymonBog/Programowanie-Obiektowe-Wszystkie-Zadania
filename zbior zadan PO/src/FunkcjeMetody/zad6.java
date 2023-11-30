package FunkcjeMetody;

public class zad6 {
    public static void main(String[] args) {
        System.out.println(seven_n(2));
    }

    public static double seven_n(int n){
        double sev = 1;
        if (n>0) {
            for (int i = 1; i <= n; i++) {
                sev *= 7;
            }
            sev = 1/sev;
        }
        return sev;
    }
}

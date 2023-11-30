package FunkcjeMetody;

public class zad8 {
    public static void main(String[] args) {
        System.out.println(suma(5));
    }

    public static int suma(int n) {
        int suma = 0;
        for (int i=n; i<=2*n; i++){
            suma += i;
        }
        return suma;
    }
}

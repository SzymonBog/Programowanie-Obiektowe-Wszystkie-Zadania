package FunkcjeMetody;

public class zad9 {
    public static void main(String[] args) {
        System.out.println(nk(4, 2));
    }

    public static int nk(int n, int k){
        int wynik;
        int nk = n-k;
        int nsil = 1;
        int ksil = 1;
        int nmksil = 1;
        for (int i=1; i<=n; i++){
            nsil *= i;
        }

        for (int i=1; i<=k; i++){
            ksil *= i;
        }

        for (int i=1; i<=nk; i++){
            nmksil *= i;
        }

        System.out.println(nsil + " " + " " + ksil + " " + nmksil);

        wynik = nsil/(ksil*nmksil);
        return wynik;
    }
}

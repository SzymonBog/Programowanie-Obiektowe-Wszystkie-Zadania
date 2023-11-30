package FunkcjeMetody;

public class zad4 {
    public static void main(String[] args) {
        System.out.println(NWW(4,5));
    }

    public static int NWW(int a, int b){
        int nww;
        int basea = a;
        int baseb = b;
        while (a!=b){
            if(a>b){
                b+=baseb;
            } else {
                a+=basea;
            }
        }
        nww = a;
        return nww;
    }
}

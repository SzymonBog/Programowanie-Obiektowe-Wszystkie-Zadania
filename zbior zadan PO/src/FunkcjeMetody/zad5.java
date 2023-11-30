package FunkcjeMetody;

public class zad5 {
    public static void main(String[] args) {
        System.out.println(func(-1535));
        System.out.println(func(1535));
        System.out.println(func(61535));
        System.out.println(func(-6153));
    }

    public static boolean func(int n){
        boolean ok = false;
        String ns = String.valueOf(n);
        int len = ns.length();
        if(n<0 && len-1==4 && n%5==0){
            ok = true;
        }
        return ok;
    }
}

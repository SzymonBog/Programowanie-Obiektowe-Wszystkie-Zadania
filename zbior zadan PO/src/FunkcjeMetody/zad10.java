package FunkcjeMetody;

public class zad10 {
    public static void main(String[] args) {
        System.out.println(jedynki(1112111111));
        System.out.println(jedynki(1111111111));
    }

    public static int jedynki(int n){
        String s = String.valueOf(n);
        int ret = 1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='1'){
                ret = 0;
            }
        }
        return ret;
    }
}

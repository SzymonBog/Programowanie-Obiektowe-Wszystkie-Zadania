package FunkcjeMetody;

public class zad7 {
    public static void main(String[] args) {
        System.out.println(ile(1, 100, 2, 3));
    }

    public static int ile(int a, int b, int c, int d){
        int ile = 0;
        for (int i=a+1; i<b; i++){
            if(i%c==0 && i%d!=0){
                ile+=1;
            }
        }
        return ile;
    }
}

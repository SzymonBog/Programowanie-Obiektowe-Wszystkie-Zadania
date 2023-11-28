package Petle;

public class zad3 {
    public static void main(String[] args) {
        int a=1, b=1;
        for (int i=0; i<10; i++){
            if (i%2==0){
                System.out.println(a);
                a += b;
            } else {
                System.out.println(b);
                b += a;
            }
        }
    }
}

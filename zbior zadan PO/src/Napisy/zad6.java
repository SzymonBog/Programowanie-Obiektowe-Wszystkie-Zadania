package Napisy;

public class zad6 {
    public static void main(String[] args) {
        String str = "Jakiś napis testujacy";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.println(str.charAt(i));
            }
        }
    }
}

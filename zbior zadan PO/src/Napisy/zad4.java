package Napisy;

public class zad4 {
    public static void main(String[] args) {
        String str = "Jakiś napis";
        System.out.println(switchLetters(str));
    }
    public static String switchLetters(String str){
        char tempF = str.charAt(0);
        char tempL = str.charAt(str.length()-1);
        String str1 = "";
        for (int i=0; i<str.length(); i++){
            if(i==0){
                str1 += tempL;
            } else if (i==str.length()-1) {
                str1 += tempF;
            } else {
                str1 += str.charAt(i);
            }
        }
       return str1;
    }
}

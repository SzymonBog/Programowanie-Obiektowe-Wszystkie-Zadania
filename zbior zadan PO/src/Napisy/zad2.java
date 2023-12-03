package Napisy;

public class zad2 {
    public static void main(String[] args) {
        String str = "alla";
        System.out.println(isPalindrom(str));
        str = "al8la";
        System.out.println(isPalindrom(str));
        str = "kot";
        System.out.println(isPalindrom(str));
    }

    public static boolean isPalindrom(String str){
        boolean palindrom = true;
        for (int i=0; i<(str.length()-1)/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                palindrom = false;
                break;
            }
        }
        return palindrom;
    }
}

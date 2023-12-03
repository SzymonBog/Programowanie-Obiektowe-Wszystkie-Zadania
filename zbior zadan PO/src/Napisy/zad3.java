package Napisy;

public class zad3 {
    public static void main(String[] args) {
        String str = "Ala ma kota. Kot ma Ale.";
        System.out.println(noSpaces(str));
        str = "bezspacji";
        System.out.println(str);
    }

    public static String noSpaces(String str){
        String nostr = "";
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                nostr += str.charAt(i);
            }
        }
        return nostr;
    }
}

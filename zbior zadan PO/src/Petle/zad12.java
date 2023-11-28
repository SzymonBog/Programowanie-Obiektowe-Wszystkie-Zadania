package Petle;

public class zad12 { // popraw
    public static void main(String[] args) {
        for (int i=0; i<10000; i++){
            String s = String.valueOf(i);
            int l = s.length();
            int liczba = 0;
            for (int j=0; j<l; j++){
                int add = 1;
                for(int pow=0; pow<l; pow++){
                    //add *= Integer.valueOf(s.charAt(j));
                    String s1 = "";
                    s1 += s.charAt(j);
                    int ok = Integer.valueOf(s1);
                    add *= ok;
                }
                liczba += add;
            }
            //System.out.println(liczba);

            if (liczba == i){
                System.out.println(liczba);
            }
        }
    }
}

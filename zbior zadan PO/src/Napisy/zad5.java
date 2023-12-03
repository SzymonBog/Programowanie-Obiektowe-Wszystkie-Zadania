package Napisy;

import java.util.ArrayList;

public class zad5 {
    public static void main(String[] args) {
        String str = "jakis dosc skomplikowany napis z duza iloscia liter";
        ileRazy(str);
    }
    public static void ileRazy(String str){
        ArrayList<String> arrL = new ArrayList<>();
        ArrayList<Integer> arrI = new ArrayList<>();
        int ind;
        int count;
        for (int i=0; i<str.length(); i++){
            if(arrL.contains(String.valueOf(str.charAt(i)))){
                ind = arrL.indexOf(String.valueOf(str.charAt(i)));
                count = arrI.get(ind);
                count += 1;
                arrI.set(ind, count);
            } else {
                arrL.add(String.valueOf(str.charAt(i)));
                arrI.add(1);
            }
        }
        for (int i=0; i<arrI.size(); i++){
            System.out.println(arrL.get(i) + " - " + arrI.get(i));
        }
    }
}

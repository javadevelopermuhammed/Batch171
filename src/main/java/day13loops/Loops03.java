package day13loops;

public class Loops03 {
    public static void main(String[] args) {
        //Ornek 1: Verilen bir stringde kucuk harfleri console a yazmayiniz
        //"Pwd12?Ab" ==> P12?A

        String s = "Pwd12?Ab";
        for (int i=0;i<s.length();i++){

            char ch = s.charAt(i);
            if (ch>='a'&& ch<='z'){//kucuk harfleri sectim
                continue;
            }
                System.out.print(ch);

        }
        System.out.println();

        // "break" ile "continue" arasindaki fark nedir
        // "break" switch in disina cikmak icin ve loopu kirmak icin kullanilir
        // "continue" ise loop yaparken bazi elemanlari isleme sokmamak icin kullanilir
        // continue keywordu bir looptaki gecerli iterationu sonlandirip sizi arttirma/azaltma bölümüne götürür





    }
}

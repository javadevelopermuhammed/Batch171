package day13loops;

import java.util.Locale;

public class Loops02 {
    public static void main(String[] args) {
        // Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile tam bolunebilen tamsayilari ekrana yazdiran kodu yaziniz
        for (int i=21;i<181;i++){
            if (i%2==0 && i%3==0){
                System.out.print(i+" "+"\n");
            }
        }

        //Ornek 2: Size verilen kucuk harfle yazilmis Stringin indexi cift sayi olan karakterlerini buyuk harfa ceviriniz
        // ankara ==> AnKaRa
        String s ="ankara";
        for (int i=0;i<s.length();i++){
            String ch = s.substring(i,i+1);
            if (i%2==0){
                System.out.println(ch.toUpperCase());
            }
        }

        //Ornek 3: Verilen bir String de ilk a harfinden önceki tüm karakterleri konsola yazdırınız
        // "I love Java"
        String s1 = "I love Java";
        for (int i=0;i<s1.length();i++){

            char ch = s1.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(ch+"\n");
        }

        //Ornek 4: Verilen bir Stringde son 'a' dan sonraki tum karakterleri ters sirada yazdiriniz
        //      "Germany" ==> yn
        String t = "Germany";
        for (int i=t.length()-1;i>=0;i--){

            char ch1 = t.charAt(i);
            if (ch1=='a'){
                break;
            }
            System.out.print(ch1+"\n");
        }











    }
}
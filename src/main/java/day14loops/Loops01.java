package day14loops;

public class Loops01 {
    public static void main(String[] args) {
        //Ornek : Bir stringi i tersine ceviren kodu yazınız
        // "Java" ==> "avaJ"

        //1.yol
        String t = "Java";
        String ters="";
        for (int i=t.length()-1;i>=0;i--){
            ters = ters + t.substring(i,i+1);
        }
        System.out.println(ters);

        //2.yol
        String u = "Java";
        String ters2 = "";
        for (int i=u.length()-1;i>=0;i--){
            ters2 = ters2 + u.charAt(i);
        }
        System.out.println(ters2);

        //ornek 2: size verilen bir string in "Palindrome" olup olmadigini kontrol eden kodu yaziniz
        //  nalan, ey edip adanada pide ye, 404
        //Logic : String i ters cevir sonrada duz hali ile ters halini karsilastir, ayni ise "Palindrome"

        //1.yol
        String duz = "Nalan";
        String ters3 ="";
        for (int i=duz.length()-1;i>=0;i--){
            ters3 = ters3 + duz.substring(i,i+1);
        }
        System.out.println(ters3);
        if (duz.equalsIgnoreCase(ters3)){
            System.out.println("Palindrome dur");
        }else{
            System.out.println("Palindrome degildir");
        }
        //2.yol
        String duz2 = "Ey Edip Adanada Pide ye";
        String ters4 = "";
        for (int i=duz2.length()-1;i>=0;i--){
            ters4 = ters4 + duz2.charAt(i);
        }
        System.out.println(ters4);
        if (duz2.equalsIgnoreCase(ters4)){
            System.out.println("Palindrome dur");
        }else{
            System.out.println("Palindrome degildir");
        }


    }
}

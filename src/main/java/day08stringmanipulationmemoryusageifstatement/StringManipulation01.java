package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {
        //Ornek 1: Bir String'in hic character icermedigini (Bos string oldugunu) kontrol eden kodu yaziniz
        //1. yol: lenght() yontemi ile cozum
        String str = "";
        boolean result1 = str.length()==0;
        System.out.println("String bos mu? "+ result1);//String bos mu? true

        //2. yol tavsiye edilir
        //Java eger bir konuda method olusturmussa, o methodu kullanmak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("is Empty ? "+ result2);//is Empty ? true

        //Ornek 2: Bir String'in space haric hic bir karakter icermedigini kontrol een kodu yaziniz
        String t = "        ";
        //1. yol
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println(result3);

        //2. yol
        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println(result4);

        //3. yol
        boolean result5 = t.isBlank();
        System.out.println(result5);
        //isBlank() methodu sadece space iceren Stringler icin true verir, space disinda bir character var ise false verir.
        //isBlank() methodu bos stringler icin de true verir.
        //isBlank() methodu space ve hicbir sey icin true verir.
        //isEmpty() methodu sadece hicbir sey icin true verir.

        //Ornek 3: Bir string de a, i, e characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        // "Java is easy to Learn" ==>
        //  0123456789.....index

        String r = "Java is easy to Learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println(idxA+idxI+idxE);//14

        //Ornek 4:Bir string deki "Java" kelimesinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz
        // "Ah Java vah Java sensiz olmuyor Java."
        //indexOf("Java") kullaniminda siz "Java" kelimesinin gorunumundeki ilk harfin (yani J nin) indexini almis olursunuz.
        String u = "Ah Java vah Java sensiz olmuyor Java.";

        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        //indexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 return eder
        int idxjava = u.indexOf("java");
        System.out.println(idxjava);//-1


        //Ornek 5: Bir string de a, i, e characterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //         0123456789
        String v = "Java is easy to Learn";

        int idxLasta = v.lastIndexOf('a');//18
        System.out.println(idxLasta);

        int idxLasti = v.lastIndexOf('i');//5
        System.out.println(idxLasti);

        int idxLaste = v.lastIndexOf('e');//17
        System.out.println(idxLaste);

        System.out.println(idxLasta+idxLasti+idxLaste);//40

        //Note : lastIndexOf() methodu olmayan characterler icin kullanilirsa -1 verir
    }
}

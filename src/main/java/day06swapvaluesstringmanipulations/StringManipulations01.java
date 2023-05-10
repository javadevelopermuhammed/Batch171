package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir nun-primitive data typedir ve ayni zamanda bir classdir
        String s = "Java is easy";

        //Ornek 1: "s" String deki tum characterleri buyuk harf yapiniz
        String sUPPER = s.toUpperCase();
        System.out.println(sUPPER);//JAVA IS EASY

        //Ornek2: "s" String indeki tum characterleri kucuk harf yapiniz
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Ornek3: "s" String indeki ilk characteri aliniz.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Ornek4: "s" String indeki bastan ikinci ve sondan ikinci characterleri aliniz ve ekrana yazdiriniz.
        char charSecond = s.charAt(1);
        char charSecondFromLast = s.charAt(10);
        System.out.println(""+charSecond+charSecondFromLast);//as

        //Ornek 5: "s" String inde kullanilan character sayisini bulunuz
        int sLenght = s.length();
        System.out.println(sLenght);//12

        //Ornek 6: "s" String indeki ilk 4 characteri aliniz ve yazdiriniz.
        // s.substring(0,4) ==> bu kullanimda ilk index dahildir, son index harictir.
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);//Java

        //Ornek7: "s" String indeki "is" kelimesini aliniz yazdiriniz.
        String sub2 = s.substring(5, 7);
        System.out.println(sub2);//is

        //Ornek8: "s" String indeki "easy" kelimesini aliniz ve yazdiriniz.
        String sub3 = s.substring(8, 12);
        System.out.println(sub3);//easy

        //ikinci yol
        String sub4 = s.substring(8);
        System.out.println(sub4);//easy

        //Ornek 9: "s" String indeki "money" kelimesinin var olup olmadigini kontrol ediniz.
        boolean isExist = s.contains("money");
        System.out.println(isExist);

        //Ornek 10: "s" String inin belli bir harf ya da harflerle baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Ornek 11: "s" String inin 5. index dahil olmak uzere bu indexten itibaren "i" karakteri ile baslayıp baslamadigini kontrol ediniz.
        boolean isStart2 = s.startsWith("i",5);
        System.out.println(isStart2);

    }
}

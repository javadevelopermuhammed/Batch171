package day06swapvaluesstringmanipulations;

public class StringManipulation02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";
        //Ornek 1: "s" String inin "money" ile bitip bitmedigini kontrol ediniz
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Ornek 2: "s" String indeki "money" kelimesini dolar kelimesine ceviriniz.
        String s1 = s.replace("money","dolar");
        System.out.println(s1);//Learn Java earn dolar

        //Ornek 3: "s" String indeki "earn" kelimesini "win" kelimesine ceviriniz
        String s2 = s.replace("earn","win");
        System.out.println(s2);//Lwin Java win money

        //Ornek 4: "s" String indeki tüm "a" harflerini "*" a ceviriniz
        String s3 = s.replace('a','*');
        System.out.println(s3);//Le*rn J*v* e*rn money

        //Ornek 5: "s" String indeki tüm "n" harflerini "xxx" a ceviriniz.
        String s4 = s.replace("n","xxx");
        System.out.println(s4);//Learxxx Java earxxx moxxxey

        //Ornek 6: s" String indeki "e" harflerini siliniz
        String s5 = s.replace("e","");
        System.out.println(s5);//Larn Java arn mony

        String t = "Ali 13 yasindadir";
        //Ornek 7: "t" String indeki tüm rakamları "*" a ceviriniz.
        //Note:Bir grup datayi idafe etmek icin "Regular Expressions" Regex kullaniriz

        /*

                    Meshur Regex
            1)Tum rakamlar ==> [0-9]
            2)Tum kucuk harfler ==> [a-z]
            3)Tum buyuk harfler ==> [A-Z]
            4)Tum kucuk ve buyuk harfler ==> [a-zA-Z]
            5)Tum harfler e rakamlar ==> [a-zA-Z0-9]
            6)Tum noktalama isaretleri ==> \\p{Punct}
            7)Tum sesli harfler ==> [aeiouAEIOU]
                    x,q,w       ==> [xqw]

            8)Kucuk harflerden farkli tum characterler ==> [^a-z]
            9)Tum harflerden farkli tum characterler ==> [^a-zA-Z]
         */

        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);

    }
}

package day05concatinationoperatorstypecasting;

public class Operators {
    /*
    1) +,-,*,/ islemleri java da matematik te kullanildigi gibi kullanilir
    Note 1: int / int => int olur
    Note 2: double + int => double olur
    Cunku ; java da matematiksel islemlerde farkli data typelari kullanilirsa sonuc her zaman buyuk data typeinda olur

    2) java da "Logical Operator"lar vardir. AND ve OR isleleri Logical Operatorlardir
        i) AND (&&) isleminde true olabilmek icin her sey true olmalidir.
           AND islemi "perfectionist" tir
           AND isleminde bir tane false sonucu false yapar

        ii)OR isleminde (||) bir tane true sonucu true yapmaya yeter
           OR isleminde sonucun false olmasi icin her sey false olmalidir
           OR islemi "polyanna" gibidir.

        iii) NOT Operator (!) true olani false, false olani true yapar
            !true ==> false
            !false==> true
            !!true==> true

    3)Comparison (Karsilastirma) Operators
            <,>,<=,>=,==,!=
     Note: Karsilastirma operatorlarini kullandiginizda kesinlikle boolean (true veya false) alirsiniz

     NOTE : Biz AND islemi icin && kullaniriz ama & kullanimi da gecerlidir
              Farklari nedir?
              && kullanim ilk ifade false oldugunda digerlerini kontrol etmez dolayisiyla hizli calisir
              cunku AND isleminde ilk ifade false ise digerlerinin ne olduguun bi onemi yoktur sonuc her sekilde false olur
              & kullanim ilk ifade ne olursa olsun digerlerini kontrol eder ve dolayisiyla yavas calisir
              bu yuzden biz hep && kullaniriz.
     */
    public static void main(String[] args) {
       boolean first = 3<5 ;
       boolean second = 2 + 3 != 5;
       boolean third = 2+3*5>=19;
        System.out.println(first+" - "+second+" - "+third);//true - false - false

        System.out.println(first && second);
        System.out.println(first || second || third);
    }

}

package day05concatinationoperatorstypecasting;

public class Concatination {
    public static void main(String[] args) {
        //Ornek 1: Bir string ve iki integer variable olsuturun. String degeri ile Integer larin toplamini console a yazdirin
        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s + a + b);//elma1011
        System.out.println(s +( a + b));//elma21
        System.out.println(s + a * b);//elma110
        System.out.println(a + b + s);//21elma
        System.out.println(a + s + b);//10elma11

        //Java da "+" sembolu iki sayi arasinda kullanilirsa toplama islemi olur
        //Java da "+" sembolu iki string arasinda veya bir string ve bir sayi arasinda kullanilirsa "concatination" islemi olur
        //"concatination" birlestirme yapar
        //Note : Concatination islemlerinde Java matematikteki islem onceligi kurallarina uyar

        /*
        Matematikte islem onceligi
        1)Uslu sayilar
        2)Parantez ici islemler
        3)Carpma Bolme
        4)Toplama Cıkarma
        5)Aynı oncelikteki islemler icin soldan saga yapar
         */

        //Ornek 2: Size string olarak verilen 2 fiyatın toplamını ekrana yazdiriniz
        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes);//23005200

        // Integer.valueOf() methodu string degerleri integer a cevirir
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //Ornek 3: Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz
        String tv = "$1100";
        String radio = "$300";
        System.out.println(tv+radio);//$1100$300

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);

        //Note : valueOf() methodu tum karakterleri rakam olan Stringleri sayilara cevirir
        //Eger valueOf() methodu kullanirken String in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz
        //valueOf() methodu kullanilirken sadece rakam olan karakterler kullanilmalidir.





    }

}

package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {
        //Ornek 1: Bir string in belirli bir characterinden baslayarak belirli bir charactere kadar dynamic olarak aliniz
        //      abc@gmail.com ==> gmail

        String a ="abc@gmail.com";
        int startingIndex = a.indexOf('@')+1;
        int endingIndex = a.indexOf('.');
        String companyName = a.substring(startingIndex,endingIndex);
        System.out.println("companyName = " + companyName);

        System.out.println("hard coding ==>"+a.substring(4, 9));

        //Ornek 2: Verilen 2 string in birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz
        String h = "ali Can";
        String i = "Ali Can";

        boolean result = h.equals(i);
        System.out.println(result);//false

        //Java da Memory kullanimi
        /*
        Java da iki tane memory vardir
        1)Stack Memory ==> small
            a)Kucuk memory dir
            b)Primitiveleri ve Non-Primitivelerin adreslerini (reference) tutar

        2)Heap Memory ==> huge
            a)Buyuk memory dir
            b)Non-Primitive datalari icerir
            ==>Java heap memory de yerlestirilen tum Non-Primitive datalar icin bir adres olusturur
            ve bu adresi stack memoryde saklar
         */

        /*
        Note: Stringlerin esitliklerini kontrol ederken "==" yerine equals() methodu kullaniriz
        Neden kullaniriz?
        Cunku: "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar
        ikiside ayni ise stringler esit der ama biz code yazarken genellikle Stringlerin adressleri ile degil
        degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz

        "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim code yazarken ihtiyaci duydugumuz seydir
         */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");

        System.out.println(s==t);//false cunku adresler ve degerler farkli
        System.out.println(s.equals(t));//false cunku degerler farkli
        System.out.println(s==r);//false cunku degerler ayni olmasina ragmen adresler farkli
        System.out.println(s.equals(r));//true cunku equals() sadece degerlere bakar "s" ve "r" nin degerleri aynı oldugundan true

        //Ornek 3: Verilen 2 string in birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate almadan
        // kontrol eden kodu yaziniz
        //equalsIgnoreCase() iki string in birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate almadan kontrol eden method dur.
        String j = "ali Can";
        String k = "Ali Can";
        boolean result2 = j.equalsIgnoreCase(k);
        System.out.println(result2);//true
        /*Homework
        1) Bir string variable olusturun ve bu string deki rakam olmayan tum karakterlerin sayisini konsola yazdiriniz
        2) Bir string variable olusturun ve ilk karakter ile son karakter disindaki tum karakterleri konsola buyuk harflerle yazdiriniz
        3) Bir string variable olusturun ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini konsola yazdiriniz
        4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
        konsola yazdirin
        5)Asagidaki kurallara gore kullanicinin girinigi password u kontrol ediniz
          a) en az 6 karakter olsun
          b) en az bir tane buyuk harf icersin
          c) en az bir tane kucuk harf olsun
          d) en az bir tane rakam olsun

          Note 1: Once canli oturum siresinda cozulen ornekleri yazpiniz
          Note 2: Tum sorulari dinamik kodlarla cozunuz
          Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz

         */



    }
}

package homeworks;

import java.util.Scanner;

public class HomeworkDay05 {
    public static void main(String[] args) {
        //1) Bir string variable olusturun ve bu string deki rakam olmayan tum
        // karakterlerin sayisini konsola yazdiriniz
        String str1 = "I have 5 dogs";
        int a = str1.replaceAll("[0-9]","").length();
        System.out.println(a);

        //2) Bir string variable olusturun ve ilk karakter ile son karakter disindaki
        // tum karakterleri konsola buyuk harflerle yazdiriniz
        String str2 = "Life is good";
        String str2Result = str2.toUpperCase().replace("L","").replace("D","");
        System.out.println(str2Result);

        //3) Bir string variable olusturun ve bu string deki ilk ve son karakterlerin
        // ASCII degerleri toplamini konsola yazdiriniz
        String str3 =  "Java is easy";
        char ch1 = str3.charAt(0);
        char ch2 = str3.charAt(11);
        System.out.println(ch1+ch2);

        //4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isminin ilk
        // harfini buyuk harfle diger harflerini kucuk harflerle konsola yazdirin
        String str4 = "DUZCE";
        String str4Result = str4.toLowerCase().replace("d","D");
        System.out.println(str4Result);

        //5)Asagidaki kurallara gore kullanicinin girinigi password u kontrol ediniz
        //          a) en az 6 karakter olsun
        //          b) en az bir tane buyuk harf icersin
        //          c) en az bir tane kucuk harf olsun
        //          d) en az bir tane rakam olsun

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password.");
        String pswrd = input.nextLine();

        boolean firstReq = pswrd.length()>5;
        System.out.println("firstReq = " + firstReq);

        boolean secondReq = pswrd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("secondReq = " + secondReq);

        boolean thirdReq = pswrd.replaceAll("[^a-z]","").length()>0;
        System.out.println("thirdReq = " + thirdReq);

        boolean fourthReq = pswrd.replaceAll("[^0-9]","").length()>0;
        System.out.println("fourthReq = " + fourthReq);

        boolean isItValid = firstReq&&secondReq&&thirdReq&&fourthReq==true;
        System.out.println("isItValid = " + isItValid);
    }
}

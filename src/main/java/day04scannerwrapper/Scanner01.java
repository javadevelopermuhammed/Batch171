package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //Ornek kullanicidan ilk ismini e soy ismini alip ikisinide ayni satirda ekrana yazdirin

        //1. adim: Scanner Classtan bir object olustur
        Scanner input = new Scanner(System.in);

       //2. adim: Kullaniciya ne istedigimize dair mesaj veriniz
        System.out.println("İlk isminizi giriniz..");

        //next() methodu kullanicidan "tek kelimeli string" almak icin kullanilir
        //3. adim: Uygun method'u kullanarak kullanicinin verdigi datayi memory'e yerlestiriniz
        String firstName = input.next();

        System.out.println("Soy isminizi giriniz..");
        String lastName = input.next();

        System.out.println(firstName+" "+lastName);//ali can

    }
}

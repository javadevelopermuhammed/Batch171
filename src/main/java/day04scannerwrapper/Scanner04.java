package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Ornek : Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //a) Alanini hesaplayiniz  ==> Kisa kenar * Uzun kenar
        //b) Cevresiniz hesaplayiniz ==> 2 * Kisa kenar + 2 * Uzun kenar

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz");
        double shorSide = input.nextDouble();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz");
        double longSide = input.nextDouble();

        System.out.println("Alan = "+(shorSide*longSide));

        System.out.println("Cevre = "+(2*shorSide+2*longSide));





    }
}

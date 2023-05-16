package day10ifstatements;

import java.util.Scanner;

public class Ifstatements01 {
    public static void main(String[] args) {
        //Ornek 1: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Sayi pozitiftir..");
        } else if (num < 0) {
            System.out.println("Sayi negatiftir..");
        } else {
            System.out.println("Sayi notrdur..");
        }



    }
}

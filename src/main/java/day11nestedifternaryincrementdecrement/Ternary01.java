package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {
        //Ternary Statements
        //Ornek 1: Sayi 10 dan kucuk ise console a "kucuk" yazdirin. değil ise "Kucuk degil" yazdirin
        //----------if else cozumu----------
        int num=12;

        if (num<10) {
            System.out.println("Kucuk");
        }else{
            System.out.println("Kucuk degil");
        }

        //-------Ternary Cozumu-------
                     //Condition  ?  Condition true ise calisir  :  Condition false ise calisir ;
        String sonuc=    num<10   ?           "Kucuk"            :           "Kucuk degil"      ;
        System.out.println(sonuc);

        //Ornek 2: Sayi cift ise console a "Cift" yazdirin, tek ise "Tek" yazdirin
        //----------if else cozumu----------
        int k = 13;

        if (k%2==0) {
            System.out.println("Cift");
        }else{
            System.out.println("Tek");
        }

        //-------Ternary Cozumu-------
        String result= k%2==0 ? "Cift" : "Tek";
        System.out.println(result);

        //Ornek 3: Sayi 0 dan buyukse ekrana pozitif degilse negatif pozitif degil yazdirin

        int l = 5;
        System.out.println(l>0 ? "Pozitif" : "Pozitif degil");

        //Ornek 4: Kullanicidan 2 sayi aliniz "buyuk olmayan" (kucuk veya esit olan) sayiyi yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        double first = input.nextDouble();
        double second = input.nextDouble();

        //1.yol if else cozumu
        if (first<second) {
            System.out.println(first);
        }else{
            System.out.println(second);
        }

        //2.yol Ternary
        System.out.println(first<second ? first : second);


    }
}

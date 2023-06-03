package day15loops;

public class WhileLoops01 {
    public static void main(String[] args) {
        //Kalibini olusturalim
        /*for kalibi
        for (baslangic degeri;loop calisma kurali;arttirma/azaltma){
            calisacak kodlar
        }
         */
        //while loop kalibi
/*
        baslangic degeri
        while(loop calisma kurali){
            calisacak kodlar

            arttirma/azaltma
        }*/

        //Ornek 1: 3 den 6 ya kadar tam sayilari console a yazdirin
        //1. yol for loop
        for (int i = 3; i <7 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        //2.yol while loop
        int i =3;

        while(i<7){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        //Ornek 2: 23 den 12 ye kadar cift tam sayilari console a yazdiriniz
        int k = 23;

        while(k>11){
            if (k%2==0){
                System.out.print(k+" ");
            }
            k--;
        }
        System.out.println();

        //Ornek 3: 6 dan 19 a kadar tek tamsayilari console a yazdiriniz
        int l = 6;

        while(l<20){
            if (l%2!=0){
                System.out.print(l+" ");
            }
            l++;
        }
        System.out.println();







    }
}

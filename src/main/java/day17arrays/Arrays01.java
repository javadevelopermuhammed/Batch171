package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Array leri kisa yoldan nasil yapabilirsiniz
        int arr [] = {63,7,313,8,4};

        //Ornek  1: verilen array de kac tane çift sayi kac tane tek sayi oldugunu bulan kodu yaziniz

        int sayac =0;

        for (int w :arr) {
            if (w%2==0){
                sayac++;
            }
        }
        System.out.println("Array de "+sayac+" adet tek sayi "+(arr.length-sayac)+" adet tek sayi kullanilmistir");

        //Ornek 2: Size verilen bir string array deki isimlerin 5 characterden az character icerenleri yazdiriniz

        String stdNames [] = new String[5];

        stdNames [0]="Ajda";
        stdNames [1]="Ayhan";
        stdNames [2]="Tom";
        stdNames [3]="Cuneyt";
        stdNames [4]="Filiz";

        for (String w:stdNames) {
            if (w.length()<5){
                System.out.println(w);
            }
        }

        //Ornek 3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan
        // sonra "F" ile baslayan isimler disindaki isimleri console a yazdirin

        //Note 1: sort() methodu sayisal data type lari kucukten buyuge dogru siralar(ascending order)
        //Note 2: sort() methodu string data type lari alfabetik olarak siralar(alphabetical order)
        //Note 3: ascending order + alphabetical order ==> Natural order
        //Note 4: sort() methodu array elemanlarini Natural order a gore siralar

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));//[Ajda, Ayhan, Cuneyt, Filiz, Tom]
        for (String w: stdNames) {
            if (w.startsWith("F")){
                continue;
            }
            System.out.println(w);
        }
    }
}

package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1: String array olusturun, ,c,ne 5 tane eleman ekleyin, ilk eleman ile
        // son elemanin icerdigi karakter sayilari toplamini ekrana yazdirin
        String arr [] = new String[5];
        arr[0]= "Math";
        arr[1]= "Science";
        arr[2]= "Music";
        arr[3]= "English";
        arr[4]= "Art";
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length() + arr[arr.length - 1].length());//7

        //Ornek 2: String array olusturun, icine 5 eleman ekleyin
        // tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin
        String brr [] = new String[5];
        brr[0]= "Miami";
        brr[1]= "Istanbul";
        brr[2]= "Ankara";
        brr[3]= "Oslo";
        brr[4]= "Erzurum";

        //1.yol for-loop

        int totalChar =0;

        for (int i = 0; i < brr.length; i++) {
            totalChar = totalChar + brr[i].length();
        }
        System.out.println(totalChar);//30

        //2.yol for-each-loop
        //baslangic degeri, loopun calisma sarti, increment/decrement kismini kendi yapar
        //for-each-loop "Array" lerde ve "collection"larda kullanilir
        /*for-each-loop-kalini
        for (DataType w:arr/collection) {
            calisacak kodlar
        }
        */

        int sum =0;
        for (String w:brr) {
            sum = sum + w.length();
        }
        System.out.println(sum);//30


        //Ornek 3: Notlar adinda int bir array olusturunuz icine 6 not yerlestiriniz ve not ortalamasini ekrana yazdiriniz

        int notlar[]= new int[6];
        notlar[0]=100;
        notlar[1]=99;
        notlar[2]=98;
        notlar[3]=96;
        notlar[4]=90;
        notlar[5]=94;
        int toplam =0;
        for (int w:notlar) {
            toplam = toplam + w;
        }
        System.out.println(toplam/notlar.length);
    }
}

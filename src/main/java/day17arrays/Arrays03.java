package day17arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz.
        String names [] = {"K","C","R","A","S"};
        String el = "X";

        //1.way
        int counter =0;

        for (String w: names){
            if (w.equals(el)){
                counter++;
                break;
            }
        }

        if (counter>0){
            System.out.println("Array has "+el);
        }else{
            System.out.println("Array does not have "+el);
        }

        /*
        1)  binarySearch() methodunu sort() kullanmadan kullanmayiniz, cunku  binarySearch() mantigi sirali elemanlar icin gecerlidir.
        2)  binarySearch() methodu var olan elemanlar icin size o elemanin index ini verir.
             binarySearch() methodundan aldiginiz index 0 veya 0 dan buyuk ise bu o eleman arrayde var demektir
        3)  binarySearch() methodu olmayan elemanlar icin negatif tamsayi degeri verir.
        "-" isaretinin anlami o eleman yok demektir
        "sayi" ise o eleman olsaydi kacinci eleman olurdu demektir.
         */

        //2. way : binarySearch() methodu hizli calisir
        Arrays.sort(names);
        int result = Arrays.binarySearch(names,el);

        if (result<0){
            System.out.println("Array does not have "+el);
        }else{
            System.out.println("Array has "+el);
        }

        System.out.println(Arrays.toString(names));//[A, C, K, R, S]

        int num1 = Arrays.binarySearch(names,"A");
        System.out.println(num1);

        int num2 = Arrays.binarySearch(names,"K");
        System.out.println(num2);

        int num3 = Arrays.binarySearch(names,"U");
        System.out.println(num3);

        int num4 = Arrays.binarySearch(names,"B");
        System.out.println(num4);



    }
}

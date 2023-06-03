package day18multidimensionalarray;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {

        //Örnek) Iki boyutlu bir Array i tek boyutlu bir array e ceviriniz


        int numbers[][] = {{5, 4}, {2, 3, 2}};

        //1,adim:2 boyutlu Array de kac eleman oldugunu bulan kodu yazmaliyiz
        int toplamElemanSayisi = 0;
        for (int[] w:numbers){
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        System.out.println(toplamElemanSayisi);

        //2.adim: Tek boyutlu array i iki boyutlu array in eleman sayisini kullanarak olusturmaliyiz
        int newArr []= new int[toplamElemanSayisi];

        //3.adim: iki boyutlu array deki elemanlari tek boyutlu array e transfer etmeliyiz
        int idx = 0;
        for (int [] w : numbers){

            for (int k : w){
                newArr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));

    }
}

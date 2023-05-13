package day08stringmanipulationmemoryusageifstatement;

public class IfStatement01 {
    public static void main(String[] args) {
        //if statements
        //bazi kodlari bazi sartlara gore aktive edebilmek icin if statements kullanilir
        //if eger demek ==> is cumlesi

        //if you study hard, you will learn Java ==> english

       /*
        if(you study hard){
            you will learn Java ==> Java
        }
        */

        //Ornek 1: Sayi pozitif ise ekrana pozitif yazdirin

        int num= -13;

        if(num>0){
            System.out.println(num+" ==> pozitiftir");
        }

        //Ornek 2: Sayi -1 il 10 arasinda ise ekrana Rakam yazdirin
        // -1<n<10 ==> n>-1 && n<10
        int n = 5;

        if(n>-1 && n<10){
            System.out.println(n+"Rakam");
        }
    }

}

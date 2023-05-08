package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {
        //Object nasil olusturulur
        //new keywordu sifirdan yeni bir obje olusturmak icin kullanilir
        //Constructor java da objeleri olusturmak icin kullanilan ozel bir methodtur
        //Class ismi  +  Obje ismi  +  Assigiment Operator  +  "new" keyword  +  Constructor
            Car            myCar                 =               new                 Car();
                                                                                //obje olusturmanın syntax i
        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student aliCan = new Student();
        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);
        aliCan.study();
        aliCan.feed();



//homework
/*icinde isim ve yas variable lari ile teach methodu da bulunan bir Teacher objesi olusturun
ve onje uzerinde bu ozellikleri kullanin
 */


    }


}

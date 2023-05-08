package day03methodobjectcreationscanner;

public class MethodCreation01 {

    public static void main(String[] args) {
        double kup = getCube(5);
        System.out.println("kup = " + kup);

        print("Java is easy");

        //method olusturmak icin ikinci yol
        //Ornek 2 ikinci yol: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
        //main method icinde iken method ta kullanilacak olan variable lari olusturunuz
        String str ="TechproEdu";
        //method ismi ve parametreleri yazariz
        //kirmizi kismin uzerinde bekleyip create method a tiklariz intellij otomatik olarak bir method olusturur
        //daha sonra kendi istegimize gore dizayn ederiz.
        printConsole(str);

        //Ornek 3: Verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullaniniz.
        int a=3;
        int b=5;
        doMultiplication(a,b);

        //Ornek 4: Verilen bir tamsayinin karesini hesaplayip console a yazdiran methodu olusturup kullaniniz.
        int c =5;
        getSquare(c);





    }

    private static void getSquare(int c) {
        System.out.println(c*c);
    }

    private static void doMultiplication(int a, int b) {
        System.out.println(a*b);
    }

    public static void printConsole(String str) {
        System.out.println(str);
    }

    //Ornek 1: Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz.
    static double getCube(double a) {
        return a * a * a;
    }
    //Note: Access modifier i default yapmak isterseniz access modifier i YAZMAYINIZ..

    //Ornek 2: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    public static void print(String str){
        System.out.println(str);
    }
    //Eger bir method yeni bir data uretmiyor ise return type i void olur
    //methodun return type i void ise method body icinde return keywordu yazilmaz.

    /*
    Homework
    1)Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    2)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz
     */

}

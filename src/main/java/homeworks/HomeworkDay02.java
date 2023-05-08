package homeworks;

public class HomeworkDay02 {

    public static void main(String[] args) {

        long sonuc = dikdortgeninAlani(6,8);
        System.out.println(sonuc);
        int sonuc2 = dikdortgeninCevresi(6,8,2);
        System.out.println(sonuc2);
    }

    private static long dikdortgeninAlani(int a,int b){
        return a*b;
    }

    public static int dikdortgeninCevresi(int a,int b,int c){
        return a*b*c;
    }




}

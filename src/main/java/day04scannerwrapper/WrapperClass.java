package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive     : char      - boolean - byte - short -  int   - long - float - double
        //Wrapper Class : Character - Boolean - Byte - Short - Integer- Long - Float - Double

        //Wrapper Classlar non-primitivedir. O yuzden memoryde cok yer kaplarlar
        //dolayisiyla sart degilse wrapper class kullanmayi tercih etmeyiz
        //n yazip nokta koyarsaniz hic method goremezsiniz cunku primitiveler method icermez
        int n = 12;

        //m yazip nokta koyarsaniz eger bir cok method gorebilirsiniz cunku wrapper classlar method icerir
        Integer m = 12;

        byte x = 33;
        Byte y = 44;

        //Ornek : short data typeinin min ve max degerlerini kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);


    }
}

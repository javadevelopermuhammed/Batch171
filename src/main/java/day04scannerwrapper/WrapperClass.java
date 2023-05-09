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

        //Ornek 2: int data type inin minumum degeri ile byte data type inin maximum degerinin toplamini bulunuz
        int minInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minInt+maxByte);

        //Ornek 3: Primitive int i  wrapper Integer a ceviriniz.(Autoboxing)
        int num = 12;
        Integer wrapperNum = num;

        //Ornek 4: Wrapper Byte i primtive byte a ceviriniz.(Unboxing)
        Byte k = 12;
        System.out.println(k);
        byte primitiveK = k;
        System.out.println(primitiveK);

        //Ornek 5: primitive char ı Wrapper Character e ceviriniz.
        char inital = 'm';
        Character initalWrapper = inital;

        //Ornek 6: Wrapper Boolean i primitive boolean a ceviriniz
        Boolean sensor = true;
        boolean sensorP = sensor;


    }
}

package day05concatinationoperatorstypecasting;

public class TypeCasting {
    /*
    Numeric primitive data typelarinin birbirine donusturulmesine "Type Casting" denir
    Numeric (sayisal) Data typelar byte - short - int - long - float - double
     */
    //Note 1: Kucuk data typelarini buyuk data typelarina donusturmeyi java otomatik olarak yapar
    //bu isleme "AutoWidening" (otomatik genisletme) denir.

    //NOte 2: Buyuk data typelarini kucuk data typelarina cevirmek riskli bir istir, java bu riskli isi otomatik olarak yapmaz
    // bu islemi kod yazanlardan bekler
    //Bu isleme "ExplicitNarrowing" (Aciktan Daraltma) denir

    public static void main(String[] args) {
        //byte data type ini int data type ina ceviriniz
        byte age = 13;
        int ageInt = age;//Auto  Widening

        //int data type ini short data type ina ceviriniz
        int weight=312;
        short weightShort = (short)weight;//Explicit Narrowing


    }

}

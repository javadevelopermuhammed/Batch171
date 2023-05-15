package tekrarlar;

public class Tekrar01 {
    public static void main(String[] args) {

        //Ornek 1: Bir String'in hic character icermedigini (Bos string oldugunu) kontrol eden kodu yaziniz
        String str1 = "Hello";
        boolean result1 = str1.isEmpty();
        System.out.println("result1 = " + result1);

        //Ornek 2: Bir String'in space haric hic bir karakter icermedigini kontrol een kodu yaziniz
        String str2 = "   ";
        boolean result2 = str2.isBlank();
        System.out.println("result2 = " + result2);

        //Ornek 3: Bir string de a, i, e characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        String str3 = "Java is not easy at all";

        int idxA = str3.indexOf('a');
        System.out.println("idxA = " + idxA);

        int idxI = str3.indexOf('i');
        System.out.println("idxI = " + idxI);

        int idxE = str3.indexOf('e');
        System.out.println("idxE = " + idxE);

        System.out.println(idxA + idxI + idxE);

        //Ornek 4:Bir string deki "Java" kelimesinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz
        String str4 = "oh Java oh Java u are the best Java";
        int resultOfStr4 = str4.indexOf("Java");
        System.out.println("resultOfStr4 = " + resultOfStr4);

        //Ornek 5: Bir string de a, i, e characterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        String str5 = "Java is not easy at all";
        int lastIdxA = str5.lastIndexOf('a');
        System.out.println("lastIdxA = " + lastIdxA);

        int lastIdxI = str5.lastIndexOf('i');
        System.out.println("lastIdxI = " + lastIdxI);

        int lastIdxE = str5.lastIndexOf('e');
        System.out.println("lastIdxE = " + lastIdxE);

        System.out.println(lastIdxA+lastIdxI+lastIdxE);

        //Ornek 6: Bir string in belirli bir characterinden baslayarak
        // belirli bir charactere kadar dynamic olarak aliniz
        String str6 = "istanbul@gmail.com";
        int startingIndex = str6.indexOf('@')+1;
        int endingIndex = str6.indexOf('.');
        String companyName = str6.substring(startingIndex,endingIndex);
        System.out.println("companyName = " + companyName);

        //Ornek 7: Verilen 2 string in birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz
        String str7 = "Java is easy";
        String str8 = "java is easy";
        boolean isEquals = str7.equals(str8);
        System.out.println("isEquals = " + isEquals);

        //Ornek 8: Verilen 2 string in birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate almadan
        String str9 = "Muhammed emin KabA";
        String str10 = "muHammeD Emin kAba";
        boolean isEqualsIgnoreCase = str9.equalsIgnoreCase(str10);
        System.out.println("isEqualsIgnoreCase = " + isEqualsIgnoreCase);

        //Ornek 1: Sayi pozitif ise ekrana pozitif yazdirin
        int num1 = 25;

        if (num1>0){
            System.out.println("It is positive");
        }
        //Ornek 2: Sayi 15 il 30 arasinda ise ekrana Sayi yazdirin
        int num2 = 23;
        if (num2>15&&num2<30){
            System.out.println("It is number");
        }


    }
}

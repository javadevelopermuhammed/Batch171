package homeworks;

import java.util.Scanner;

public class HomeworkDay04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("3 farkli rakam giriniz");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        System.out.println((num1+num2+num3)/3);

        System.out.println("3 basamakli bir sayi giriniz");
        int number = input.nextInt();
        //birler basamagibi al
        int birlerBasamagi = number % 10;
        //sayiyi kucult
        number = number/10;
        //onlar basamagini al
        int onlarBasamagi = number % 10;
        //sayiyi kucult
        number = number/10;
        //yuzler basamagini al
        int yuzlerBasamagi = number % 10;
        //son rakam oldugu icin kucultmeye gerek yok
        System.out.println(birlerBasamagi+onlarBasamagi+yuzlerBasamagi);


    }
}

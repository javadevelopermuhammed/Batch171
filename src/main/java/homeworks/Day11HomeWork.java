package homeworks;

import java.util.Scanner;

public class HomeWorkDay11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Homework
        //1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
        //ve kullaniciya uygun mesaj veren kodu yaziniz
        System.out.println("Please enter your password!!");
        String pwd = input.nextLine();

        if (pwd.equals("pwd123!")) {
            System.out.println("Password is correct please continue..");
        }else{
            System.out.println("Password is wrong please try again!!");
        }

        //2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
        //Pazar ==> 1.Gun , Pazartesi  ==> 2.Gun  .....
        System.out.println("Please enter a day name!!");
        String dayName = input.nextLine();

        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("1st Day");
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println("2nd Day");
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println("3rd Day");
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println("4th Day");
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println("5th Day");
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println("6th Day");
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println("7th Day");
        } else {
            System.out.println("Please enter a valid day name!!");
        }

        //3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
        //  1==> January, 2 ==> February .....
        System.out.println("Please enter a month number!!");
        int monthNumber = input.nextInt();

        if (monthNumber==1) {
            System.out.println("January");
        } else if (monthNumber==2) {
            System.out.println("February");
        } else if (monthNumber==3) {
            System.out.println("March");
        } else if (monthNumber==4) {
            System.out.println("April");
        } else if (monthNumber==5) {
            System.out.println("May");
        } else if (monthNumber==6) {
            System.out.println("June");
        } else if (monthNumber==7) {
            System.out.println("July");
        } else if (monthNumber==8) {
            System.out.println("August");
        } else if (monthNumber==9) {
            System.out.println("September");
        } else if (monthNumber==10) {
            System.out.println("October");
        } else if (monthNumber==11) {
            System.out.println("November");
        } else if (monthNumber==12) {
            System.out.println("December");
        }else{
            System.out.println("Please enter a valid number!!");
        }

    }
}

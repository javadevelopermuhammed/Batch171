package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        int ages []= new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;
        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]

        //1.yol
        //sort() methodu arraydeki elemanalari kucukten buyuge dizer
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]
        System.out.println(ages[0]+ ages[ages.length-1]);

        //2.yol

        int minimum = ages[0];
        int maximum = ages[0];

        for (int w:ages) {
            minimum = Math.min(minimum,w);
            maximum = Math.max(maximum,w);

        }
        System.out.println(minimum);//15

        //Ornek 2: String bir array olusturunuz 6 eleman ekleyiniz, yellowdan onceki elemanlari yazdiriniz
        String colours[]= new String[6];
        colours[0]="Red";
        colours[1]="Orange";
        colours[2]="Blue";
        colours[3]="Yellow";
        colours[4]="Green";
        colours[5]="Brown";
        System.out.println(Arrays.toString(colours));//[Red, Orange, Blue, Yellow, Green, Brown]

        for (String w:colours) {
            if (w.equals("Yellow")){
                break;
            }
            System.out.println(w);
        }


    }
}

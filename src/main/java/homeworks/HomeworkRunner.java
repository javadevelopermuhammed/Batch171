package homeworks;

public class HomeworkRunner {

    public static void main(String[] args) {
        HomeworkTeacher myTeacher = new HomeworkTeacher();
        System.out.println("myTeacher.name = " + myTeacher.name);
        System.out.println("myTeacher.age = " + myTeacher.age);
        myTeacher.teach();


    }


}

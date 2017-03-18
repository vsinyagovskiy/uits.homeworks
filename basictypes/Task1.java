package basictypes;

/**
 * Created by me on 17.01.2017.
 */
public class Task1 {

    public static void main(String[] args) {
        helloWorld();
        System.out.println("");
        methodString();
        System.out.println("");
        nameSurname();
    }

    public static void helloWorld(){
        System.out.println("Здравствуй мир");
    }

    public static void methodString() {
        String s = "1" + "\n" + "мир" + "\n" + "2";
        System.out.println(s);
    }

    public static void nameSurname() {
        String s ="ФИО: ";
        String b ="Синяговский В.А";
        String c ="номер группы: ";
        String d ="JV 16-14";
        String e ="время занятий: ";
        int a = 9;
        int w = 17;
        System.out.println(s + b);
        System.out.println(c + d);
        System.out.println(e + a + " - Sunday; " + w + " - Wednesday");

    }
}

/**
 * Created by me on 18.01.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        int two = 0;
        int three = 0;
        int five = 0;
        int seven = 0;

        for (int i = 0; i < 100; i++) {
            if (i%2 == 0) {
                two += i;
                System.out.println(i);
            }

            if (i%3 == 0) {
                three += i;
                System.out.println(i);
            }

            if (i%5 == 0) {
                five += i;
                System.out.println(i);
            }

            if (i%7 == 0) {
                seven += i;
                System.out.println(i);
            }
        }

        int diff = two - seven;
        System.out.println(diff);
        int relation = three/five;
        System.out.println(relation);

    }
}

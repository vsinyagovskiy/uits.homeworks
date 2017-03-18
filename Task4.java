import java.util.Random;

import static java.lang.Integer.valueOf;

/**
 * Created by me on 31.01.2017.
 */
public class Task4 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] m = new int[random.nextInt(99)];

        fill(m);
        print(m);
        System.out.println("");
        evenNotEven(m);
        System.out.println("");
        summSeven(m);
        System.out.println("");
        multiplicationThree(m);
    }

    public static void fill(int[] m) {
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i] = random.nextInt(99);
        }
    }

    public static void print(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }

        System.out.println("");

        for (int i = m.length - 1; i >= 0; i--) {
            System.out.print(m[i] + " ");
        }

    }

    public static void evenNotEven(int[] m) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] % 2 == 0) {
                System.out.print(m[i] + " ");
            }
        }

        System.out.println("");

        for (int i = 0; i < m.length; i++) {
            if (m[i] % 2 != 0) {
                System.out.print(m[i] + " ");
            }
        }
    }

    public static void summSeven(int[] m) {
        int sevens = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] % 7 == 0) {
                sevens += i;
            }
        }
        System.out.print(sevens);

    }

    public static void multiplicationThree(int[] m) {
        int three = 1;
        for (int i = 0; i < m.length; i++) {
            if (m[i] % 3 == 0 && i > 0) {
                three *= i;
            }
        }
        System.out.print(three);

    }

}

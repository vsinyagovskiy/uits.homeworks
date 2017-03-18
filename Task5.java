import java.util.Random;

/**
 * Created by me on 02.02.2017.
 */
public class Task5 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] m = new int[random.nextInt(9) + 1][random.nextInt(9) + 1];
        fill(m);
        print(m);
        System.out.println("");
        evenNotEven(m);
        System.out.println("");
        summSeven(m);
        multiplicationThree(m);
    }

    public static void fill(int[][] m) {
        Random random = new Random();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = random.nextInt(99);
        }
    }

    public static void print(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("");


        for (int i = m.length - 1; i >= 0; i--) {
            for (int j = m[i].length - 1; j >= 0; j--) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void evenNotEven(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m[i].length; j++)
                    if (m[i][j] % 2 == 0) {
                        System.out.print(m[i][j] + "\t");
                    }
            }

            System.out.println();

        }

        System.out.println(" ");


        for (int i = 0; i < m.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < m[i].length; j++)
                    if (m[i][j] % 2 != 0) {
                        System.out.print(m[i][j] + "\t");
                    }
            }
            System.out.println();
        }
    }

    public static void summSeven(int[][] m) {

        int summ = 0;
        for (int i = 0; i < m.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m[i].length; j++)
                    if (m[i][j] % 7 == 0) {
                        summ += m[i][j];
                    }
            }


        }
        System.out.println(summ);

    }

    public static void multiplicationThree(int[][] m) {

        int multiplication = 0;
        for (int i = 0; i < m.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < m[i].length; j++)
                    if (m[i][j] % 3 == 0 && m[i][j] > 0 ) {
                        multiplication *= m[i][j];
                }
            }
        }
        System.out.println(multiplication);

    }
}
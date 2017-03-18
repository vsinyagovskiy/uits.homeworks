import java.util.Arrays;

/**
 * Created by Me on 21.02.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        int[][] m = new int[9][9];

        standard(m);
        System.out.println();
        vertical(m);
        System.out.println();
        horizontal(m);
        System.out.println();
        horizontalVertical(m);

    }

    public static void standard(int[][] m) {
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static void vertical(int[][] m) {
        for (int i = m.length - 1; i > 0; i--) {

            for (int j = i; j > 0; j--) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static void horizontal(int[][] m) {
        for (int i = 0; i < m.length; i++) {

            for(int j=m.length; j>i+1; j--)
                    System.out.print("  ");

            for (int j = 0; j < i; j++) {
                    System.out.print(m[i][j] + " ");
                }

                System.out.println();
            }
        }

    public static void horizontalVertical(int[][] m) {
        for (int i = m.length - 1; i > 0; i--) {

            for(int j=m.length; j>i+1; j--)
                System.out.print("  ");

            for (int j = i; j > 0; j--) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }

    }
}
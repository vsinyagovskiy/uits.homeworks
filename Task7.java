/**
 * Created by Me on 02.03.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        int[][] m;
        m = new int[18][20];
        m[3][3] = 1;
        m[5][5] = 1;
        m[7][7] = 1;
        m[9][9] = 1;

        standard(m);
        System.out.println();
        right(m, 3, 3, 16);
        System.out.println();
        left(m, 5, 5, 5);
        System.out.println();
        up(m, 7, 7, 7);
        System.out.println();
        down(m, 9, 9,8 );

    }

    public static void standard(int[][] m) {
        for (int[] aM : m) {
            for (int j = 0; j < 20; j++) {
                System.out.print(aM[j]);

            }
            System.out.println();
        }
    }

    public static void right (int[][]m,  int a, int b, int w) {
        int x = -1;
        for (int i = w; i > 0; i--) {
            x++;
            int c = m[a][b + 1 + x];

            for (int e = 1; e > 0; e--) {
                m[a][b + x + 1] = m[a][b + x];
                m[a][b + x] = c;
            }
        }
        for (int[] aM : m) {
            for (int j = 0; j < 20; j++) {
                System.out.print(aM[j]);

            }
            System.out.println();
        }
    }
    public static void left (int[][]m,  int a, int b, int w) {
        int x = -1;
        for (int i = w; i > 0; i--) {
            x++;
            int c = m[a][b-1-x];

            for (int e = 1; e > 0; e--) {
                m[a][b-x-1] = m[a][b-x];
                m[a][b-x] = c;
            }
        }
        for (int[] aM : m) {
            for (int j = 0; j < 20; j++) {
                System.out.print(aM[j]);

            }
            System.out.println();
        }
}
    public static void up (int[][]m,  int a, int b, int w) {
        int x = -1;
        for (int i = w; i > 0; i--) {
            x++;
            int c = m[a-1-x][b];

            for (int e = 1; e > 0; e--) {
                m[a-x-1][b] = m[a-x][b];
                m[a-x][b] = c;
            }
        }
        for (int[] aM : m) {
            for (int j = 0; j < 20; j++) {
                System.out.print(aM[j]);

            }
            System.out.println();
        }
    }
    public static void down (int[][]m,  int a, int b, int w) {
        int x = -1;
        for (int i = w; i > 0; i--) {
            x++;
            int c = m[a+1+x][b];

            for (int e = 1; e > 0; e--) {
                m[a+x+1][b] = m[a+x][b];
                m[a+x][b] = c;
            }
        }
        for (int[] aM : m) {
            for (int j = 0; j < 20; j++) {
                System.out.print(aM[j]);

            }
            System.out.println();
        }
    }
}
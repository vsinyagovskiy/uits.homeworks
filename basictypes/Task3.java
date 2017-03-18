package basictypes;

/**
 * Created by me on 25.01.2017.
 */
public class Task3 {
    public static void main(String[] args){
        cyliVolume(22,111);
        cyliPolVolume (22,44,32);
        sRoundCyl (11,25);
        vSphere (23);
        vSurfaceSphere (33);
        vCuboid (4,5,6);
        sAreaCuboid (4,5,6);
        vTetrahedron (4,6);
        sTetrahedron (12);
    }

    public static void cyliVolume (int radius, int height) {
        double a = Math.PI*Math.pow(radius,2)*height;
        System.out.println(a);
    }

    public static void cyliPolVolume (int radius1, int radius2, int height) {
        double a = Math.PI*height*(Math.pow(radius2, 2) - Math.pow(radius1, 2));
        System.out.println(a);
    }

    public static void sRoundCyl (int radius, int height) {
        double a = 2*Math.PI*radius*height;
        System.out.println(a);
    }

    public static void vSphere (int radius) {
        double a = Math.PI*4/3*(Math.pow(radius, 3));
        System.out.println(a);
    }

    public static void vSurfaceSphere (int radius) {
        double a = Math.PI*4*(Math.pow(radius, 2));
        System.out.println(a);
    }

    public static void vCuboid (int a, int b, int c) {
        int result = a*b*c;
        System.out.println(result);
    }

    public static void sAreaCuboid (int a, int b, int c) {
        int result = 2*(a*b + b*c + a*c);
        System.out.println(result);
    }

    public static void  vTetrahedron (int a, int h) {
        double result = (h/3)*Math.sqrt(a);
        System.out.println(result);
    }

    public static void  sTetrahedron (int a) {
        double result = (Math.pow(a, 2)) * Math.sqrt(3);
        System.out.println(result);
    }

}

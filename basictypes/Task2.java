package basictypes;

import static java.lang.Math.PI;

/**
 * Created by me on 17.01.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        circumference(8, 6, 6);
        circleArea(5);
        ringArea(10, 5);
        trianglePerimeter(2,4,5);
        triangleArea(10,4);
        rectanglePerimeter(10, 10);
        rectangleArea(6,9);
    }

    public static void circumference (int a, int b, int c) {
        double x = Math.PI * (a + b + c);
        System.out.println(x);
    }

    public static void circleArea (int a) {
        double x = (Math.pow(a, 2)) * Math.PI;
        System.out.println(x);
    }

    public static void ringArea (int ext, int internal) {
        double x = Math.PI * (Math.pow(ext, 2) - Math.pow(internal, 2));
        System.out.println(x);
    }

    public static void trianglePerimeter (int a, int b, int c) {
        int x = a + b + c;
        System.out.println(x);
    }

    public static void triangleArea (int basis, int height) {
        int x = (basis/2) * height;
        System.out.println(x);
    }

    public static void rectanglePerimeter (int a, int b){
        int x = (a + b) * 2;
        System.out.println(x);
    }

    public static void rectangleArea (int a, int b){
        int x = (a * b);
        System.out.println(x);
    }

}

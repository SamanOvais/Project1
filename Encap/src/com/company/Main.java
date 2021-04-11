package com.company;
import java.util.Scanner;
public class Main {
    public static float radius = 10f;

    public static void main(String[] args) {
        // write your code here
        System.out.println(Circle.area(radius));
        System.out.println("enter a radius");
        Scanner scan = new Scanner(System.in);
        float r = scan.nextFloat();
        System.out.println(Circle.area(r));

    }
}
    class Circle {
        public static float area(float radius) {
            return 3.141f * radius * radius;
        }
    }


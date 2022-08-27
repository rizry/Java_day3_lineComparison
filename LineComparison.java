package com.java.day3;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("--Welcome to Line Comparison Computation Program--\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the coordinates for point p1 (x1,y1): ");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();

        System.out.print("Enter the coordinates for point p2 (x2, y2): ");
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();

        System.out.println();

        System.out.print("Enter the coordinates for point p3 (x3,y3): ");
        float x3 = sc.nextFloat();
        float y3 = sc.nextFloat();

        System.out.print("Enter the coordinates for point p4 (x4, y4): ");
        float x4 = sc.nextFloat();
        float y4 = sc.nextFloat();
        System.out.println();


        String lengthL1 = String.format("%.02f", getLength(x1, y1, x2, y2));
        String lengthL2 = String.format("%.02f", getLength(x3, y3, x4, y4));

        System.out.println("Length of line L1: "+ lengthL1);
        System.out.println("Length of line L2: "+ lengthL2);
        System.out.println();

        if (lengthL1.equals(lengthL2)) {
            System.out.println("The lines L1 and L2 are equal");
        } else {
            System.out.println("The lines are not equal");
        }

        sc.close();
    }

    static double getLength(float x1, float y1, float x2, float y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    }

}

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
    System.out.printf("The length of line L1 (" + x1 + ", " + y1 + ") " + "and " + "(" + x2 + ", " + y2 + ") " + "is %.2f",
      getLength(x1, y1, x2, y2));

    sc.close();
  }

  static double getLength(float x1, float y1, float x2, float y2) {
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

  }

}

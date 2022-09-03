package com.java.day3;

import java.util.Scanner;

public class LineComparison {

  public static void main(String[] args) {
    System.out.println("--Welcome to Line Comparison Computation Program--\n");

    System.out.print("Enter the coordinates for point p1 (x1,y1): ");
    Point p1 = new Point();

    System.out.print("Enter the coordinates for point p2 (x2, y2): ");
    Point p2 = new Point();

    System.out.println();
    Line line1 = new Line(p1, p2);

    System.out.print("Enter the coordinates for point p3 (x3,y3): ");
    Point p3 = new Point();

    System.out.print("Enter the coordinates for point p4 (x4, y4): ");
    Point p4 = new Point();

    System.out.println();
    Line line2 = new Line(p3, p4);

    double l1 = line1.calculateLength();
    System.out.println("the length of the line is " + line1.formatLength(l1));

    double l2 = line2.calculateLength();
    System.out.println("the length of the line is " + line2.formatLength(l2));

    System.out.println(line1.compareLength(l1, l2));
  }

}

class Point {
  float x;
  float y;

  Scanner sc = new Scanner(System.in);

  Point() {

    float x1 = sc.nextFloat();
    float y1 = sc.nextFloat();

    this.x = x1;
    this.y = y1;

  }
}

class Line {
  float x1;
  float y1;
  float x2;
  float y2;

  Line(Point p1, Point p2) {
    this.x1 = p1.x;
    this.y1 = p1.y;
    this.x2 = p2.x;
    this.y2 = p2.y;
  }

  public double calculateLength() {
    double length = Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
    return length;
  }

  public String formatLength(double len) {
    return String.format("%.2f", len);
  }

  public String compareLength(double l1, double l2) {
    if (Double.toString(l1).equals(Double.toString(l2))) return "The lines L1 and L2 are equal";
    else {
      Integer L1 = (int) l1;
      Integer L2 = (int) l2;
      if (L1.compareTo(L2) > 0) return "Line 1 is greater.";
      else return "Line 2 is greater.";
    }
  }
}
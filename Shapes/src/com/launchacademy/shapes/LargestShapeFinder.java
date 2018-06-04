package com.launchacademy.shapes;

import java.util.ArrayList;

public class LargestShapeFinder {
  public static Shape findLargestArea(ArrayList<Shape> shapes) {
    double largestArea = 0;
    Shape largestShape = null;
    for(Shape shape : shapes) {
      if(shape.area() > largestArea) {
        largestShape = shape;
        largestArea = shape.area();
      }
    }
    return largestShape;
  }
  
  public static void main(String[] args) {
     Circle smallCircle = new Circle(1);
     Circle largeCircle = new Circle(3);
     
     Rectangle smallRectangle = new Rectangle(1, 2);
     Square largeSquare = new Square(20);
     
     ArrayList<Shape> list = new ArrayList<Shape>(0);
     list.add(largeCircle);
     list.add(smallCircle);
     list.add(smallRectangle);
     list.add(largeSquare);
     
     System.out.println("The largest area is: " + findLargestArea(list).area());
  }
}

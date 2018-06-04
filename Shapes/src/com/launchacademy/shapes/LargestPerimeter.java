package com.launchacademy.shapes;

import java.util.ArrayList;

public class LargestPerimeter {
  public static Shape findLargestPerimeter(ArrayList<Shape> shapes) {
    double largestPerimeter = 0;
    Shape largestShape = null;
    for(Shape shape : shapes) {
      if(shape.perimeter() > largestPerimeter) {
        largestShape = shape;
        largestPerimeter = shape.perimeter();
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
     
     System.out.println("The largest perimeter is: " + findLargestPerimeter(list).area());
  }
}

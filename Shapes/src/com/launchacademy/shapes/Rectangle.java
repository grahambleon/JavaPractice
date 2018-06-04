package com.launchacademy.shapes;

public class Rectangle extends Shape {
  private double width;
  private double height;
  
  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  
  public double getHeight() {
    return this.height;
  }
  
  public double getWidth() {
    return this.width;
  }
  
  @Override
  public double perimeter() {
    return this.height * 2 + this.width * 2;
  }

  @Override
  public double area() {
    // TODO Auto-generated method stub
    return this.height * this.width;
  }

}

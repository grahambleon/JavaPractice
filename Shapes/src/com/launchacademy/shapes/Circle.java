package com.launchacademy.shapes;

public class Circle extends Shape {
  private double radius;
  
  Circle(double radius){
    this.radius = radius;
  }
  
  public double getRadius() {
    return this.radius;
  }
  @Override
  public double perimeter() {
    return Math.PI * this.getRadius() * this.getRadius();
  }

  @Override
  public double area() {
    // TODO Auto-generated method stub
    return 2 * Math.PI * this.getRadius();
  }

}

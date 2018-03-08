package com.ucbcba;

public class Circle implements Figure{

    private double radius;
    Circle(double radius) {    this.radius = radius;  }

    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return 2*Math.PI*(Math.pow(radius,2));
    }

    @Override
    public void draw() {
        System.out.println("area:" + this.area() + ", perimetro"+this.perimeter());

    }
}

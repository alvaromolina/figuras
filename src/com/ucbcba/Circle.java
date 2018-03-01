package com.ucbcba;

public class Circle implements Figure{

    private double radius;
    Circle(double radius) {    this.radius = radius;  }

    public double perimeter(){
        return radius;
    }
    public double area(){
        return radius;
    }

    @Override
    public void draw() {

    }
}

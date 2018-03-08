package com.ucbcba;

public class Square implements Figure {

    int width;
    Square(int width) {    this.width = width;  }

    @Override
    public double perimeter() {

        return 4*width;
    }

    @Override
    public double area() {
        return width*width;
    }

    @Override
    public void draw() {
        System.out.println("area:" + this.area() + ", perimetro"+this.perimeter());
        for (int i=0; i<width;i++){
            for (int e=0; e<width;e++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

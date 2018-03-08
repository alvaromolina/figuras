package com.ucbcba;

public class Main {

    private int cont=0;
    public static void main(String[] args) {
        Drawable cuadrado = new Square(2);
        Drawable cuadrado2 = new Square(10);
        Drawable redondo = new Circle(10);
        draw(cuadrado);
        draw(cuadrado2);
        draw(redondo);

        // write your code here
    }

    public static void draw(Drawable drawable){
        System.out.println(drawable.getClass().getSimpleName());
        drawable.draw();
    }
}

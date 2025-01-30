package com.example.code;

public class Circle extends Shape {
    private int radius;
    

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
       this.color = color;

        
    }

    public int getRadius() {
        return radius;
    }
 protected String color = "red";
}

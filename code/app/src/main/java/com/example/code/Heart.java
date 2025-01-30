package com.example.code;

public class Heart extends Shape {
    private int size;


    public Heart(int x, int y, int size, String color) {
        // Assuming Shape class has a constructor that accepts x and y
        super(x, y, color); // Call the constructor of Shape to set x and y
        this.size = size;
    }

}


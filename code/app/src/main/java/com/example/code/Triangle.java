package com.example.code;

public class Triangle extends Shape {
	private int x2;
	private int y2;
	private int x3;
	private int y3;

	public Triangle(int x, int y, int x2, int y2, int x3, int y3) {
		super(x, y);
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
}

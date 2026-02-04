package com.example.demo17.interfaces;

public record Rectangle(double width, double height) implements Shape {

    @Override
    public double area() {
        return width * height;
    }
}

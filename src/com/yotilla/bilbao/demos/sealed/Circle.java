package com.yotilla.bilbao.demos.sealed;

public final class Circle extends Shape {

    private final int area;

    public Circle(final int area) {
        this.area = area;
    }

    public Circle() {
        this.area = 5;
    }
    @Override
    public int getArea() {
        return area;
    }
}

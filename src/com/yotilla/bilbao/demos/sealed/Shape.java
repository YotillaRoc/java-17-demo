package com.yotilla.bilbao.demos.sealed;

public abstract sealed class Shape permits Parallelepiped, Circle, FreehandShape {
    public abstract int getArea();
}

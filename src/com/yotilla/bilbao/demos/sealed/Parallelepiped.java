package com.yotilla.bilbao.demos.sealed;

public abstract sealed class Parallelepiped extends Shape {

    public static final class Square extends Parallelepiped {
        @Override
        public int getArea() {
            return 20;
        }
    }
}

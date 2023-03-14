package com.yotilla.bilbao.demos.sealed;

public class Cactus extends FreehandShape {
    @Override
    public int getArea() {
        return 3;
    }

    public String describe() {
        return "I am a spiky cactus";
    }
}

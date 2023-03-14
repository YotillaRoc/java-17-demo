package com.yotilla.bilbao.demos.sealed;

import java.util.random.RandomGenerator;

public class ShapeGenerator {

    private static final RandomGenerator RANDOM = RandomGenerator.getDefault();

    public static Shape getSurpriseShape() {
        final int nextInt = RANDOM.nextInt(4);

        if (nextInt == 0) {
            return new Circle(RANDOM.nextInt(1, 11));
        } else if (nextInt == 1) {
            return new Parallelepiped.Square();
        } else if (nextInt == 2) {
            return new Cactus();
        } else {
            return null;
        }
    }
}

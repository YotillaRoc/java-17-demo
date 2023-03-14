package com.yotilla.bilbao.demos.patternmatching;

import com.yotilla.bilbao.demos.sealed.*;
import com.yotilla.bilbao.demos.sealed.Shape;

import static com.yotilla.bilbao.demos.patternmatching.Colors.*;

public class PatternMatching {
    private static String analyzeColor(final Colors color) {
        return switch (color) {
            case RED, GREEN -> "Not blue";
            case BLUE -> "Blue";
        };
    }

    private static String shapeAnalysis(final Shape shape) {
        final String deepAnalysis = switch (shape) {
            case null -> "There's nothing here";
            case Circle c -> String.format("It's round and has area %s", c.getArea());
            case Parallelepiped ignored -> "It's flat";
            case FreehandShape ignored -> "Mystery abound";
        };
        return deepAnalysis;
    }

    private static String typeAnalysis(final Object o) {
        return switch (o) {
            case null -> "Null.";
            case Integer ignored -> "Integer";
            case Long ignored -> "Long";
            default -> "Neither integer or long, I'm out of options man.";
        };
    }

    private static String detailedShapeAnalysis(final Shape shape) {
        return switch (shape) {
            case Circle c && c.getArea() > 5 -> "Big Circle";
            case Circle c && c.getArea() <= 3 -> "Small Circle";
            case Circle ignored -> "Just a normal Circle";
            case null, default -> "Not a circle";
        };
    }
    private static String cactusOrDie(final Shape shape) {
        if (shape instanceof Cactus c && c.getArea() > 5) {
            return c.describe();
        } else {
            return "Is a small cactus even a cactus?";
        }
    }

    public static void main(String[] args) {
        System.out.println("Shape analysis:");
        print(shapeAnalysis(new Circle()));
        print(shapeAnalysis(new Parallelepiped.Square()));
        print(shapeAnalysis(new Cactus()));
        print(shapeAnalysis(null));

        System.out.println("Type analysis:");
        print(typeAnalysis(2));
        print(typeAnalysis(2L));
        print(typeAnalysis(ShapeGenerator.getSurpriseShape()));

        System.out.println("Detailed shape analysis:");
        print(detailedShapeAnalysis(ShapeGenerator.getSurpriseShape()));
        print(detailedShapeAnalysis(ShapeGenerator.getSurpriseShape()));
        print(detailedShapeAnalysis(ShapeGenerator.getSurpriseShape()));
        print(detailedShapeAnalysis(ShapeGenerator.getSurpriseShape()));
        print(detailedShapeAnalysis(ShapeGenerator.getSurpriseShape()));
        print(detailedShapeAnalysis(ShapeGenerator.getSurpriseShape()));
        print(detailedShapeAnalysis(ShapeGenerator.getSurpriseShape()));
        print(detailedShapeAnalysis(ShapeGenerator.getSurpriseShape()));

        print(analyzeColor(RED));
        print(analyzeColor(GREEN));
        print(analyzeColor(BLUE));
    }

    private static void print(final String shapeAnalysis) {
        System.out.print(shapeAnalysis.indent(4));
    }
}

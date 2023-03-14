package com.yotilla.bilbao.demos.record;

public class RecordShowcase {

    public static void main(String[] args) {
        final Point point = new Point(2, 3);

        printPoint(point);

        printPoint(Point.builder()
                .x(5)
                .y(7)
                .build());
        final PointLombok pointLombok = new PointLombok(2, 3);

        System.out.printf("PointLombok at (%s, %s)", pointLombok.getX(), pointLombok.getY());
    }

    private static void printPoint(final Point point) {
        System.out.printf("Point at (%s, %s)%n", point.x(), point.y());
    }
}

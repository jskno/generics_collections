package com.jskno.d_wildcards;

import com.jskno.d_wildcards.model.Circle;
import com.jskno.d_wildcards.model.Rectangle;
import com.jskno.d_wildcards.model.Shape;
import java.util.List;

public class CWildCardsWithModel {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        List<Shape> shapes = List.of(rectangle, circle);

        drawAll(shapes);

        // Compile error
        List<Rectangle> rectangles = List.of(new Rectangle(), new Rectangle(), new Rectangle());
//        drawAll(rectangles);
        myDrawAll(rectangles);
        drawWildAll(rectangles);

    }

    public static void drawAll(List<Shape> shapes) {
        shapes.forEach(Shape::draw);
    }

    // BOUNDED WILDCARDS parameter approach
    public static void myDrawAll(List<? extends Shape> shapes) {
        shapes.forEach(Shape::draw);
    }

    // BOUNDED TYPE PARAMETER APPROACH
    public static <T extends Shape> void drawWildAll(List<T> shapes) {
        shapes.forEach(Shape::draw);
    }

}

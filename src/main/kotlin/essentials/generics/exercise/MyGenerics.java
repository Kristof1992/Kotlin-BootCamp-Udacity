package essentials.generics.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyGenerics {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rect());

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());
        circles.add(new Oval());

//        List<String> strings = new ArrayList<>();

//        drawAll(circles); Compiler won't accept Collection<Circle> to read from
        List<Circle> onlyShapes = new ArrayList<>();

        writeTo(circles, shapes);
        System.out.println(onlyShapes);
    }

    // Can read from
    public static void drawAll(Collection<Shape> shapes) {
        for ( Shape s : shapes )
            s.draw();
    }

    /**
     * Can write to
     * <? super T> only makes sense to use with a generic type T otherwise explicit type
     * will suffice.
     * E.g. Collection<Shape> from, Collection<Circle> to ILLEGAL
     * WHY?
     * Can't add a superReference to a subReference
     */

    public static <T> void writeTo(Collection<? extends T> from, Collection<? super T> to) {
        to.addAll(from);
    }
}

abstract class Shape {
    abstract void draw();

}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rect extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Oval extends Circle {
    @Override
    void draw() {
        System.out.println("Drawing Oval");
    }
}

package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    private final Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        System.out.println(shape.getName() + " printed");
        System.out.printf("Its area is %.2f%n", shape.getArea());
    }
}

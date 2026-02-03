package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Rectangle(2, 3),
                new Circle(2),
                new Square(4)
        );

        for (Shape s : shapes) {
            new Renderer(s).draw();
            System.out.println("---");
        }
    }
}

package edu.cmu.cs.cs214.lab02.shapes;

public interface Shape {
    double getArea();

    default String getName() {
        return getClass().getSimpleName(); // Circle / Rectangle / Square
    }
}

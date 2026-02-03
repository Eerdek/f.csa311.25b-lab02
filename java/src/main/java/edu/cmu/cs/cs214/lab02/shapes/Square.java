package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private final double sideLen;

    public Square(double sideLen) {
        if (sideLen <= 0) throw new IllegalArgumentException("sideLen must be > 0");
        this.sideLen = sideLen;
    }

    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
}

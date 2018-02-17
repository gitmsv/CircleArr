package ua.jvlab.smlnk.objects;

public class Circle {


    public static final String NAME = "Output: -> CONST Circle...)";

    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle() {
        r = 5.0;
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    public static Circle comb(Circle cr1, Circle cr2) {
        return new Circle(cr1.r + cr2.r);
    }
}

package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Circle {
    private double radius;
    public Circle() { // 1st (default) constructor
        this.radius = 1.0;
    }
    public Circle(double radius) { // 2nd constructor
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*radius*Math.PI;
    }
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

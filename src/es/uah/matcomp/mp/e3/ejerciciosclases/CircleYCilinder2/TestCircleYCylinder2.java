package es.uah.matcomp.mp.e3.ejerciciosclases.CircleYCilinder2;

import es.uah.matcomp.mp.e3.ejerciciosclases.CircleCylinder.Cylinder;

public class TestCircleYCylinder2 {
    public static void main (String[] args) {
// Declare and allocate a new instance of cylinder
// with default color, radius, and height
        es.uah.matcomp.mp.e3.ejerciciosclases.CircleCylinder.Cylinder c1 = new es.uah.matcomp.mp.e3.ejerciciosclases.CircleCylinder.Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());
// Declare and allocate a new instance of cylinder
// specifying height, with default color and radius
        es.uah.matcomp.mp.e3.ejerciciosclases.CircleCylinder.Cylinder c2 = new es.uah.matcomp.mp.e3.ejerciciosclases.CircleCylinder.Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());
// Declare and allocate a new instance of cylinder
// specifying radius and height, with default color
        es.uah.matcomp.mp.e3.ejerciciosclases.CircleCylinder.Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());
    }
}

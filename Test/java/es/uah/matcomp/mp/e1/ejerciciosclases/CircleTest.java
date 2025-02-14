package es.uah.matcomp.mp.e1.ejerciciosclases;
import es.uah.matcomp.mp.e1.ejerciciosclases.Circle.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CircleTest {

    @Test
    void getRadius() {
        Circle c=new Circle(1.1);
        assertEquals(1.1, c.getRadius(),"El radio deberia ser 1.1");
    }

    @Test
    void setRadius(){
        Circle c= new Circle(1.1);
        c.setRadius(6.9);
        assertEquals(6.9, c.getRadius(),"El radio deberia deberia ser 6.9");
    }

    @Test
    void getArea() {
        Circle c= new Circle(1.0);
        assertEquals(Math.PI, c.getArea(),"El area debería ser pi");
    }

    @Test
    void getCircumference() {
        Circle c= new Circle();
        assertEquals(2*Math.PI, c.getCircumference(),"El perímetro debería ser 2pi");
    }

    @Test
    void testToString() {
        Circle c= new Circle(1.0);
        assertEquals("Circle[radius="+1.0+"]",c.toString());
    }
}
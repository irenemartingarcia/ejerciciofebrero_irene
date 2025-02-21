package es.uah.matcomp.mp.e3.ejerciciosclases.PointYMovablePoint;

import es.uah.matcomp.mp.e3.ejerciciosclases.PointYMovablePoint.Point.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PointTest {

    @Test
    void getX() {
        Point d= new Point();
        assertEquals(0.0f, d.getX(),"la x debería ser 0.0f");
    }

    @Test
    void setX() {
        Point d= new Point();
        d.setX(2.0f);
        assertEquals(2.0f, d.getX(),"la x debería ser 2.0f");

    }

    @Test
    void getY() {
        Point d= new Point();
        assertEquals(0.0f, d.getY(),"la y debería ser 0.0f");
    }

    @Test
    void setY() {
        Point d= new Point();
        d.setY(3.0f);
        assertEquals(3.0f, d.getY(),"la y debería ser 3.0f");
    }

    @Test
    void setXY() {
        Point d= new Point();
        d.setXY(1.0f,3.0f);
        assertEquals(1.0f,d.getX());
        assertEquals(3.0f,d.getY());

    }

    @Test
    void getXY() {
        Point d= new Point(2.0f, 6.0f);
        float[] coord = d.getXY();
        assertEquals(2.0f, coord[0]);
        assertEquals(6.0f, coord[1]);
    }

    @Test
    void testToString() {
        Point d= new Point();
        assertEquals("(0.0,0.0)", d.toString());

    }
}
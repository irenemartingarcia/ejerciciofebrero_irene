package es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint m=new MyPoint(12,3);
        assertEquals(12,m.getX(),"la x debería ser 12");
    }

    @Test
    void setX() {
        MyPoint m=new MyPoint();
        m.setX(43);
        assertEquals(43,m.getX(),"la x debería ser 43");
    }

    @Test
    void getY() {
        MyPoint m=new MyPoint(12,3);
        assertEquals(3,m.getY(),"la y debería ser 3");
    }

    @Test
    void setY() {
        MyPoint m=new MyPoint(12,3);
        m.setY(5);
        assertEquals(5,m.getY(),"la y debería ser 3");
    }

    @Test
    void getXY() {
        MyPoint m=new MyPoint(12,3);
        int[] coord = m.getXY();
        assertEquals(12, coord[0]);
        assertEquals(3, coord[1]);
    }

    @Test
    void setXY() {
        MyPoint m=new MyPoint(12,3);
        m.setXY(21,34);
        int[] coord = m.getXY();
        assertEquals(21, coord[0]);
        assertEquals(34, coord[1]);
    }

    @Test
    void testToString() {
        MyPoint m=new MyPoint(12,3);;
        assertEquals("(12,3)", m.toString(),"el mensaje debería ser (12,3)");
    }

    @Test
    void distance() {
        MyPoint m=new MyPoint(0,5);
        assertEquals(3,m.distance(0,2),"la distancia debería ser 3");
    }

    @Test
    void testDistance() {
        MyPoint m=new MyPoint(0,5);
        MyPoint m1=new MyPoint(0,2);
        assertEquals(3,m.distance(m1),"la distancia debería ser 3");
    }

    @Test
    void testDistance1() {
        MyPoint m=new MyPoint(0,5);
        assertEquals(5,m.distance(),"la distancia debería ser 5");
    }
}
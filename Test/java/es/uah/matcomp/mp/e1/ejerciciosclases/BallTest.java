package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.Ball.Ball;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball b=new Ball(1f,2f,3,4f,5f);
        assertEquals(1f, b.getX(),"la x debería ser 1");
    }

    @Test
    void getY() {
        Ball b=new Ball(1f,2f,3,4f,5f);
        assertEquals(2f, b.getY(),"la y debería ser 2");
    }

    @Test
    void getRadius() {
        Ball b=new Ball(1f,2f,3,4f,5f);
        assertEquals(3, b.getRadius(),"El radio debería ser 3");
    }

    @Test
    void getXDelta() {
        Ball b=new Ball(1f,2f,3,4f,5f);
        assertEquals(4f, b.getXDelta(),"xDelta debería ser 4");
    }

    @Test
    void getYDelta() {
        Ball b=new Ball(1f,2f,3,4f,5f);
        assertEquals(5f, b.getYDelta(),"yDelta debería ser 1");
    }

    @Test
    void setX() {
        Ball b=new Ball(1f,2f,3,4f,5f);
        b.setX(3f);
        assertEquals(3f, b.getX(),"la x debería ser 3");
    }

    @Test
    void setY() {
        Ball b=new Ball(1f,2f,3,4f,5f);
        b.setY(3f);
        assertEquals(3f, b.getY(),"la y debería ser 3");
    }

    @Test
    void setRadius() {
        Ball b=new Ball(1f,2f,3,4f,5f);
        b.setRadius(6);
        assertEquals(6, b.getRadius(),"El radio debería ser 6");
    }

    @Test
    void setXDelta() {
        Ball b=new Ball(1f,2f,3,4f,5f);
        b.setXDelta(3f);
        assertEquals(3f, b.getXDelta(),"xDelta debería ser 3");
    }

    @Test
    void setYDelta() {
        Ball b=new Ball(1f,2f,3,4f,5f);
        b.setYDelta(3f);
        assertEquals(3f, b.getYDelta(),"yDelta debería ser 3");
    }

    @Test
    void move() {
        Ball b=new Ball(1f,2f,3,4f,5f);
        b.move();
        assertEquals(5f, b.getX(),"la x debería ser 5");
        assertEquals(7f, b.getY(),"la x debería ser 7");
    }

    @Test
    void reflectHorizontal() {
        Ball b=new Ball(1f,2f,3,4f,5f);
        b.reflectHorizontal();
        assertEquals(-4f, b.getXDelta(),"Xdelta debería ser -4");
    }

    @Test
    void reflectVertical() {
        Ball b=new Ball(1f,2f,3,4f,5f);
        b.reflectVertical();
        assertEquals(-5f, b.getYDelta(),"ydelta debería ser -5");

    }

    @Test
    void testToString() {
        Ball b=new Ball(1f,2f,3,4f,5f);
        assertEquals("Ball[(1.0,2.0), speed=(4.0,5.0)]", b.toString(),"El mensaje debería ser:Ball[(1.0,2.0), speed=(4.0,5.0)]");
    }
}
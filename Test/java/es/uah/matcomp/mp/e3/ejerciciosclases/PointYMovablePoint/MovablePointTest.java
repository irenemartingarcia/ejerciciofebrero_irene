package es.uah.matcomp.mp.e3.ejerciciosclases.PointYMovablePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void getxSpeed() {
        MovablePoint m= new MovablePoint();
        assertEquals(0.0f, m.getxSpeed());


    }

    @Test
    void setxSpeed() {
        MovablePoint m= new MovablePoint();
        m.setxSpeed(3.0f);
        assertEquals(3.0f, m.getxSpeed());



    }

    @Test
    void getySpeed() {
        MovablePoint m= new MovablePoint();
        assertEquals(0.0f, m.getySpeed());


    }

    @Test
    void setySpeed() {
        MovablePoint m= new MovablePoint();
        m.setySpeed(3.0f);
        assertEquals(3.0f, m.getySpeed());


    }

    @Test
    void setSpeed() {
        MovablePoint m= new MovablePoint();
        m.setSpeed(2.0f,9.0f);
        assertEquals(2.0f, m.getxSpeed());
        assertEquals(9.0f, m.getySpeed());


    }

    @Test
    void getSpeed() {
        MovablePoint m= new MovablePoint(2.0f,3.0f);
        float[] c= m.getSpeed();
        assertEquals(2.0, c[0]);
        assertEquals(3.0, c[1]);
    }

    @Test
    void testToString() {
        MovablePoint m= new MovablePoint(2.0f,3.0f,4.0f,5.0f);
        assertEquals("(2.0,3.0),speed=(4.0,5.0)", m.toString());

    }

    @Test
    void move() {
        MovablePoint m= new MovablePoint(2.0f,3.0f,4.0f,5.0f);
        m.Move();
        assertEquals(6.0,m.getX());
        assertEquals(8.0,m.getY());
    }
}
package es.uah.matcomp.mp.e3.ejerciciosclases.Point2DyPoint3D;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D d= new Point3D();
        assertEquals(0.0f, d.getZ());
    }

    @Test
    void setZ() {
        Point3D d= new Point3D();
        d.setZ(4.0f);
        assertEquals(4.0f, d.getZ());
    }

    @Test
    void setXY() {
        Point3D d= new Point3D();
        d.setXY(1.0f,3.0f);
        assertEquals(1.0f,d.getX());
        assertEquals(3.0f,d.getY());



    }

    @Test
    void setXYZ() {
        Point3D d= new Point3D();
        d.setXY(1.0f,3.0f);
        assertEquals(1.0f,d.getX());
        assertEquals(3.0f,d.getY());
        assertEquals(0.0f,d.getZ());
    }

    @Test
    void getXYZ() {
        Point3D d= new Point3D();
        assertEquals(1.0f,d.getX());
        assertEquals(3.0f,d.getY());
    }

    @Test
    void testToString() {
    }
}
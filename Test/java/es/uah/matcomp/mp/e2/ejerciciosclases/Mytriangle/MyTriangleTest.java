package es.uah.matcomp.mp.e2.ejerciciosclases.Mytriangle;

import es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint.MyPoint;
import es.uah.matcomp.mp.e2.ejerciciosclases.MyTriangle.MyTriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyTriangle t1= new MyTriangle(2,3,4,5,6,8);
        assertEquals("Triangle[v1=(2,3),v2=(4,5),v3=(6,8)]",t1.toString(),"el mensaje debería ser Triangle[v1=(2,3),v2=(4,5),v3=(6,8)]");
    }

    @Test
    void getPerimeter() {
        MyTriangle t1= new MyTriangle(2,3,4,5,6,8);
        assertEquals(12.837102637643028,t1.getPerimeter(),"el perimetro debería ser 12.837102637643028");
    }

    @Test
    void getType() {
        MyPoint m1= new MyPoint(2, 3);
        MyPoint m2= new MyPoint(2, 4);
        MyPoint m3= new MyPoint(1, 0);
        MyTriangle t1= new MyTriangle(0,0,0,0,0,0);
        assertEquals("Equilátero",t1.getType(),"el mensaje debería ser equilatero");
        MyTriangle t2= new MyTriangle(0,0,6,0,3,5);
        assertEquals("Isósceles",t2.getType(),"el mensaje debería ser isosceles");
        MyTriangle t3= new MyTriangle(m1,m2,m3);
        assertEquals("Escaleno",t3.getType(),"el mensaje debería ser escaleno");

    }
}
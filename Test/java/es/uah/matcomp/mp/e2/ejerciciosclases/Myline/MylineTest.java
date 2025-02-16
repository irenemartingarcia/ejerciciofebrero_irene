package es.uah.matcomp.mp.e2.ejerciciosclases.Myline;

import es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MylineTest {

    @Test
    void getBegin() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        assertEquals(punto1,linea.getBegin(),"el comienzo debería ser punto1");
    }

    @Test
    void setBegin() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        MyPoint punto3= new MyPoint(2,1);
        Myline linea= new Myline(punto1, punto2);
        linea.setBegin(punto3);
        assertEquals(punto3,linea.getBegin(),"el comienzo debería ser punto3");
    }

    @Test
    void getEnd() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        assertEquals(punto2,linea.getEnd(),"el final debería ser punto2");
    }

    @Test
    void setEnd() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        linea.setEnd(punto1);
        assertEquals(punto1,linea.getEnd(),"el final debería ser punto1");

    }

    @Test
    void getBeginX() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        assertEquals(1,linea.getBeginX(),"la x del inicio debería ser 1");
    }

    @Test
    void setBeginX() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        linea.setBeginX(2);
        assertEquals(2,linea.getBeginX(),"la x del inicio debería ser 2");
    }

    @Test
    void getBeginY() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        assertEquals(0,linea.getBeginY(),"la y del inicio debería ser 0");
    }

    @Test
    void setBeginY() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        linea.setBeginY(8);
        assertEquals(8,linea.getBeginY(),"la y del inicio debería ser 8");

    }

    @Test
    void getEndX() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        assertEquals(0,linea.getEndX(),"la x del final debería ser 0");
    }

    @Test
    void setEndX() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        linea.setEndX(3);
        assertEquals(3,linea.getEndX(),"la x del final debería ser 3");
    }

    @Test
    void getEndY() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        assertEquals(1,linea.getEndY(),"la y del final debería ser 1");
    }

    @Test
    void setEndY() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        linea.setEndY(3);
        assertEquals(3,linea.getEndY(),"la y del final debería ser 3");
    }

    @Test
    void getBeginXY() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        int[] coord= linea.getBeginXY();
        assertEquals(1, coord[0],"la x del inicio debería ser 1");
        assertEquals(0, coord[1],"la y del inicio debería ser 0");
    }

    @Test
    void setBeginXY() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        linea.setBeginXY(3,8);
        int[] coord= linea.getBeginXY();
        assertEquals(3, coord[0],"la x del inicio debería ser 3");
        assertEquals(8, coord[1],"la y del inicio debería ser 8");

    }

    @Test
    void getEndXY() {
        Myline linea= new Myline(1,0,0,1);
        int[] coord= linea.getEndXY();
        assertEquals(0, coord[0],"la x del final debería ser 0");
        assertEquals(1, coord[1],"la y del final debería ser 1");
    }

    @Test
    void setEndXY() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        linea.setEndXY(2,5);
        int[] coord= linea.getEndXY();
        assertEquals(2, coord[0],"la x del final debería ser 2");
        assertEquals(5, coord[1],"la y del final debería ser 5");
    }

    @Test
    void getLength() {MyPoint punto1= new MyPoint(4,1);
        MyPoint punto2= new MyPoint(2,1);
        Myline linea= new Myline(punto1, punto2);
        assertEquals(2, linea.getLength(),"la log debería ser 2");


    }

    @Test
    void getGradient() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        assertEquals(3*Math.PI/4,linea.getGradient(),"el ángulo debería ser 3pi/4");
    }

    @Test
    void testToString() {
        MyPoint punto1= new MyPoint(1,0);
        MyPoint punto2= new MyPoint(0,1);
        Myline linea= new Myline(punto1, punto2);
        assertEquals("Myline[begin=(1,0),end=(0,1)]", linea.toString(),"el mensaje debería ser Myline[begin=(1,0),end=(0,1)] ");
    }
}
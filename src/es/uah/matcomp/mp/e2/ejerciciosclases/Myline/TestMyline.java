package es.uah.matcomp.mp.e2.ejerciciosclases.Myline;

import es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint.MyPoint;

public class TestMyline {
    public static void main(String[] args) {
        // Test program to test all constructors and public methods
        // Test constructor- por defecto
        MyPoint m1= new MyPoint(1,0);
        MyPoint m2= new MyPoint(2,0);
        Myline l1 = new Myline(m1,m2);
        System.out.println("linea1="+l1);
        Myline l2 = new Myline(12,0,9,7);
        System.out.println("linea2="+l2);
        // Obtener y mostrar la longitud y el gradiente de line1
        System.out.println("Longitud de Linea 1: " + l1.getLength());
        System.out.println("Gradiente de Linea 1: " + l1.getGradient());
        // Test toString()
        System.out.println(l1);
        // Test setters
        l2.setBegin(m2);
        l2.setBeginX(1);
        l2.setBeginY(1);
        l2.setEndX(5);
        l2.setEndY(5);
        l2.setEnd(m1);
        l2.setBeginXY(2,3);
        l2.setEndXY(1,3);
        // Test getters
        System.out.println("Longitud de Linea 2: " + l2.getLength());
        System.out.println("Gradiente de Linea 2: " + l2.getGradient());
        System.out.println("Gradiente de Linea 2: " + l2.getEnd());
        System.out.println("Gradiente de Linea 2: " + l2.getBeginX());
        System.out.println("Gradiente de Linea 2: " + l2.getBeginY());
        System.out.println("Gradiente de Linea 2: " + l2.getEndX());
        System.out.println("Gradiente de Linea 2: " + l2.getEndY());
        System.out.println("Gradiente de Linea 2: " + l2.getBeginXY());
        System.out.println("Gradiente de Linea 2: " + l2.getEndXY());
    }
}



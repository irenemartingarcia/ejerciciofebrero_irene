package es.uah.matcomp.mp.e2.ejerciciosclases.MyCircle;

import es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint.MyPoint;

public class TestMyCircle {
    public static void main(String[] args) {
        //Constructores
        MyCircle c = new MyCircle();
        MyCircle c1 = new MyCircle(2, 3, 4);
        MyPoint p = new MyPoint(2, 3);
        MyCircle c2 = new MyCircle(p, 1);
        //toString
        System.out.println(c);
        //Setters
        c1.setCenterX(9);
        c1.setCenterY(8);
        c1.setRadius(2);
        c2.setCenterXY(2,3);
        c.setCenter(p);
        //getters
        int[] center= c2.getCenterXY();
        System.out.println("x is"+center[0]);
        System.out.println("y is"+center[1]);
        System.out.println(c.getCenterX());
        System.out.println(c.getCenterY());
        System.out.println(c.getCenter());
        System.out.println(c.getArea());//test area
        System.out.println(c.getCircumference());//test circunferencia
        System.out.println(c.distance(c1));//test distance



    }
}
package es.uah.matcomp.mp.e2.ejerciciosclases.MyTriangle;

import es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint.MyPoint;

public class TestMyTriangle {
    public static void main(String[] args){
        MyPoint v1= new MyPoint(3, 0);
        MyPoint v2= new MyPoint(0, 1);
        MyPoint v3= new MyPoint(5, 6);
        MyTriangle t1= new MyTriangle(v1, v2, v3);
        MyTriangle t2= new MyTriangle(1, 2, 4, 6,3,5);
        //Test toString
        System.out.println(t2);
        System.out.println("el perimetro es"+t1.getPerimeter());
        System.out.println("el tipo es"+t1.getType());


    }

}

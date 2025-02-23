package es.uah.matcomp.mp.e3.ejerciciosclases.CircleYCilinder2;

public class Cylinder {
        private double height;
        private Circle base;// private variable
        // Constructor with default color, radius and height
        public Cylinder() {
            base = new Circle(); // call superclass no-arg constructor Circle()
            height = 1.0;
        }
        public Cylinder(double radius){
            base= new Circle(radius);
            this.height=height;
        }

        public Cylinder(double radius, double height) {
            base= new Circle(radius);
            this.height = height;
        }
        public Cylinder(double radius, double height,String color) {
            base= new Circle(radius, color);
            this.height = height;
        }
        // A public method for retrieving the height
        public double getHeight() {
            return height;
        }
        // A public method for computing the volume of cylinder
// use superclass method getArea() to get the base area
        public double getVolume() {
            return base.getArea()*height;
        }
        public void setHeight(double height) {
            this.height = height;
        }
        @Override
        public String toString() { // in Cylinder class
            return "Cylinder: " + base.toString()
                    + " height=" + height;
        }
    }

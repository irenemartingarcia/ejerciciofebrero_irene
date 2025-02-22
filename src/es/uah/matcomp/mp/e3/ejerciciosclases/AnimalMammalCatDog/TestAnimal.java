package es.uah.matcomp.mp.e3.ejerciciosclases.AnimalMammalCatDog;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal("Ana");
        Mammal m = new Mammal("Álvaro");
        Cat c = new Cat("pepe");
        Dog d = new Dog("Juan");
        //tets toString
        System.out.println(a);
        System.out.println(m);
        System.out.println(c);
        System.out.println(d);
        //
        c.greets();
        d.greets();
        d.greets(d);


    }
}
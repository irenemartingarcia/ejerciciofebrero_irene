package es.uah.matcomp.mp.e3.ejerciciosclases.AnimalMammalCatDog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat c= new Cat("Briend");
        c.greets();


    }

    @Test
    void testToString() {
        Cat c= new Cat("Briend");
        assertEquals("Cat[Mammal[Animal[name=Briend]]]",c.toString());


    }
}
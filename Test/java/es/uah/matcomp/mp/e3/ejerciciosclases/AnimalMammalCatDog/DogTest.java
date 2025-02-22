package es.uah.matcomp.mp.e3.ejerciciosclases.AnimalMammalCatDog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog d= new Dog("Nieve");
        d.greets();
    }

    @Test
    void testGreets() {
        Dog d= new Dog("Nieve");
        Dog d1= new Dog("Copito");
        d.greets(d1);

    }

    @Test
    void testToString() {
        Dog d= new Dog("Nieve");
        assertEquals("Dog[Mammal[Animal[name=Nieve]]]", d.toString());
    }
}
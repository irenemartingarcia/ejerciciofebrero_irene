package es.uah.matcomp.mp.e3.ejerciciosclases.AnimalMammalCatDog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testToString() {
        Mammal m= new Mammal("Trufa");
        assertEquals("Mammal[Animal[name=Trufa]]",m.toString());
    }
}
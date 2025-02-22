package es.uah.matcomp.mp.e3.ejerciciosclases.AnimalMammalCatDog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString() {
        Animal a= new Animal("Yara");
        assertEquals("Animal[name=Yara]", a.toString());

    }
}
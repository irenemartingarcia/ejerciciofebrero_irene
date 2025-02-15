package es.uah.matcomp.mp.e2.ejerciciosclases.CustomerYinvoice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer c= new Customer(100, "Samu",23);
        assertEquals(100, c.getId(), "El id debería ser 100");
    }

    @Test
    void getName() {
        Customer c= new Customer(100, "Samu",23);
        assertEquals("Samu", c.getName(), "El nombre debería ser Samu");
    }

    @Test
    void getDiscount() {
        Customer c= new Customer(100, "Samu",23);
        assertEquals(23, c.getDiscount(), "El descuento debería ser 23");
    }

    @Test
    void setDiscount() {
        Customer c= new Customer(100, "Samu",23);
        c.setDiscount(34);
        assertEquals(34, c.getDiscount(), "El descuento debería ser 34");
    }

    @Test
    void testToString() {
        Customer c= new Customer(100, "Samu",23);
        assertEquals("Samu(100)(23%)", c.toString(), "El mensaje debería ser Samu(100)(23%)");
    }
}
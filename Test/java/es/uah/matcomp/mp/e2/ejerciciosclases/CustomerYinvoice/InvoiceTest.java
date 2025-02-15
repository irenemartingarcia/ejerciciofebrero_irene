package es.uah.matcomp.mp.e2.ejerciciosclases.CustomerYinvoice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Customer c=new Customer(12,"pepe", 45);
        Invoice i= new Invoice(100,c, 21.0);
        assertEquals(100, i.getId(),"el id debería ser 100");
    }

    @Test
    void getCustomer() {
        Customer c=new Customer(12,"pepe", 45);
        Invoice i= new Invoice(100,c, 21.0);
        assertEquals(c, i.getCustomer(),"el cliente debería ser c");
    }

    @Test
    void setCustomer() {
        Customer c=new Customer(12,"pepe", 45);
        Customer v=new Customer(10,"pepa", 49);
        Invoice i= new Invoice(100,c, 21.0);
        i.setCustomer(v);
        assertEquals(v, i.getCustomer(),"el cliente debería ser v");
    }

    @Test
    void getAmount() {
        Customer c=new Customer(12,"pepe", 45);
        Invoice i= new Invoice(100,c, 21.0);
        assertEquals(21.0, i.getAmount(),"el porcentaje debería ser 21.0");
    }

    @Test
    void setAmount() {
        Customer c=new Customer(12,"pepe", 45);
        Invoice i= new Invoice(100,c, 21.0);
        i.setAmount(34.0);
        assertEquals(34.0, i.getAmount(),"el porcentaje debería ser 34.0");
    }

    @Test
    void getCustomerId() {
        Customer c=new Customer(12,"pepe", 45);
        Invoice i= new Invoice(100,c, 21.0);
        assertEquals(12, i.getCustomerId(),"el id del cliente debería ser 12");
    }

    @Test
    void getCustomerName() {
        Customer c=new Customer(12,"pepe", 45);
        Invoice i= new Invoice(100,c, 21.0);
        assertEquals("pepe", i.getCustomerName(),"el nombre del cliente es pepe");
    }

    @Test
    void getCustomerDiscount() {
        Customer c=new Customer(12,"pepe", 45);
        Invoice i= new Invoice(100,c, 21.0);
        assertEquals(45, i.getCustomerDiscount(),"el descuento debería ser 45");
    }

    @Test
    void getAmountAfterDiscount() {
        Customer c=new Customer(12,"pepe", 50);
        Invoice i= new Invoice(100,c, 100.0);
        assertEquals(50, i.getAmountAfterDiscount(),"el porcentaje debería ser 50");
    }

    @Test
    void testToString() {
        Customer c=new Customer(12,"pepe", 45);
        Invoice i= new Invoice(100,c, 21.0);
        assertEquals("Invoice[id=100,customer=pepe(12)(45%),amount=21.0]", i.toString(),"el mensaje debería ser Invoice[id=100,customer=pepe(12)(45%),amount=21.0] ");

    }
}
package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem i=new InvoiceItem("A113","hola",13,5);
        assertEquals("A113", i.getId(),"El id debería ser A113");
    }

    @Test
    void getDesc() {
        InvoiceItem i=new InvoiceItem("A113","hola",13,5);
        assertEquals("hola",i.getDesc(), "El desc debería ser hola");

    }

    @Test
    void getQty() {
        InvoiceItem i=new InvoiceItem("A113","hola",13,5);
        assertEquals(13,i.getQty(),"El qty debería ser 13");
    }

    @Test
    void setQty() {
        InvoiceItem i=new InvoiceItem("A113","hola",13,5);
        i.setQty(2);
        assertEquals(2, i.getQty(),"el qty debería ser 2");
    }

    @Test
    void getUnitPrice() {
        InvoiceItem i=new InvoiceItem("A113","hola",13,5);
        assertEquals(5,i.getUnitPrice(),"El precio único debería ser 5" );
    }

    @Test
    void setUnitPrice() {
        InvoiceItem i=new InvoiceItem("A113","hola",13,5);
        i.setUnitPrice(3);
        assertEquals(3,i.getUnitPrice(),"el precio único debería ser 3");
    }

    @Test
    void getTotal() {
        InvoiceItem i=new InvoiceItem("A113","hola",13,5);
        assertEquals(65,i.getTotal(),"El total debería ser 65");
    }

    @Test
    void testToString() {
        InvoiceItem i=new InvoiceItem("A113","hola",13,5.0);
        assertEquals("InvoiceItem [id=A113,desc=hola,qty=13,unitPrice=5.0]", i.toString(),"el mensaje debería ser InvoiceItem [id=A113,desc=hola,qty=13,unitPrice=5.0]");
    }

}
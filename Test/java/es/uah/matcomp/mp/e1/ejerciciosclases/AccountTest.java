package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.Account.Account;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void getID() {
        Account a=new Account("A101","Irene");
        assertEquals("A101", a.getID(), "El id debería ser A101");
    }


    @org.junit.jupiter.api.Test
    void getBalance() {
        Account a = new Account("A101","Irene",12);
        assertEquals(12, a.getBalance(), "El balance debería ser 12");
    }

    @org.junit.jupiter.api.Test
    void credit() {
        Account a = new Account("A101","Irene",12);
        a.credit(3);
        assertEquals(15, a.getBalance(),"el credit debería ser 15");
    }

    @org.junit.jupiter.api.Test
    void debit() {
        Account a = new Account("A101","Irene",12);
        a.debit(12);
        assertEquals(0, a.getBalance(),"el dedit debería ser 0");
        assertEquals(0, a.debit(2000),"el dedit debería ser 0");

    }

    @org.junit.jupiter.api.Test
    void transferTo() {
        Account a = new Account("A101","Irene",12);
        Account b = new Account("A102","Samu",1);
        a.transferTo(b,12);
        assertEquals(13, b.getBalance(),"se deberían transferir 13");
        assertEquals(0, a.transferTo(b,4),"se deberían transferir 0");

    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Account a = new Account("A101","Irene",12);
        assertEquals("Account[id=A101,name=Irene,balance=12]", a.toString(), "lo que debería salir es:Account[id=A101,name=Irene,balance=12]");

    }

    @org.junit.jupiter.api.Test
    void getName() {
        Account a = new Account("A101","Irene",12);
        assertEquals("Irene", a.getName(),"El nombre debería ser Irene");
    }
}
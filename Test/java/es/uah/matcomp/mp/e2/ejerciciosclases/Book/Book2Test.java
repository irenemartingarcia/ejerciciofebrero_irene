package es.uah.matcomp.mp.e2.ejerciciosclases.Book;

import es.uah.matcomp.mp.e2.ejerciciosclases.Author.Author;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Book2Test {

    @Test
    void getName() {
        Author[] a=new Author[1];
        a[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        Book2 x= new Book2("Pájaro",a,3.0,2);
        assertEquals("Pájaro", x.getName(),"El nombre debería ser Pájaro");
    }

    @Test
    void getAuthors() {
        Author[] a=new Author[1];
        a[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        Book2 x= new Book2("Pájaro",a,3.0);
        assertEquals(a, x.getAuthors(),"Los autores deberían ser a");
    }

    @Test
    void getPrice() {
        Author[] a=new Author[1];
        a[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        Book2 x= new Book2("Pájaro",a,3.0,2);
        assertEquals(3.0, x.getPrice(),"El precio debería ser 3.0");
    }

    @Test
    void setPrice() {
        Author[] a=new Author[1];
        a[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        Book2 x= new Book2("Pájaro",a,3.0,2);
        x.setPrice(8);
        assertEquals(8, x.getPrice(),"El precio debería ser 8");
    }

    @Test
    void getQty() {
        Author[] a=new Author[1];
        a[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        Book2 x= new Book2("Pájaro",a,3.0,2);
        assertEquals(2, x.getQty(),"La cantidad debería ser 2");
    }

    @Test
    void setQty() {
        Author[] a=new Author[1];
        a[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        Book2 x= new Book2("Pájaro",a,3.0,2);
        x.setQty(4);
        assertEquals(4, x.getQty(),"La cantidad debería ser 4");
    }

    @Test
    void testToString() {
        Author[] a=new Author[1];
        a[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        Book2 x= new Book2("Pájaro",a,3.0,2);
        assertEquals("Book[name=Pájaro,authors={[Author[name=Tan Ah Teck,email=AhTeck@somewhere.com,gender=m]]},price=3.0,qty=2]", x.toString(),"El mensaje debería ser Book[name=Pájaro,authors={[Author[name=Tan Ah Teck,email=AhTeck@somewhere.com,gender=m]]},price=3.0,qty=2] ");
    }

    @Test
    void getAuthorNames() {
        Author[] a=new Author[2];
        a[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        a[1] = new Author("Paco", "Paco@somewhere.com", 'm');
        Book2 x= new Book2("Pájaro",a,3.0,2);
        assertEquals("Tan Ah Teck, Paco",x.getAuthorNames(),"los nombres de los autores deberían ser Tan Ah Teck, Paco");

    }
}
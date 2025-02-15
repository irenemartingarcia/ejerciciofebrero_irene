package es.uah.matcomp.mp.e2.ejerciciosclases.AuthorYBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        Author a=new Author("irene","irene@gmail.com");
        Book b= new Book("Saber", "hola",a,2.0 );
        assertEquals("Saber",b.getIsbn(),"el isbn debería ser Saber ");
    }

    @Test
    void getName() {
        Author a=new Author("irene","irene@gmail.com");
        Book b= new Book("Saber", "hola",a,2.0 );
        assertEquals("hola",b.getName(),"el nombre debería ser hola ");
    }

    @Test
    void getAuthor() {
        Author a=new Author("irene","irene@gmail.com");
        Book b= new Book("Saber", "hola",a,2.0 );
        assertEquals(a,b.getAuthor(),"el autor debería ser a ");
    }

    @Test
    void getPrice() {
        Author a=new Author("irene","irene@gmail.com");
        Book b= new Book("Saber", "hola",a,2.0 );
        assertEquals(2.0,b.getPrice(),"el precio debería ser 2.0 ");
    }

    @Test
    void setPrice() {
        Author a=new Author("irene","irene@gmail.com");
        Book b= new Book("Saber", "hola",a,2.0 );
        b.setPrice(3.0);
        assertEquals(3.0,b.getPrice(),"el precio debería ser 3.0 ");
    }

    @Test
    void getQty() {
        Author a=new Author("irene","irene@gmail.com");
        Book b= new Book("Saber", "hola",a,2.0, 7);
        assertEquals(7,b.getQty(),"el qty debería ser 7 ");
    }

    @Test
    void setQty() {
        Author a=new Author("irene","irene@gmail.com");
        Book b= new Book("Saber", "hola",a,2.0,7);
        b.setQty(2);
        assertEquals(2,b.getQty(),"el qty debería ser 2");
    }

    @Test
    void testToString() {
        Author a=new Author("irene","irene@gmail.com");
        Book b= new Book("Saber", "hola",a,2.0 );
        assertEquals("Book[isbn=Saber,name=hola,Author[name=irene,email=irene@gmail.com],price=2.0,qty=0]",b.toString(),"el mensaje debería ser Book[isbn=Saber,name=hola,Author[name=irene,email=irene@gmail.com],price=2.0,qty=0]");
    }

    @Test
    void getAuthorName() {
        Author a=new Author("irene","irene@gmail.com");
        Book b= new Book("Saber", "hola",a,2.0 );
        assertEquals("irene", b.getAuthorName(),"El nombre del autor debería ser irene");

    }
}
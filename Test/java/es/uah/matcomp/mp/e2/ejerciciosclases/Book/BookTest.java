package es.uah.matcomp.mp.e2.ejerciciosclases.Book;

import es.uah.matcomp.mp.e2.ejerciciosclases.Author.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Author c=new Author("paula","paula@uah.com",'f');
        Book b=new Book("Vuela", c, 12.0f,3);
        assertEquals("Vuela",b.getName(),"el nombre debería ser Vuela");

    }
    @Test
    void getAuthor() {
        Author c=new Author("paula","paula@uah.com",'f');
        Book b=new Book("Vuela", c, 12.0f,3);
        assertEquals(c,b.getAuthor(),"El autor debería ser c");


    }

    @Test
    void getPrice() {
    }

    @Test
    void setPrice() {
    }

    @Test
    void getQty() {
    }

    @Test
    void setQty() {
    }

    @Test
    void testToString() {
    }

    @Test
    void getAuthorName() {
    }

    @Test
    void getAuthorEmail() {
    }

    @Test
    void getAuthorGender() {
    }
}
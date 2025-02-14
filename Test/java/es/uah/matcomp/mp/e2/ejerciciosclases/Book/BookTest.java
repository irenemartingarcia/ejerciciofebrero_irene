package es.uah.matcomp.mp.e2.ejerciciosclases.Book;

import es.uah.matcomp.mp.e2.ejerciciosclases.Author.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Author c=new Author("paula","paula@uah.com",'f');
        Book b=new Book("Vuela", c, 12);
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
        Author c=new Author("paula","paula@uah.com",'f');
        Book b=new Book("Vuela", c, 12,3);
        assertEquals(12,b.getPrice(),"el precio debería ser 12");
    }

    @Test
    void setPrice() {
        Author c=new Author("paula","paula@uah.com",'f');
        Book b=new Book("Vuela", c, 12,3);
        b.setPrice(3);
        assertEquals(3, b.getPrice(),"el precio debería ser 3");
    }

    @Test
    void getQty() {
        Author c=new Author("paula","paula@uah.com",'f');
        Book b=new Book("Vuela", c, 12,3);
        assertEquals(3,b.getQty(),"la cantidad debería ser 3");
    }

    @Test
    void setQty() {
        Author c=new Author("paula","paula@uah.com",'f');
        Book b=new Book("Vuela", c, 12,3);
        b.setQty(4);
        assertEquals(4,b.getQty(),"la cantidad debería ser 4");

    }

    @Test
    void testToString() {
        Author c=new Author("paula","paula@uah.com",'f');
        Book b=new Book("Vuela", c, 12.0,3);
        assertEquals("Book[name=Vuela,Author[Author[name=paula,email=paula@uah.com,gender=f]],price=12.0,qty=3]",b.toString(),"El mensaje debería ser:Book[name=Vuela,Author[Author[name=paula,email=paula@uah.com,gender=f],price=12.0,qty=3]]");
    }

    @Test
    void getAuthorName() {
        Author c=new Author("paula","paula@uah.com",'f');
        Book b=new Book("Vuela", c, 12,3);
        assertEquals("paula",b.getAuthorName(),"El nombre del autor debería ser paula");

    }

    @Test

    void getAuthorEmail() {
        Author c=new Author("paula","paula@uah.com",'f');
        Book b=new Book("Vuela", c, 12,3);
        assertEquals("paula@uah.com",b.getAuthorEmail(),"El email del autor debería ser paula@uah.com");

    }

    @Test
    void getAuthorGender() {
        Author c=new Author("paula","paula@uah.com",'f');
        Book b=new Book("Vuela", c, 12,3);
        assertEquals('f',b.getAuthorGender(),"El gender del autor debería ser f");

    }
}
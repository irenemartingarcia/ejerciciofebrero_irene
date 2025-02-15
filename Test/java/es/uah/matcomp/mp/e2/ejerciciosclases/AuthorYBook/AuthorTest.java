package es.uah.matcomp.mp.e2.ejerciciosclases.AuthorYBook;

import es.uah.matcomp.mp.e2.ejerciciosclases.AuthorYBook.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author h = new Author ("Nuria","nuria@gmail.com");
        assertEquals("Nuria", h.getName(),"el nombre debería ser Nuria");
    }

    @Test
    void getEmail() {
        Author h = new Author ("Nuria","nuria@gmail.com");
        assertEquals("nuria@gmail.com", h.getEmail(),"el email debería ser nuria@gmail.com");
    }

    @Test
    void setEmail() {
        Author h = new Author ("Nuria","nuria@gmail.com");
        h.setEmail("nuri@gmail.com");
        assertEquals("nuri@gmail.com",h.getEmail(),"el email debería ser nuri@gmail.com");

    }

    @Test
    void testToString() {
        Author h = new Author ("Nuria","nuria@gmail.com");
        assertEquals("Author[name=Nuria,email=nuria@gmail.com]", h.toString(),"el mensaje debería ser Author[name=Nuria,email=nuria@gmail.com] ");
    }
}
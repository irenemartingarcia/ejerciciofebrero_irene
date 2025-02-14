package es.uah.matcomp.mp.e2.ejerciciosclases.Author;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author a =new Author("Paula", "paula@uah.com",'f');
        assertEquals("Paula", a.getName(), "El nombre debería ser Paula");
    }

    @Test
    void getEmail() {
        Author a =new Author("Paula", "paula@uah.com",'f');
        assertEquals("paula@uah.com", a.getEmail(),"el email debería ser paula@uah.com");

    }

    @Test
    void setEmail() {
        Author a =new Author("Paula", "paula@uah.com",'f');
        a.setEmail("paula@u.com");
        assertEquals("paula@u.com",a.getEmail(), "el email debería ser paula@u.com");
    }

    @Test
    void getGender() {
        Author a =new Author("Paula", "paula@uah.com",'f');
        assertEquals('f',a.getGender(),"El gender debería ser 'f");
    }

    @Test
    void testToString() {
        Author a =new Author("Paula", "paula@uah.com",'f');
        assertEquals("Author[name=Paula,email=paula@uah.com,gender=f]", a.toString(),"El mensaje debería ser:Author[name=Paula,email=paula@uah.com,gender=f]");
    }
}
package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.Employee.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee e= new Employee(12, "Samuel","García", 3455);
        assertEquals(12,e.getId(),"El id debería ser 12");
    }

    @Test
    void getSalary() {
        Employee e= new Employee(12, "Samuel","García", 3455);
        assertEquals(3455,e.getSalary(),"El salario debería ser 3455");

    }

    @Test
    void getFirstName() {
        Employee e= new Employee(12, "Samuel","García", 3455);
        assertEquals("Samuel",e.getFirstName(),"el nombre debería ser Samuel");
    }

    @Test
    void getLastName() {
        Employee e= new Employee(12, "Samuel","García", 3455);
        assertEquals("García",e.getLastName(),"el apellido debería ser García");
    }

    @Test
    void setSalary() {
        Employee e= new Employee(12, "Samuel","García", 3455);
        e.setSalary(2000);
        assertEquals(2000,e.getSalary(),"el salario debería ser 2000");
    }

    @Test
    void getName() {
        Employee e= new Employee(12, "Samuel","García", 3455);
        assertEquals("Samuel García",e.getName(),"el nombre y apellido debería ser:Samuel García");
    }

    @Test
    void getAnnualSalary() {
        Employee e= new Employee(12, "Samuel","García", 2);
        assertEquals(24,e.getAnnualSalary(),"el salario anual debería ser 24");
    }

    @Test
    void raiseSalary() {
        Employee e= new Employee(12, "Samuel","García", 100);
        e.raiseSalary(50);
        assertEquals(150,e.getSalary(),"El salario debería ser 50");
    }

    @Test
    void testToString() {
        Employee e= new Employee(12, "Samuel","García", 3455);
        assertEquals("Employee[id=12,name=Samuel García,salary=3455]",e.toString(),"El mensaje debería ser:Employee[id=12,name=Samuel García,salary=3455]");
    }
}
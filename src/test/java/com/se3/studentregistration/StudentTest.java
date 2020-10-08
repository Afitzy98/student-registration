/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.se3.studentregistration;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Aaron
 */
public class StudentTest {

    private final String name = "Test";
    private final int age = 22;
    private final String dob = "23/09/1998";
    private final int id = 1;
    private final String email = "test@test.com";
    private final String address = "address";
    private final String phoneNo = "+353861221122";

    @Test
    public void createsStudent() {
        Student s = new Student(name, age, dob, id, email, address, phoneNo);

        assertEquals(name, s.name);
        assertEquals(age, s.age);
        assertEquals(dob, s.dob);
        assertEquals(id, s.id);
        assertEquals(email, s.email);
        assertEquals(address, s.address);
        assertEquals(phoneNo, s.phoneNo);

    }

    @Test
    public void usesGetters() {
        Student s = new Student(name, age, dob, id, email, address, phoneNo);

        assertEquals(name, s.getName());
        assertEquals(age, s.getAge());
        assertEquals(dob, s.getDob());
        assertEquals(id, s.getId());
        assertEquals(email, s.getEmail());
        assertEquals(address, s.getAddress());
        assertEquals(phoneNo, s.getPhoneNo());
    }

    @Test
    public void usesSetters() {
        Student s = new Student();

        s.setName(name);
        s.setAge(age);
        s.setDob(dob);
        s.setId(id);
        s.setEmail(email);
        s.setAddress(address);
        s.setPhone(phoneNo);

        assertEquals(name, s.name);
        assertEquals(age, s.age);
        assertEquals(dob, s.dob);
        assertEquals(id, s.id);
        assertEquals(email, s.email);
        assertEquals(address, s.address);
        assertEquals(phoneNo, s.phoneNo);
    }

    @Test
    public void usesArrayLists() {
        Student s = new Student();
        Module m = new Module();
        Course c = new Course();

        s.addModule(m);
        s.addCourse(c);

        ArrayList<Module> mods = s.getModules();
        ArrayList<Course> courses = s.getCourses();

        assertEquals(1, mods.size());
        assertEquals(1, courses.size());

        s.removeModule(m);
        s.removeCourse(c);

        mods = s.getModules();
        courses = s.getCourses();

        assertEquals(0, mods.size());
        assertEquals(0, courses.size());
    }

    @Test
    public void getsUsername() {
        Student s = new Student();

        s.setName(name);
        s.setAge(age);

        String username = s.getUsername();

        assertEquals("Test22", username);
    }

    @Test
    public void testsToString() {
        Student s = new Student(name, age, dob, id, email, address, phoneNo);

        String ts = s.toString();

        assertEquals("Name: " + name + ", Username: " + s.getUsername(), ts);
    }
}

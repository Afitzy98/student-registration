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
public class ModuleTest {

    private final String name = "Test";
    private final int id = 1;
    private final String description = "Test Description";
    private final String lecturer = "Dr. T Test";

    @Test
    public void createsModule() {
        Module m = new Module(name, id, description, lecturer);

        assertEquals(name, m.name);
        assertEquals(id, m.id);
        assertEquals(description, m.description);
        assertEquals(lecturer, m.lecturer);
    }

    @Test
    public void usesGetters() {
        Module m = new Module(name, id, description, lecturer);

        assertEquals(name, m.getName());
        assertEquals(id, m.getId());
        assertEquals(description, m.getDescription());
        assertEquals(lecturer, m.getLecturer());

    }

    @Test
    public void usesSetters() {
        Module m = new Module();

        m.setName(name);
        m.setId(id);
        m.setDescription(description);
        m.setLecturer(lecturer);

        assertEquals(name, m.name);
        assertEquals(id, m.id);
        assertEquals(description, m.description);
        assertEquals(lecturer, m.lecturer);
    }

    @Test
    public void usesArrayLists() {
        Student s = new Student();
        Module m = new Module();
        Course c = new Course();

        m.addStudent(s);
        m.addCourse(c);

        ArrayList<Student> stdnts = m.getStudents();
        ArrayList<Course> courses = m.getCourses();

        assertEquals(1, stdnts.size());
        assertEquals(1, courses.size());

        m.removeStudent(s);
        m.removeCourse(c);

        stdnts = m.getStudents();
        courses = m.getCourses();

        assertEquals(0, stdnts.size());
        assertEquals(0, courses.size());
    }

    @Test
    public void testsToString() {
        Module m = new Module(name, id, description, lecturer);

        String s = m.toString();

        assertEquals(id + " " + name, s);
    }
}

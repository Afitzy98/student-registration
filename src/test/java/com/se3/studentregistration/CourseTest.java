/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.se3.studentregistration;

import java.util.ArrayList;
import org.joda.time.LocalDate;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Aaron
 */
public class CourseTest {

    private final String name = "Test";
    private final LocalDate startDate = new LocalDate(2020, 9, 28);
    private final LocalDate endDate = new LocalDate(2021, 5, 28);

    @Test
    public void createsCourse() {
        Course c = new Course(name, startDate, endDate);

        assertEquals(name, c.name);
        assertEquals(startDate, c.startDate);
        assertEquals(endDate, c.endDate);
    }

    @Test
    public void usesGetters() {
        Course c = new Course(name, startDate, endDate);

        assertEquals(name, c.getName());
        assertEquals(startDate, c.getStartDate());
        assertEquals(endDate, c.getEndDate());

    }

    @Test
    public void usesSetters() {
        Course c = new Course();

        c.setName(name);
        c.setStartDate(startDate);
        c.setEndDate(endDate);

        assertEquals(name, c.name);
        assertEquals(startDate, c.startDate);
        assertEquals(endDate, c.endDate);
    }

    @Test
    public void usesArrayLists() {
        Student s = new Student();
        Module m = new Module();
        Course c = new Course();

        c.addStudent(s);
        c.addModule(m);

        ArrayList<Student> stdnts = c.getStudents();
        ArrayList<Module> mods = c.getModules();

        assertEquals(1, stdnts.size());
        assertEquals(1, mods.size());

        c.removeStudent(s);
        c.removeModule(m);

        stdnts = c.getStudents();
        mods = c.getModules();

        assertEquals(0, stdnts.size());
        assertEquals(0, mods.size());
    }
    
    @Test
    public void testsToString() {
        Course c = new Course(name, startDate, endDate);

        String s = c.toString();

        assertEquals(name, s);
    }
}

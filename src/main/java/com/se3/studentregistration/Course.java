/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.se3.studentregistration;

import org.joda.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class Course {

    protected String name;
    protected LocalDate startDate;
    protected LocalDate endDate;
    protected ArrayList<Student> students;
    protected ArrayList<Module> modules;

    public Course() {
        this.students = new ArrayList<>();
        this.modules = new ArrayList<>();
    }

    public Course(String name, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.students = new ArrayList<>();
        this.modules = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addModule(Module m) {
        ArrayList<Module> newModules = modules;
        newModules.add(m);
        setModules(newModules);
    }

    public void removeModule(Module m) {
        ArrayList<Module> newModules = modules;
        newModules.remove(m);
        setModules(newModules);
    }

    public void addStudent(Student s) {
        ArrayList<Student> newStudents = students;
        newStudents.add(s);
        setStudents(newStudents);
    }

    public void removeStudent(Student s) {
        ArrayList<Student> newStudents = students;
        newStudents.remove(s);
        setStudents(newStudents);
    }
}

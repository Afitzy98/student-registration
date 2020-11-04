/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.se3.studentregistration;

import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class Module {

    protected String name;
    protected int id;
    protected String description;
    protected String lecturer;
    protected ArrayList<Student> students;
    protected ArrayList<Course> courses;

    public Module() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public Module(String name, int id, String description, String lecturer) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.lecturer = lecturer;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getLecturer() {
        return lecturer;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
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

    public void addCourse(Course c) {
        ArrayList<Course> newCourses = courses;
        newCourses.add(c);
        setCourses(newCourses);
    }

    public void removeCourse(Course c) {
        ArrayList<Course> newCourses = courses;
        newCourses.remove(c);
        setCourses(newCourses);
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

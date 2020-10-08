package com.se3.studentregistration;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aaron
 */
public class Student {

    protected String name;
    protected int age;
    protected String dob;
    protected int id;
    protected String username;
    protected String email;
    protected String address;
    protected String phoneNo;
    protected ArrayList<Module> modules;
    protected ArrayList<Course> courses;

    public Student() {
        this.modules = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public Student(String name, int age, String dob, int id, String email, String address, String phoneNo) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = name + age;
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
        this.modules = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    protected String getUsername() {
        return name + age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
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
        return "Name: " + name + ", Username: " + username;
    }
}

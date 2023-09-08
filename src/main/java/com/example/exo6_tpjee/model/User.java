package com.example.exo6_tpjee.model;

import com.sun.source.tree.UsesTree;

import java.sql.Array;
import java.util.ArrayList;

public class User {

    private static int count = 0;
    private final int id;
    private String firstname;

    private String lastname;

    private String email;

    private String password;

    private ArrayList<Car> cars = new ArrayList<>();

    public User() {
        this.id = ++count;
    }

    public User(String firstname, String lastname, String email, String password) {
        this.id = ++count;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", cars=" + cars +
                '}';
    }
}

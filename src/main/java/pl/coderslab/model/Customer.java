package pl.coderslab.model;

import java.util.Date;

public class Customer {
    private String name;
    private String surename;
    private Date birthday;
    private int id;

    public Customer() {
    }

    public Customer(String name, String surename, Date birthday) {
        this.name = name;
        this.surename = surename;
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

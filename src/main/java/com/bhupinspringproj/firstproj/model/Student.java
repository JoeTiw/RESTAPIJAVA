package com.bhupinspringproj.firstproj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id                                                     //ID annotation and Primary Key (Auto Generates ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //make the Id auto increment


    private int id;
    private String name;
    private String address;

    public int Student() {
        return id;
    }

    public int getId() {                                        //Constructor
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

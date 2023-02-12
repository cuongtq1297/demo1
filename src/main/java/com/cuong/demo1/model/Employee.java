package com.cuong.demo1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id tu tang
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

    public Employee(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

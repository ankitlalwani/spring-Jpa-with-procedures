package com.example.springJpaSP.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String make;
    private String model;
    private Integer year;

    public Car() {
    }

    public Car(long id, String make, String model, Integer year) {
        Id = id;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}

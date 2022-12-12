package com.example.nestdigitalapplication_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leavecounts")

public class Leavecount {
    @Id
    @GeneratedValue

    private int id;
    private int empid;
    private String year;
    private int casual=20;
    private int sick=7;
    private int special=3;

    public Leavecount() {
    }

    public Leavecount(int id, int empid, String year, int casual, int sick, int special) {
        this.id = id;
        this.empid = empid;
        this.year = year;
        this.casual = casual;
        this.sick = sick;
        this.special = special;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getCasual() {
        return casual;
    }

    public void setCasual(int casual) {
        this.casual = casual;
    }

    public int getSick() {
        return sick;
    }

    public void setSick(int sick) {
        this.sick = sick;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }
}


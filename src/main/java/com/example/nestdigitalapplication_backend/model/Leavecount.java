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
    private String sickleave;
    private String casualleave;
    private String otherleave;

    public Leavecount() {
    }


    public Leavecount(int id, int empid, String year, String sickleave, String casualleave, String otherleave) {
        this.id = id;
        this.empid = empid;
        this.year = year;
        this.sickleave = sickleave;
        this.casualleave = casualleave;
        this.otherleave = otherleave;
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

    public String getSickleave() {
        return sickleave;
    }

    public void setSickleave(String sickleave) {
        this.sickleave = sickleave;
    }

    public String getCasualleave() {
        return casualleave;
    }

    public void setCasualleave(String casualleave) {
        this.casualleave = casualleave;
    }

    public String getOtherleave() {
        return otherleave;
    }

    public void setOtherleave(String otherleave) {
        this.otherleave = otherleave;
    }
}

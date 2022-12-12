package com.example.nestdigitalapplication_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeelog")

public class Employeelog {

    @Id
    @GeneratedValue
    private int id;
    private int empid;
    private String date;
    private String entrydatetime;
    private String exitdatetime;

    public Employeelog() {
    }

    public Employeelog(int id, int empid, String date, String entrydatetime, String exitdatetime) {
        this.id = id;
        this.empid = empid;
        this.date = date;
        this.entrydatetime = entrydatetime;
        this.exitdatetime = exitdatetime;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEntrydatetime() {
        return entrydatetime;
    }

    public void setEntrydatetime(String entrydatetime) {
        this.entrydatetime = entrydatetime;
    }

    public String getExitdatetime() {
        return exitdatetime;
    }

    public void setExitdatetime(String exitdatetime) {
        this.exitdatetime = exitdatetime;
    }
}

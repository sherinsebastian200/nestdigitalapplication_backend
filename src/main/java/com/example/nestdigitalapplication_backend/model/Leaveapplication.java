package com.example.nestdigitalapplication_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "leaveapplicaitons")
public class Leaveapplication {

    private int id;
    private int empid;
    private String leavetype;
    private String remarks;
    private int fromdate;
    private int todate;
    private int leaveapplydate;
    private int status;


    public Leaveapplication() {
    }

    public Leaveapplication(int id, int empid, String leavetype, String remarks, int fromdate, int todate, int leaveapplydate, int status) {
        this.id = id;
        this.empid = empid;
        this.leavetype = leavetype;
        this.remarks = remarks;
        this.fromdate = fromdate;
        this.todate = todate;
        this.leaveapplydate = leaveapplydate;
        this.status = status;
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

    public String getLeavetype() {
        return leavetype;
    }

    public void setLeavetype(String leavetype) {
        this.leavetype = leavetype;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getFromdate() {
        return fromdate;
    }

    public void setFromdate(int fromdate) {
        this.fromdate = fromdate;
    }

    public int getTodate() {
        return todate;
    }

    public void setTodate(int todate) {
        this.todate = todate;
    }

    public int getLeaveapplydate() {
        return leaveapplydate;
    }

    public void setLeaveapplydate(int leaveapplydate) {
        this.leaveapplydate = leaveapplydate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

package com.example.nestdigitalapplication_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "leaveapplicaitonnew")
public class Leaveapplication {

    @Id
    @GeneratedValue

    private int id;
    private int empid;
    private String leavetype;
    private String remarks;
    private String fromdate;
    private String todate;
    private String  leaveapplydate;
    private String status;


    public Leaveapplication() {
    }

    public Leaveapplication(int id, int empid, String leavetype, String remarks, String fromdate, String todate, String leaveapplydate, String status) {
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

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public String getTodate() {
        return todate;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }

    public String getLeaveapplydate() {
        return leaveapplydate;
    }

    public void setLeaveapplydate(String leaveapplydate) {
        this.leaveapplydate = leaveapplydate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

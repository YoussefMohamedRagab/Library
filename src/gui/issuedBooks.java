/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author asala
 */
public class issuedBooks {
    private int id;
    private String callno;
    private int studentid;
    private String studentname;
    private String studentcontact;
    private String date ;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    private Date date1 = new Date();


    public issuedBooks(int id, String callno, int studentid, String studentname, String studentcontact) {
        this.id = id;
        this.callno = callno;
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentcontact = studentcontact;
        this.date = formatter.format(date1);
    }
    public issuedBooks(int id, String callno, int studentid, String studentname, String studentcontact,String date) {
        this.id = id;
        this.callno = callno;
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentcontact = studentcontact;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCallno() {
        return callno;
    }

    public void setCallno(String callno) {
        this.callno = callno;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentcontact() {
        return studentcontact;
    }

    public void setStudentcontact(String studentcontact) {
        this.studentcontact = studentcontact;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public SimpleDateFormat getFormatter() {
        return formatter;
    }

    public void setFormatter(SimpleDateFormat formatter) {
        this.formatter = formatter;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }
}

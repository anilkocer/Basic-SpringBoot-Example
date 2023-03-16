package com.project.scriptlang;

public class kullanici {
    private String fname;
    private String lname;
    private String pass ;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "kullanici{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}

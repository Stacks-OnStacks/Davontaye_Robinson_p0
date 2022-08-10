package com.Revature.IBank.models;

public class BankMember {
    private String email;
    private String password;

    public BankMember() {
        super();
    }

    public BankMember(String email) {
        this.email = email;
    }

    public BankMember(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public BankMember(String email, String firstname, String lastname, String password) {

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getemail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String writetofile() {
        return email + "," + password + "\n";
    }

}



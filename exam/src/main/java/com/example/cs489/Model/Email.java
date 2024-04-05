package com.example.cs489.Model;

public class Email {

    private String label;
    private String emailAddress;

    public Email(String emailAddress, String label) {
        this.emailAddress = emailAddress;
        this.label = label;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{" + "emailAddress:" + emailAddress + ", label:" + label + "}";
    }

    public String getLabel() {
        return label;
    }

    public void updateLabel(String label) {
        this.label = label;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void updateEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
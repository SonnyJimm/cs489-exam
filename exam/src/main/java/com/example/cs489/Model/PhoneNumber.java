package com.example.cs489.Model;

/**
 * PhoneNumber
 */
public class PhoneNumber {

    private String phoneNumber;
    private String label;

    public PhoneNumber(String phoneNumber, String label) {
        this.phoneNumber = phoneNumber;
        this.label = label;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "{" + "phoneNumber:" + phoneNumber + ", label:" + label + "}";
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
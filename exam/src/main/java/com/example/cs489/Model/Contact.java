package com.example.cs489.Model;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<Email> emails;

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        phoneNumbers = new ArrayList<>();
        emails = new ArrayList<>();
    }

    public Contact(String firstName, String lastName, String company, String jobTitle, List<PhoneNumber> phoneNumbers,
            List<Email> emails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = phoneNumbers;
        this.emails = emails;
    }

    @Override
    public String toString() {

        return "{" + "\n" +
                "   firstname:" + firstName + ",\n" +
                "   lastName:" + lastName + ",\n" +
                "   company:" + company + ",\n" +
                "   jobTitle:" + jobTitle + ",\n" +
                "   phoneNumbers:" + (phoneNumbers == null ? "null"
                :   phoneNumbers) +   ",\n" +
                "   emails:" + (emails == null ? "null"
                :   emails  )+ ",\n" +
                                                "},\n";
    }

    public void addPhoneNumber(PhoneNumber p) {
        phoneNumbers.add(p);
    }

    public void addEmail(Email e) {
        emails.add(e);
    }

    // maybe we should return readonly but we need a way to update it
    public List<Email> getEmails() {
        return emails;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
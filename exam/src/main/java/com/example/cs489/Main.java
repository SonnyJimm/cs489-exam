package com.example.cs489;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.example.cs489.Model.Contact;
import com.example.cs489.Model.Email;
import com.example.cs489.Model.PhoneNumber;

public class Main {

    public static class ContactManager {
        List<Contact> contacts;

        public ContactManager() {
            contacts = new ArrayList<>();
        }

        public void addContact(Contact c) {
            contacts.add(c);
        }

        public void print() {
            System.out.println("[ \n");
            contacts.stream().sorted(Comparator.comparing(Contact::getLastName)).forEach(System.out::println);
            System.out.println("] \n");
        }
    }

    public static void main(String[] args) {
        var contactManager = new ContactManager();
        initContactManager(contactManager);
        contactManager.print();
    }

    public static void initContactManager(ContactManager contactManager) {
        var david = new Contact("David", "Sanger", "Argos LLC", "Sales Manager");
        // adding david
        david.addPhoneNumber(new PhoneNumber("240-133-0011", "Home"));
        david.addPhoneNumber(new PhoneNumber("240-112-0123", "Mobile"));
        david.addEmail(new Email("dave.sang@gmail.com", "Home"));
        david.addEmail(new Email("dsanger@argos.com", "Work"));

        contactManager.addContact(david);

        var carlos = new Contact("Carlos", "Jimenez", "Zappos", "Director");
        contactManager.addContact(carlos);

        var ali = new Contact("Ali", "Gafar", "BMI Services", "HR Manager");
        ali.addPhoneNumber(new PhoneNumber("412-116-9988", "Work"));
        ali.addEmail(new Email("ali@bmi.com", "Work"));
        contactManager.addContact(ali);
    }
}
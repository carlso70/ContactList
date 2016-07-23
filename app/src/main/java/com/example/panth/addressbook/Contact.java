package com.example.panth.addressbook;

import android.content.Context;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by panth on 7/21/2016.
 */
public class Contact implements Serializable {

    private String firstName;
    private String lastName;
    private String address;
    private String dateOfBirth;


    /*
    * @param firstName contact's first name
    * @param lastName contact's last name
    * @param address contact's address
    * @param dateOfBirth of the contact
    */
    public Contact(String firstName, String lastName, String address, String dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public Contact() {
        this.firstName = "";
        this.lastName = "";
        this.dateOfBirth = "";
        this.address = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static Comparator<Contact> COMPARE_BY_FIRST = new Comparator<Contact>() {
        @Override
        public int compare(Contact contact, Contact contact2) {
            return contact.getFirstName().compareTo(contact2.getFirstName());
        }
    };

    public static Comparator<Contact> COMPARE_BY_LAST = new Comparator<Contact>() {
        @Override
        public int compare(Contact contact, Contact contact2) {
            return contact.getLastName().compareTo(contact2.getLastName());
        }
    };
}

package com.example.panth.addressbook;

import android.content.Context;

import java.io.Serializable;

/**
 * Created by panth on 7/21/2016.
 */
public class Contact {

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
}

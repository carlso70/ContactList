package com.example.panth.addressbook;

import android.media.audiofx.BassBoost;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by panth on 7/21/2016.
 */
public class AddressBook implements Serializable {

   public static enum SortSettings {
        ALPHABETICAL_FIRST_NAME, REVERSE_ALPHABETICAL_FIRST_NAME , ALPHABETICAL_LAST_NAME, REVERSE_ALPHABETICAL_LAST_NAME;
    }

    private ArrayList<Contact> addressBook;
    private SortSettings settings;

    public AddressBook() {
        settings = SortSettings.ALPHABETICAL_LAST_NAME;
        addressBook = new ArrayList<Contact>();
    }

    public void add(Contact person) {
        addressBook.add(person);
    }

    public void setSortSetting(SortSettings settings) {
        this.settings = settings;
    }

    public void sortAddressBook() {
        switch (settings) {
            case ALPHABETICAL_FIRST_NAME:
                Collections.sort(addressBook, Contact.COMPARE_BY_FIRST);
                break;
            case ALPHABETICAL_LAST_NAME:
                Collections.sort(addressBook, Contact.COMPARE_BY_LAST);
                break;
            case REVERSE_ALPHABETICAL_FIRST_NAME:
                Collections.sort(addressBook, Contact.COMPARE_BY_FIRST);
                Collections.reverse(addressBook);
                break;
            case REVERSE_ALPHABETICAL_LAST_NAME:
                Collections.sort(addressBook, Contact.COMPARE_BY_LAST);
                Collections.reverse(addressBook);
                break;
            default:
                break;
        }
    }

    public ArrayList<Contact> getAddressBook() {
        return addressBook;
    }

}

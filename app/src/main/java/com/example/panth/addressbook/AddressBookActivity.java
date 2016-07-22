package com.example.panth.addressbook;

import android.location.Address;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.widget.Button;
import android.widget.ListView;

public class AddressBookActivity extends AppCompatActivity {

    private ListView lvContacts;
    private Button bAddContact;
    private Button bRemoveContact;
    private AddressBook addressBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_book);

        lvContacts = (ListView) findViewById(R.id.Contacts);
        bAddContact = (Button) findViewById(R.id.addContactButton);
        bRemoveContact = (Button) findViewById(R.id.removeContactButton);

        // TODO implement saving the address book
        addressBook = new AddressBook();

    }

    private void createContact() {

    }
}

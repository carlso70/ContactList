package com.example.panth.addressbook;

import android.content.Intent;
import android.location.Address;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class AddressBookActivity extends AppCompatActivity {

    private ListView lvContacts;
    private Button bAddContact;
    private Button bRemoveContact;
    private AddressBook addressBook;
    public static final String ADDRESSBOOK_KEY = "addressBook";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_book);

        // TODO implement saving the address book
        addressBook = new AddressBook();

        lvContacts = (ListView) findViewById(R.id.Contacts);
        bAddContact = (Button) findViewById(R.id.addContactButton);
        bRemoveContact = (Button) findViewById(R.id.removeContactButton);

        // Create contact button
        bAddContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createContact();
            }
        });
    }

    private void createContact() {
        Intent intent = new Intent(AddressBookActivity.this, AddContactActivity.class);
        intent.putExtra(ADDRESSBOOK_KEY, addressBook);
        startActivity(intent);
    }
}

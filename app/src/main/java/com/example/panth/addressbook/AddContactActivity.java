package com.example.panth.addressbook;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddContactActivity extends AppCompatActivity {

    static String NULL_TEXT_FIELDS_ERROR = "Please enter in all the fields";

    private Button addContactButton;
    private EditText firstNameText;
    private EditText lastNameText;
    private EditText addressText;
    private EditText dateOfBirthText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        firstNameText = (EditText) findViewById(R.id.firstNameText);
        lastNameText = (EditText) findViewById(R.id.lastNameText);
        dateOfBirthText = (EditText) findViewById(R.id.dateOfBirthText);
        addressText = (EditText) findViewById(R.id.addressText);

        addContactButton = (Button) findViewById(R.id.createContactButton);
        addContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createContact();
            }
        });
    }

    private void createContact() {
        // Check if text fields are empty
        if (firstNameText.getText().toString() == "" || lastNameText.getText().toString() == ""
                || dateOfBirthText.getText().toString() == "" || addressText.getText().toString() == "") {
            Toast.makeText(getApplicationContext(), NULL_TEXT_FIELDS_ERROR, Toast.LENGTH_SHORT);
            return;
        }


        // Create the new contact
        Contact contact = new Contact();
        contact.setFirstName(firstNameText.getText().toString());
        contact.setLastName(lastNameText.getText().toString());
        contact.setAddress(addressText.getText().toString());
        contact.setDateOfBirth(dateOfBirthText.getText().toString());

        // Exit out of the activity
        Intent intent = new Intent();
        intent.putExtra(AddressBookActivity.ADDRESS_BOOK_KEY, contact);
        setResult(RESULT_OK, intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        setResult(RESULT_CANCELED);
    }
}

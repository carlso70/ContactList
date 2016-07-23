package com.example.panth.addressbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by panth on 7/23/2016.
 */
public class AddressBookContactAdapter extends ArrayAdapter<Contact> {
    public AddressBookContactAdapter(Context context, ArrayList<Contact> contacts) {
        super(context, 0, contacts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Contact contact = getItem(position);

        // Check if existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_contact_address_book, parent, false);
        }

        // Lookup views within item's layout
        TextView firstNameText = (TextView) convertView.findViewById(R.id.contactFirstName);
        TextView lastNameText = (TextView) convertView.findViewById(R.id.contactLastName);
        TextView dateOfBirthText = (TextView) convertView.findViewById(R.id.contactDateOfBirth);
        TextView addressText = (TextView) convertView.findViewById(R.id.contactAddress);

        // Set the data within the movie item view
        firstNameText.setText(contact.getFirstName());
        lastNameText.setText(contact.getLastName());
        dateOfBirthText.setText(contact.getDateOfBirth());
        addressText.setText(contact.getAddress());

        return convertView;
    }
}

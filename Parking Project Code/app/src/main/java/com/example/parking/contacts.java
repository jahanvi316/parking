package com.example.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class contacts extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        FloatingActionButton addButton = findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                LinearLayout addContact = findViewById(R.id.addContactView);
                if (addContact.getVisibility() == View.VISIBLE) {
                    addContact.setVisibility(View.INVISIBLE);
                }
                else {
                    addContact.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    public void addContact(){
        DatabaseReference contacts = database.getReference("Contacts");
        String contactName = findViewById(R.id.nameEdit).toString();
        //contacts.addChildEventListener()
    }


}
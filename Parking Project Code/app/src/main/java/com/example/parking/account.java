package com.example.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class account extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }

    @Override
    protected void onStart() {
        super.onStart();
       setContentView(R.layout.activity_account);



        Button updateButton = findViewById(R.id.update);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference carMake = database.getReference("carMake");
                String newCarMake = findViewById(R.id.carMakeEdit).toString();
                carMake.setValue(newCarMake);

//                DatabaseReference carModel = database.getReference("carModel");
//                String newCarModel = findViewById(R.id.carModelEdit).toString();
//                carModel.setValue(newCarModel);
//
//                DatabaseReference carYear = database.getReference("carYear");
//                String newCarYear = findViewById(R.id.carYearEdit).toString();
//                carYear.setValue(newCarYear);
//
//                DatabaseReference presetMessage = database.getReference("presetMessage");
//                String newPresetMessage = findViewById(R.id.presetMessageEdit).toString();
//                presetMessage.setValue(newPresetMessage);


                TextView updateMessageInfo = (TextView) findViewById(R.id.updatedInfoMessage);
                updateMessageInfo.setVisibility(View.VISIBLE);

            }
        });

    }


}
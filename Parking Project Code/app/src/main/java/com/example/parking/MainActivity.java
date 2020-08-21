package com.example.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//            Button parkMyCar = (Button) findViewById(R.id.parkMyCar);
//            parkMyCar.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View v) {
//                    startActivity(new Intent(getApplicationContext(), parkMyCar.class));
//                }
//            });

        ImageView settings = (ImageView) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Settings.class));
            }
        });

        Button whereDidIPark = (Button) findViewById(R.id.whereDidIPark);
        whereDidIPark.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), whereDidIPark.class));
            }
        });

        Button emergency = (Button) findViewById(R.id.emergency);
        emergency.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), emergency.class));
            }
        });

        Button park = (Button) findViewById(R.id.parkMyCar);
        park.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), park.class));
            }
        });



    }


}
package com.example.intentandbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clc;
        clc=findViewById(R.id.clc);


        clc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shift;
                shift = new Intent(MainActivity.this,SecondActivity.class);
                shift.putExtra("title","Home");
                shift.putExtra("name","sunny");
                shift.putExtra("Roll No","9");

                startActivity(shift);
            }
        });
    }
}
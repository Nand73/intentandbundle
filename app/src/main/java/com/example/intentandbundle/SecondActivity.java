package com.example.intentandbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent fromAct = getIntent();
        String title = fromAct.getStringExtra("title");
        String name = fromAct.getStringExtra("name");
        int roll =fromAct.getIntExtra("Roll No",0);

        TextView studentInfo;
        studentInfo=findViewById(R.id.studentInfo);

        studentInfo.setText("RollNo: "+roll+",StudentName: "+name);
        getSupportActionBar().setTitle(title);
    }
}
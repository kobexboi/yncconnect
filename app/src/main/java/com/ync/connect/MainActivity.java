package com.ync.connect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.ync.connect.model.YNCStudent;

public class MainActivity extends AppCompatActivity {


    //private Button launchProfileButton;

    private TextView firstnametextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnametextview = findViewById(R.id.firstname);


        YNCStudent firstStudent = new YNCStudent();
        firstStudent.setFirstName("Lauren");
        firstStudent.setLastName("Kim");
        firstStudent.setEmail("laurenkim@gmail.com");
        firstStudent.setPhoneNumber("828-383-8383");

        firstnametextview.setText(firstStudent.getFirstName());



    }
}
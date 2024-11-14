package com.example.projectpetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PageWelcome extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Start (View v){
        Intent Switch = new Intent (this, PageChoice.class);
        startActivity(Switch);
    }

    public void See (View v){
        Intent Switch = new Intent (this, PageExisting.class);
        startActivity(Switch);
    }

}
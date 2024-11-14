package com.example.projectpetapp;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class PageChoice extends AppCompatActivity {
    private EditText AnimalName, AnimalRace, AnimalAge;
    private ArrayList<String> AnimalList;
    int Frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagechoice);

        AnimalName = findViewById(R.id.editAnName);
        AnimalRace = findViewById(R.id.editAnRace);
        AnimalAge = findViewById(R.id.editAnAge);
    }


    public void ClickedD(View v) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true)
                .replace(R.id.fragmentContainerView, ChoiceDog.class, null).commit();
        Frag = 1;
    }

    public void ClickedC(View v) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true)
                .replace(R.id.fragmentContainerView, ChoiceCat.class, null).commit();
        Frag = 2;
    }

    public void ClickedR(View v) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true)
                .replace(R.id.fragmentContainerView, ChoiceRabbit.class, null).commit();
        Frag = 3;
    }

    public void Go (View v){
        String AnimalNam = AnimalName.getText().toString().trim();
        String AnimalRac = AnimalRace.getText().toString().trim();
        String AnimalAg = AnimalAge.getText().toString().trim();

        AnimalName = (EditText) findViewById(R.id.editAnName);
        AnimalRace = (EditText) findViewById(R.id.editAnRace);
        AnimalAge = (EditText) findViewById(R.id.editAnAge);
        String VaName = AnimalName.getText().toString();
        String VaRace = AnimalRace.getText().toString();
        String VaAge = AnimalAge.getText().toString();

        Intent Switch = new Intent (this, PageInfo.class);
        Bundle extra = new Bundle();
        extra.putString("EdName", VaName);
        extra.putString("EdRace", VaRace);
        extra.putString("EdAge", VaAge);

        Switch.putExtras(extra);

        Switch.putExtra("Frag", Frag);
        startActivity(Switch);

    }

}

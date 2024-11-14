package com.example.projectpetapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PageInfo extends AppCompatActivity {

    private EditText AnimalWeight, AnimalNextBath, AnimalPreviousBath,
            AnimalFavFood, AnimalNextVacc, AnimalPreviousVacc;
    int Frag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pageinfo);
    }

    public void Confirm(View v) {
        Intent Switch = getIntent();
        String VName = Switch.getExtras().getString("EdName");
        String VRace = Switch.getExtras().getString("EdRace");
        String VAge = Switch.getExtras().getString("EdAge");
        Frag = Switch.getIntExtra("Frag",0);

        AnimalWeight = (EditText) findViewById(R.id.editWeight);
        AnimalFavFood = (EditText) findViewById(R.id.editFood);
        AnimalNextBath = (EditText) findViewById(R.id.editNextBath);
        AnimalPreviousBath = (EditText) findViewById(R.id.editLastBath);
        AnimalNextVacc = (EditText) findViewById(R.id.editNextVacc);
        AnimalPreviousVacc = (EditText) findViewById(R.id.editLastVacc);

        String Weight = AnimalWeight.getText().toString().trim();
        String Fav = AnimalFavFood.getText().toString().trim();
        String NBath = AnimalNextBath.getText().toString().trim();
        String LBath = AnimalPreviousBath.getText().toString().trim();
        String NVacc = AnimalNextVacc.getText().toString().trim();
        String LVacc = AnimalPreviousVacc.getText().toString().trim();

        Intent SwitchInfo = new Intent(this, PagePrincipal.class);

        Bundle extra = new Bundle();
        extra.putString("Name", VName);
        extra.putString("Race", VRace);
        extra.putString("Age", VAge);
        extra.putString("AWeight", Weight);
        extra.putString("FavFood", Fav);
        extra.putString("NeBa", NBath);
        extra.putString("LaBa", LBath);
        extra.putString("NeVacc", NVacc);
        extra.putString("LaVacc", LVacc);

        SwitchInfo.putExtras(extra);
        SwitchInfo.putExtra("Frag", Frag);
        startActivity(SwitchInfo);

        }
    }

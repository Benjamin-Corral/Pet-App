package com.example.projectpetapp;



import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class PagePrincipal extends AppCompatActivity {

    private TextView Name, Race, Age, Weight;
    int Type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pageprincipal);
        Intent Switch = getIntent();
        Intent SwitchInfo = getIntent();

        String VName = SwitchInfo.getExtras().getString("Name");
        String VRace = SwitchInfo.getExtras().getString("Race");
        String VAge = SwitchInfo.getExtras().getString("Age");
        String VWeight = SwitchInfo.getExtras().getString("AWeight");
        String NextBath = SwitchInfo.getExtras().getString("NeBa");
        String LastBath = SwitchInfo.getExtras().getString("LaBa");
        String NextVacc = SwitchInfo.getExtras().getString("NeVacc");
        String LastVacc = SwitchInfo.getExtras().getString("LaVacc");

        Name = findViewById(R.id.txtN);
        Race = findViewById(R.id.txtR);
        Age = findViewById(R.id.txtA);
        Weight = findViewById(R.id.txtW);

        Name.setText(VName);
        Race.setText(VRace);
        Age.setText(VAge + " years old");
        Weight.setText(VWeight);

        Type = SwitchInfo.getIntExtra("Frag",0);
        if (Type == 1) {
            getSupportFragmentManager().beginTransaction().setReorderingAllowed(true)
                    .replace(R.id.fragmentContainerViewPet, ChoiceDog.class, null).commit();
        }
        if (Type == 2) {
            getSupportFragmentManager().beginTransaction().setReorderingAllowed(true)
                    .replace(R.id.fragmentContainerViewPet, ChoiceCat.class, null).commit();
        }
        if (Type == 3) {
            getSupportFragmentManager().beginTransaction().setReorderingAllowed(true)
                    .replace(R.id.fragmentContainerViewPet, ChoiceRabbit.class, null).commit();
        }
    }

    public void InfoF(View v) {
        Intent SwitchInfo = getIntent();
        String Favo = SwitchInfo.getExtras().getString("FavFood");
        FoodFrag FFrag = FoodFrag.newInstance(Favo);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerViewInfo, FFrag, null).commit();
    }

    public void InfoB(View v) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true)
                .replace(R.id.fragmentContainerViewInfo, BathFrag.class, null).commit();
    }
    public void InfoM(View v) {
        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true)
                .replace(R.id.fragmentContainerViewInfo, HealthFrag.class, null).commit();
    }

    public void Add(View v){
        Intent Switch = new Intent (this, PageInfo.class);
        startActivity(Switch);
    }

    public void Others(View v){
        Intent SwitchInfo = getIntent();
        String VName = SwitchInfo.getExtras().getString("Name");
        String VRace = SwitchInfo.getExtras().getString("Race");
        String VAge = SwitchInfo.getExtras().getString("Age");

        Intent Switch = new Intent (this, PageExisting.class);

        Switch.putExtra("Name", VName);
        Switch.putExtra("Race", VRace);
        Switch.putExtra("Age", VAge);

        startActivity(Switch);
    }

}






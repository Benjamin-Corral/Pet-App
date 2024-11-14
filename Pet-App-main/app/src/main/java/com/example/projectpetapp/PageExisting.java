package com.example.projectpetapp;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class PageExisting extends AppCompatActivity {

    private ArrayAdapter List;
    private ArrayList<String> AnimalList = new ArrayList<String>();
    private ListView AnimalListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pageexisting);

        if (getIntent() != null) {
            Intent Switch = getIntent();
            if(Switch.getExtras() != null) {
                List = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                        AnimalList);
                AnimalListView = (ListView) findViewById(R.id.ListAnimals);
                AnimalListView.setAdapter(List);

                String SP = Switch.getExtras().getString("Name") + " - " +
                        Switch.getExtras().getString("Race") +
                        " - " + Switch.getExtras().getString("Age") + " years old";
                Toast.makeText(this, SP, Toast.LENGTH_SHORT).show();
                AnimalList.add(SP);
            }}}
    public void Adding (View v){
        Intent Switch = new Intent(this, PageChoice.class);
        startActivity(Switch);
    }
    public void BackPage (View v){
        Intent Switch = new Intent(this, PagePrincipal.class);
        startActivity(Switch);
    }
}

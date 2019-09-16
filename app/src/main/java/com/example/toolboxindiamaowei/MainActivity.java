package com.example.toolboxindiamaowei;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
public int charmander = 0;
    public int squirtle = 0;
    public int bulbasuar = 0;
    public int charmeleon = 0;
    public int ivysaur = 0;
    public int warturtle = 0;
    public int venusaur = 0;
    public int blastois = 0;
    public int charzard = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.move_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }

    public void onClick(View v){
        RadioGroup rg = findViewById(R.id.radiogroup);
        int radioButton = rg.getCheckedRadioButtonId();
        RadioButton rb = rg.findViewById(radioButton);
        if(rb.getText().equals("cool")){

            squirtle++;
        }

    }




    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

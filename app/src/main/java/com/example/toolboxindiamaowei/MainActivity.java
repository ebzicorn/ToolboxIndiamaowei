package com.example.toolboxindiamaowei;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
public int charmander = 0;
    public int squrtile = 0;
    public int bulbasuar = 0;
    public int charmeleon = 0;
    public int ivysaur = 0;
    public int warturtle = 0;
    public int venusaur = 0;
    public int blastois = 0;
    public int charzard = 0;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.move_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemClickListener(this);


    }


    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }


    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

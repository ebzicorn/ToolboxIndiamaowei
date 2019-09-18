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
    public int k = 0;


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

    public void onRadioClick(View v){
        RadioGroup rg = findViewById(R.id.radiogroup);
        int radioButton = rg.getCheckedRadioButtonId();
        RadioButton rb = rg.findViewById(radioButton);
        if(rb.getText().equals("cool")){

            venusaur++;
            blastois++;
            charzard++;
        }
        if(rb.getText().equals("cute")){

            squirtle++;
            charmander++;
            bulbasuar++;
        }
        if(rb.getText().equals("normal")){

            charmeleon++;
            ivysaur++;
            warturtle++;
        }

    }

    public void spinnerAction(View v) {
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String text = spinner.getSelectedItem().toString();

        if (text.equals("Hyperbeam")) {
            charzard++;
            bulbasuar++;
            warturtle++;

        }
        if (text.equals("Protect")) {
            blastois++;
            charmander++;
            venusaur++;

        }
        if (text.equals("Sword Dance")) {
            ivysaur++;
            squirtle++;
            charmeleon++;

        }
    }

     public void onCheckedClick1(View v){
        k++;
        if(k == 1){
            charmander++;
            charmeleon++;
            charzard++;
        }
        else{
            charmander = charmander +2;
            charmeleon = charmeleon +2;
            charzard = charzard +2;
        }
        }
    public void onCheckedClick2(View v){
        k++;
        if(k == 1){
            squirtle++;
            warturtle++;
            blastois++;
        }
        else{
            squirtle = squirtle +2;
            warturtle = warturtle +2;
            blastois = blastois +2;
        }

    }
    public void onCheckedClick3(View v){
        k++;
        if(k == 1){
            bulbasuar++;
            venusaur++;
            ivysaur++;
        }
        else{
            bulbasuar = bulbasuar +2;
            venusaur = venusaur +2;
            ivysaur = ivysaur +2;
        }
      
    }






    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

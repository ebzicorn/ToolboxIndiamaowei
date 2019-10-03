package com.example.toolboxindiamaowei;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    int[] intArray = new int[]{ 0, 0, 0, 0, 0, 0, 0, 0, 0 };


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

            intArray[6]++;
            intArray[7]++;
            intArray[8]++;
        }
        if(rb.getText().equals("cute")){

            intArray[1]++;
            intArray[0]++;
            intArray[2]++;
        }
        if(rb.getText().equals("normal")){

            intArray[3]++;
            intArray[4]++;
            intArray[5]++;
        }

    }

    public void spinnerAction(View v) {
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String text = spinner.getSelectedItem().toString();

        if (text.equals("Hyperbeam")) {
            intArray[8]++;
            intArray[2]++;
            intArray[5]++;

        }
        if (text.equals("Protect")) {
            intArray[7]++;
            intArray[0]++;
            intArray[6]++;

        }
        if (text.equals("Sword Dance")) {
            intArray[4]++;
            intArray[1]++;
            intArray[3]++;

        }
    }

     public void onCheckedClick1(View v){
        k++;
        if(k == 1){
            intArray[0]++;
            intArray[3]++;
            intArray[8]++;
        }
        else{
            intArray[0] = intArray[0] +2;
            intArray[3] = intArray[3] +2;
            intArray[8] = intArray[8] +2;
        }
        }
    public void onCheckedClick2(View v){
        k++;
        if(k == 1){
            intArray[1]++;
            intArray[5]++;
            intArray[7]++;
        }
        else{
            intArray[1] =  intArray[1] +2;
            intArray[5] = intArray[5] +2;
            intArray[7] = intArray[7] +2;
        }

    }
    public void onCheckedClick3(View v){
        k++;
        if(k == 1){
            intArray[2]++;
            intArray[4]++;
            intArray[6]++;
        }
        else{
            intArray[2] = intArray[2] +2;
            intArray[4] = intArray[4] +2;
            intArray[6] = intArray[6] +2;
        }
      
    }

    public void finalClick(View v){
        spinnerAction(v);
        Switch mySwitch = findViewById(R.id.switch1);
        ImageView poke = findViewById(R.id.imageView);
        int r = 0;
        for(int j = 1; j< intArray.length; j++)
        {

            if(intArray[j] > r){
                r = j;
            }
            j++;
        }

        if(r == 0 && mySwitch.isChecked()){
            poke.setImageResource(R.drawable.charmander);
        }
        else if (r == 0 && !mySwitch.isChecked()){
            poke.setImageResource(R.drawable.torchic);
        }
        else if(r == 1 && mySwitch.isChecked()){
            poke.setImageResource(R.drawable.squirtle);
        }
        else if (r == 1 && !mySwitch.isChecked()){
            poke.setImageResource(R.drawable.mudkip);
        }
        else if(r == 2 && mySwitch.isChecked()){
            poke.setImageResource(R.drawable.bulbasaur);
        }
        else if (r == 2 && !mySwitch.isChecked()){
            poke.setImageResource(R.drawable.treecko);
        }
        else if(r == 3 && mySwitch.isChecked()){
            poke.setImageResource(R.drawable.charmeleon);
        }
        else if (r == 3 && !mySwitch.isChecked()){
            poke.setImageResource(R.drawable.combusken);
        }
        else if(r == 4 && mySwitch.isChecked()){
            poke.setImageResource(R.drawable.warturtle);
        }
        else if (r == 4 && !mySwitch.isChecked()){
            poke.setImageResource(R.drawable.marshtomp);
        }
        else if(r == 5 && mySwitch.isChecked()){
            poke.setImageResource(R.drawable.ivysaur);
        }
        else if (r == 5 && !mySwitch.isChecked()){
            poke.setImageResource(R.drawable.grovile);
        }
        else if(r == 6 && mySwitch.isChecked()){
            poke.setImageResource(R.drawable.charzard);
        }
        else if (r == 6 && !mySwitch.isChecked()){
            poke.setImageResource(R.drawable.blazakin);
        }
        else if(r == 7 && mySwitch.isChecked()){
            poke.setImageResource(R.drawable.blastoise);
        }
        else if (r == 7 && !mySwitch.isChecked()){
            poke.setImageResource(R.drawable.swampert);
        }
        else if(r == 8 && mySwitch.isChecked()){
            poke.setImageResource(R.drawable.venusaur);
        }
        else if (r == 8 && !mySwitch.isChecked()){
            poke.setImageResource(R.drawable.sceptile);
        }

    }




    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

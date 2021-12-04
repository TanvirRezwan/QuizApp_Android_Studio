package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup myRadioGroup;
    int marks;
    static final String extraData="From Activity One";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRadioGroup=findViewById(R.id.radiogroupId);
    }

    public void NextFunction(View view) {
        int selectedRadioBtnId=myRadioGroup.getCheckedRadioButtonId();
        if(selectedRadioBtnId==R.id.radioButton1||selectedRadioBtnId==R.id.radioButton2||selectedRadioBtnId==R.id.radioButton3||selectedRadioBtnId==R.id.radioButton4){
            if(selectedRadioBtnId==R.id.radioButton1){
                marks=5;
            }
            else{
                marks=0;
            }
            Intent myIntent=new Intent(this,SecondActivity2.class);
            myIntent.putExtra(extraData,marks);
            startActivity(myIntent);
        }
        else{
            Toast.makeText(this, "Please Select Any Option", Toast.LENGTH_SHORT).show();
        }

    }
}
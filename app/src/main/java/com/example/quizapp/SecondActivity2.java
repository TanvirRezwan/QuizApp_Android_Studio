package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SecondActivity2 extends AppCompatActivity {
    int totalMarks;
    static final String extra2Data="From Second Activity";
    RadioGroup myRadioGroup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        myRadioGroup2=findViewById(R.id.radiogroup2Id);
        Intent myIntent=getIntent();
        totalMarks=myIntent.getIntExtra(MainActivity.extraData,0);

    }

    public void SubmitFunction(View view) {
        int selectedRadioBtnId=myRadioGroup2.getCheckedRadioButtonId();
        if(selectedRadioBtnId==R.id.radioButton1q2||selectedRadioBtnId==R.id.radioButton2q2||selectedRadioBtnId==R.id.radioButton3q2||selectedRadioBtnId==R.id.radioButton4q2){
            if(selectedRadioBtnId==R.id.radioButton2q2){
                totalMarks=totalMarks+5;
            }
            else{
                totalMarks=totalMarks+0;
            }
            Intent myIntent=new Intent(this,ThirdActivity2.class);
            myIntent.putExtra(extra2Data,totalMarks);
            startActivity(myIntent);
        }
        else{
            Toast.makeText(this, "Please Select Any Option", Toast.LENGTH_SHORT).show();
        }
    }
}
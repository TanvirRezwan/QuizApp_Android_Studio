package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity2 extends AppCompatActivity {
    TextView myTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third2);
        myTextview=findViewById(R.id.ResulttextView);
        Intent myIntent=getIntent();
        int result=myIntent.getIntExtra(SecondActivity2.extra2Data,0);
        myTextview.setText("You Get "+result+" out of 10");

    }

    public void traAgainFunction(View view) {
        Intent myIntent=new Intent(this,MainActivity.class);
        startActivity(myIntent);
    }
}
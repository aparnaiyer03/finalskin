package com.example.mapsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Firstscreen extends AppCompatActivity {
    public static final String MSG = "com.example.mapsdemo.Firstscreen.MSG";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstscreen);
    }

    public void onClick(View view)
    {
        //we wiil hnandle the click on the button here
        //Build an intent to open another activity
        Intent intent = new Intent(this, MapsActivity.class);
        String message =" here it comes";
        intent.putExtra(MSG,message);
        startActivity(intent);




    }
    public void onClick2(View view)
    {
        //we wiil hnandle the click on the button here
        //Build an intent to open another activity
        Intent intent = new Intent(this, MapsActivity.class);
        String message =" dermatology";
        intent.putExtra(MSG,message);
        startActivity(intent);




    }
}

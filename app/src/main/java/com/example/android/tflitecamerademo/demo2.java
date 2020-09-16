package com.example.android.tflitecamerademo;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class demo2 extends Activity {
    TextView text1 = (TextView)findViewById(R.id.text1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        Bundle appleData = getIntent().getExtras();
        String applesmessage = appleData.getString("applesmessage");


        String str = applesmessage;
        String[] arr = str.split("\\s+");
        String m = arr[1];
        if(m.equals("rosacea:")){
            Intent i2 = new Intent(this,rosacea.class);
            startActivity(i2);
        }
        else if(m.equals("pigmentation:")){
            Intent i5= new Intent(this,pigmentation.class);
            startActivity(i5);
        }
        else if(m.equals("acne:")){
            Intent i3= new Intent(this,acne.class);
            startActivity(i3);
        }



    }


}

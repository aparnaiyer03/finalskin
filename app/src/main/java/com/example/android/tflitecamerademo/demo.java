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

import com.example.mapsdemo.Firstscreen;
import com.example.mapsdemo.MapsActivity;

import org.w3c.dom.Text;

public class demo extends Activity {
    private Button button;
    private Button button1;
    private Button button2;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_demo);
    button = (Button)findViewById(R.id.B1);
    button1= (Button)findViewById(R.id.B2);
    button2 = (Button)findViewById(R.id.B3);


    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent2);        }
    });
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent3 = new Intent(getApplicationContext(), MapsActivity.class);
            startActivity(intent3);        }
    });


    Bundle appleData = getIntent().getExtras();
    String applesmessage = appleData.getString("applesmessage");
    final TextView bacon = (TextView) findViewById(R.id.bacon);
    bacon.setText(applesmessage);
    final TextView product = (TextView) findViewById(R.id.product);


//    String s = "aparna: 0.9";
//    if(s.contains(":")){
//        s= s.substring(0, s.indexOf(":"));
//        product.setText(s);
//    }
//

//    String str = "29ms rosacea: 0.9";
//    String[] arr = str.split(" ");
//    product.setText(arr[1]);

    String str = applesmessage;
    String[] arr = str.split("\\s+");
    String m = arr[1];
    if(m.equals("rosacea:")){
        product.setText("Rosacea products listed. Please click on the shop button if you wish to buy any of them");
        Intent i2 = new Intent(this,rosacea.class);
        startActivity(i2);
    }
    else if(m.equals("pigmentation:")){
        product.setText("pigmentation products listed. Please click on the shop button if you wish to buy any of them");
        Intent i3 = new Intent(this,pigmentation.class);
        startActivity(i3);
    }
    else if(m.equals("acne:")){
        product.setText("acne products listed. Please click on the shop button if you wish to buy any of them");
        Intent i4 = new Intent(this,acne.class);
        startActivity(i4);
    }
    else if(m.equals("healthy:")){
        product.setText("To maintain healthy skin, product have been listed. Please click on the shop button if you wish to buy any of them");
        Intent i5 = new Intent(this,healthy.class);
        startActivity(i5);
    }
    else{product.setText("WRONG");}
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           Toast.makeText(getApplicationContext(),"hey there",Toast.LENGTH_LONG).show();
            if(m.equals("rosacea:")){
                product.setText("Rosacea products listed. Please click on the shop button if you wish to buy any of them");
                Intent i2 = new Intent(getApplicationContext(),rosacea.class);
                startActivity(i2);
            }
            else if(m.equals("pigmentation:")){
                product.setText("pigmentation products listed. Please click on the shop button if you wish to buy any of them");
                Intent i3 = new Intent(getApplicationContext(),pigmentation.class);
                startActivity(i3);
            }
            else if(m.equals("acne:")){
                product.setText("acne products listed. Please click on the shop button if you wish to buy any of them");
                Intent i4 = new Intent(getApplicationContext(),acne.class);
                startActivity(i4);
            }
            else if(m.equals("healthy:")){
                product.setText("To maintain healthy skin, product have been listed. Please click on the shop button if you wish to buy any of them");
                Intent i5 = new Intent(getApplicationContext(),healthy.class);
                startActivity(i5);
            }
            else{product.setText("WRONG");}
        }
    });




}


}

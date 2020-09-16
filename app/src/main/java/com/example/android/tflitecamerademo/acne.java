package com.example.android.tflitecamerademo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class acne extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acne);
        ListView list = (ListView)findViewById(R.id.listview);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("FOLLOWING PRODUCTS CAN BE USED TO CURE ROSACEA");
        arrayList.add(" ");
        arrayList.add("Facewash- Dermadew (two times a day)");
        arrayList.add("Moisturizer- Cetaphill (two times a day)");
        arrayList.add("Sunscreen-Suncros (30 mins prior going out in the sun");
        arrayList.add("Topical Ointment- Cindamycin Phosphate gel on affected area in the morning");
        arrayList.add("Topical Ointment- benzoyl peroxide gel on affected area at night");
        arrayList.add("Avoid oily, spicy food");
        arrayList.add("Drink 3 litres of water");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(arrayAdapter);

    }
}

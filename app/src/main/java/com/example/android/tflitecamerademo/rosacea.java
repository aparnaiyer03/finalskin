package com.example.android.tflitecamerademo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class rosacea extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rosacea);
        ListView list = (ListView)findViewById(R.id.listview);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("FOLLOWING PRODUCTS CAN BE USED TO CURE ROSACEA");
        arrayList.add(" ");
        arrayList.add("Facewash- Dermadew (two times a day)");
        arrayList.add("Moisturizer- Physiogel Calming lotion (two times a day)");
        arrayList.add("Sunscreen-Suncros (30 mins prior going out in the sun");
        arrayList.add("Topical Ointment- Metrodizanole gel on affected area in the morning");
        arrayList.add("Topical Ointment- Picon gel on affected area at night");
        arrayList.add("Topical Ointment-Use erythego gel for immediate relief");
        arrayList.add("Avoid oily, spicy food");
        arrayList.add("Avoid Alcohol");
        arrayList.add("Note down trigger food habits");
        arrayList.add("Drink 3 litres of water");
        arrayList.add("Cover your face when out in the sun");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(arrayAdapter);
    }
}

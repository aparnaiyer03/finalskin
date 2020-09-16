package com.example.android.tflitecamerademo;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import android.os.Bundle;

public class healthy extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy);
        ListView list = (ListView)findViewById(R.id.listview);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("FOLLOWING PRODUCTS CAN BE USED TO MAINTAIN HEALTHY SKIN");
        arrayList.add(" ");
        arrayList.add("Facewash- Cetaphil facewash(Two times a day)");
        arrayList.add("Moisturizer- Cetaphil (two times a day)");
        arrayList.add("Sunscreen-Suncros (30 mins prior going out in the sun");
        arrayList.add("Drink 3 litres of water");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(arrayAdapter);
    }
}

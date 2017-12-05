package com.example.sharna.birthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Main3Activity extends AppCompatActivity {

    ListView lv;
    String[] data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lv = (ListView) findViewById(R.id.myfriendbday);

        Data mf = new Data(getApplicationContext());

        String[] data = mf.my_data();

        lv.setAdapter(new ArrayAdapter(getApplicationContext(), R.layout.lvlayout, R.id.mytext, data));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), edit.class);
                i.putExtra("MyKEY", position);
                startActivity(i);
            }
        });




    }

}


package com.example.sharna.birthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText e1, e2;
    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        e1 = (EditText) findViewById(R.id.name);
        e2 = (EditText) findViewById(R.id.bday);

        b3 = (Button) findViewById(R.id.save);

        final Data mf = new Data(getApplicationContext());

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String _name = e1.getText().toString();
                String _bday = e2.getText().toString();

                Temp dt = new Temp(_name, _bday);

                mf.addingDataToTable(dt);

                Toast.makeText(getApplicationContext(), "Data added successfully!", Toast.LENGTH_LONG).show();


            }
        });
    }


}

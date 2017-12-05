package com.example.sharna.birthday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class edit extends AppCompatActivity {

    Button sb1,sb2,sb3;
   /* public int rec_pos = getIntent().getIntExtra("MyKEY", 999);

    public int get()
    {
        return rec_pos;
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);



        Button sb1 = (Button)findViewById(R.id.sb1);
        Button sb2 = (Button)findViewById(R.id.sb2);
        Button sb3 = (Button)findViewById(R.id.sb3);

        final int rec_pos = getIntent().getIntExtra("MyKEY", 999);



        sb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent si1 = new Intent(edit.this,single.class);
                si1.putExtra("MyKEY",rec_pos);
                startActivity(si1);
            }
        });

        sb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent si2 = new Intent(edit.this,sendsms.class);

                startActivity(si2);
            }
        });

        sb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent si3 = new Intent(edit.this,facebook.class);

                startActivity(si3);
            }
        });



    }



}

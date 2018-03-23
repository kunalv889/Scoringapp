package com.example.kunalverma.scoringapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Newmatch extends AppCompatActivity {

    Button b3,b2;
    EditText tournament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newmatch);
        b3=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button2);



        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.secondpage);
            }
        });
    }

    @Override
    public void onBackPressed() {
        setContentView(R.layout.activity_newmatch);
    }
}

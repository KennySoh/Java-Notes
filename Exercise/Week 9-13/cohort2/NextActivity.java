package com.example.cherylgoh.week9cohort_problem2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.KEY); //since u initialise KEY as u message in the main activity

        TextView welcome = (TextView) findViewById(R.id.myusername);
        welcome.setText("Welcome " +  message);
    }
}

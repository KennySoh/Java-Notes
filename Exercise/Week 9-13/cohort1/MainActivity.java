package com.example.cherylgoh.week9cohort_problem1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //main activity is the first thing that ur user sees on the app
    Button myButton;
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //gives the layout in ur activity main file

        myTextView = (TextView) findViewById(R.id.sutdaddress);
        myTextView.setVisibility(View.INVISIBLE);
        myButton = (Button) findViewById(R.id.button);
        myButton.setOnClickListener(
                /*wait for clicks (wants an instance of an onclick lister object)
                [press ctr+spacebar to show the documentation of the method incase u forget
                 */
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        //press ctrl + o to show methods that u can override
                        if(myTextView.getVisibility()==View.INVISIBLE){
                            myTextView.setVisibility(View.VISIBLE); //make text visible
                            myButton.setText("Hide Address");
                        }
                        else{
                            myTextView.setVisibility(View.INVISIBLE);
                            myButton.setText("Show Address");
                        }
                    }
                }
        );
    }
    //if u want to implement this "when click method" then insert (android:onClick="whenClick") under the button section in .xml file
    public void whenClick(View v){
        if(myTextView.getVisibility()==View.INVISIBLE){
            myTextView.setVisibility(View.VISIBLE); //make text visible
            myButton.setText("Hide Address");
        }
        else{
            myTextView.setVisibility(View.INVISIBLE);
            myButton.setText("Show Address");
        }
    }
}

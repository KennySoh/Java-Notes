package com.example.cherylgoh.week9cohort_problem2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button submitButton;
    EditText password;
    EditText name;
    public static final String KEY = "myMessage";
    RadioGroup showhidepassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //to instantiate
        submitButton = (Button) findViewById(R.id.submitbutton);
        password = (EditText) findViewById(R.id.passwordfield);
        name = (EditText) findViewById(R.id.myname);
        showhidepassword = (RadioGroup) findViewById(R.id.showhidepassword);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TO DO 1 - write code to check if password matches
                boolean isPasswordMatch = password.getText().toString().equals("pikachu") ; //sometimes .getText dont give u a string but a char, so u convert to string
                Log.i("Cheryl","text entered is " + password.getText() + " and " + isPasswordMatch); //to help u debug (whether the password u typed is
//TO DO 2 - write code to get the context
                Context context = view.getContext();  //main activity is a sub-sub-class of context
                if(  isPasswordMatch ){
                    Intent intent = new Intent(context,NextActivity.class); //second parameter is an object of the class in which it resides in
                    /*startActivity(intent);
                    //if u have no messages to pass, then u type this
                     */

                    String message = name.getText().toString();
                    intent.putExtra(KEY, message); // first parameter is key, second parameter is value
                    startActivity(intent);
//TO DO 3 - password matches, write the code for the intent

                }else{

//TO DO 4 - password does not match, write the code for whatever you'd like
                }

            }
        });


        showhidepassword.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                switch(checkedId)
                {
                    case R.id.showpassword:
                        password.setTransformationMethod(null);
                        break;
                    case R.id.hidepassword:
                        password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        break;

                }
            }
        });

        Log.i("Cheryl","onCreate() is invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Cheryl","onStart() is invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Cheryl", "onStop() is invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Cheryl","onDestroy() is invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Cheryl", "onResume() is invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Cheryl","onPause() is invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Cheryl","onRestart() is invoked");
    }



}

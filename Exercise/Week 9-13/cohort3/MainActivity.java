package com.example.cherylgoh.week9cohort_problem3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
        implements SharedPreferences.OnSharedPreferenceChangeListener{

    EditText searchLocation;
    Button getMap;
    SharedPreferences sharedPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TO DO 0.1 - set up by establishing references to the searchLocation widget and the getMapButton
        searchLocation = (EditText) findViewById(R.id.location);
        getMap = (Button) findViewById(R.id.btn_getMap);

        sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        sharedPref.registerOnSharedPreferenceChangeListener(this);

        String chkBoxLargeFontKey = getString(R.string.chkBoxLargeFontKey);
        boolean isButtonLargeFont = sharedPref.getBoolean(chkBoxLargeFontKey,false);
        changeSomeAttribute(isButtonLargeFont); //change font size
        /*Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194?z=10&q=restaurants");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);*/ //directly launches google maps and search restaurants

        //** PART 3 - READING FROM SharedPreferences **
        // TO DO 3.1 - [create a Preference Fragment and embed it in SettingsActivity]
        // TO DO 3.2 - read from SharedPreferences

    }

    public void changeSomeAttribute(boolean checked){
        if(checked){
            getMap.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
        }
        else{
            getMap.setTextSize(TypedValue.COMPLEX_UNIT_DIP,14);
        }
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

        if (key.equals(getString(R.string.chkBoxLargeFontKey))){

            //same code as above
            boolean checked = sharedPreferences.getBoolean(key,false);
            changeSomeAttribute(checked);

        }
    }

    public void onClick(View v){

        //TO DO 1.1 - get the search location from the EditText widget
        String myLocation = searchLocation.getText().toString().trim();
        //trim to remove any whitespaces and toString to convert location sequence to string cuz android studio will give as characters

        // TO DO 1.2 - build the Universal Resource Indicator (URI) that
        //build a uri that will load google maps
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("geo").opaquePart("0,0").appendQueryParameter("q",myLocation);

        Uri geoLocation = builder.build();

        //TO DO 1.3 - write the intent
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoLocation);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }

    // ** PART 1 - CALLBACK FOR GET MAP BUTTON **
    // TO DO 1 - onClick() callback


// *** PART 2 - CREATING A MENU ***
// TO DO 2.1 - [in res/menu folder], create an xml file defining your menu
// TO DO 2.2 - inflate your menu in onCreateOptionsMenu()

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

// TO DO 2.3 - [Create a new activity called SettingsActivity]
// TO DO 2.4 - create an intent in onOptionsItemSelected()

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.settings){
            Intent intent = new Intent(this, SettingsActivity.class);//this means this class?
            startActivity(intent);
        }
        return true;

        /*switch(item.getItemId()){
            case R.id.settings
                //do smth
                return true;

            case R.id.help
                //do smth
                showHelp();
                return true;
            default:
                return super.onOptionsItemSelected(item);
         */



    }


// ** PART 3 - READING FROM SharedPreferences **
    //NOTE: FRAGMENTS ARE REUSABLE PARTS OF UI "mini activity"
    // Preference fragment -> stores the preferences

    /*Steps:
    1)Create a preference fragment
        a. create the layout
        b. pass to preference fragment class
        c. in settings activity, u need a container in the settings activity layout
        d. INFLATE settings activity layout

    2) Get shared preference object
     */
// TO DO 3.3 onSharedPreferencesListener


}
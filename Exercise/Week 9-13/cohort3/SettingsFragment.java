package com.example.cherylgoh.week9cohort_problem3;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;

/**
 * Created by Cheryl Goh on 9/11/2017.
 */

public class SettingsFragment extends PreferenceFragment {
    //PreferenceFragment -> is the super class
    //ctrl+o to get all the different methods that can be overrided,

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}

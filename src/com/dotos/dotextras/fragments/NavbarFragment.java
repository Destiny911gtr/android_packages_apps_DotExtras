package com.dotos.dotextras.fragments;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.onPreferenceClick;

import com.dotos.R;


public class NavbarFragment extends PreferenceFragment implements Preference.OnPreferenceChangeListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.dot_navbar);

        Preference navpreference = getPreferenceManager().findPreference(getString(R.string.button_pref_title));
        navpreference.setOnPreferenceClickListener(new setOnPreferenceClickListener() {

        	@Override
        	public boolean onPreferenceClick(Preference navpreference) {
        		Process process;
        		process = Runtime.getRuntime().exec("am start -n "org.cyanogenmod.cmparts/.input.ButtonSettings"");     		
        	}
        });

    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object o) {
        return false;
    }
}
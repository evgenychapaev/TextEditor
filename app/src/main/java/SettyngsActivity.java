package com.example.zver.textid;

/**
 * Created by Zver on 06.03.2017.
 */
import android.os.Bundle;
import android.preference.PreferenceActivity;

class SettingsActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // загружаем предпочтения из ресурсов
        addPreferencesFromResource(R.xml.preferences);
    }
}

package com.example.notetoself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SettingActivity extends AppCompatActivity {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private boolean showDividers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        pref = getSharedPreferences("Note to self", MODE_PRIVATE);
        editor = pref.edit();

        showDividers = pref.getBoolean("dividers", true);
        Switch switch1 = (Switch) findViewById(R.id.switch1);
        switch1.setChecked(showDividers);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                showDividers = isChecked;
                editor.putBoolean("dividers", isChecked);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        editor.commit();
    }
}

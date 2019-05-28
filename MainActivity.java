package com.example.mocare_emergencybutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.settingsBu).setOnClickListener(this);
        findViewById(R.id.EmergencyButton).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.settingsBu:
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),Settings.class);
                this.startActivity(intent);
                break;
            case R.id.EmergencyButton:
                break;
        }
    }
}

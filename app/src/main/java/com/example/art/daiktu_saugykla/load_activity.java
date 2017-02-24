package com.example.art.daiktu_saugykla;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by art on 24/02/2017.
 */

public class load_activity extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        startActivity(new Intent(load_activity.this, MainActivity.class));
        finish();
    }

}

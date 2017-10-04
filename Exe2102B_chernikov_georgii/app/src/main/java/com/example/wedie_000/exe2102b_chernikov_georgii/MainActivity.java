package com.example.wedie_000.exe2102b_chernikov_georgii;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;


import customClasses.*;


public class MainActivity extends AppCompatActivity {

    TextView app_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Icon
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayShowHomeEnabled(true);
//        actionBar.setIcon(R.drawable.icon);

        // Init
        final SieveOfEratosthenes soe = new SieveOfEratosthenes();
        final TextView tv = (TextView) findViewById(R.id.outputPrimes);
        NumberPicker picker = (NumberPicker) findViewById(R.id.pickWheel);

        // Default settings
        picker.setMinValue(0);
        picker.setMaxValue(100);
        picker.setWrapSelectorWheel(true);


    }
}





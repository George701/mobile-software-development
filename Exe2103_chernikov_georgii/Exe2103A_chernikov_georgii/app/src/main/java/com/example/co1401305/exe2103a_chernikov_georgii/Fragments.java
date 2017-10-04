package com.example.co1401305.exe2103a_chernikov_georgii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class Fragments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fragment);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) throws CloneNotSupportedException {
        return super.clone();
    }
}

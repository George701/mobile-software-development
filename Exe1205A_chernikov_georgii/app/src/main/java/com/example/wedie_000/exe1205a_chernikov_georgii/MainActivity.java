package com.example.wedie_000.exe1205a_chernikov_georgii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;

public MenuInflater getMenuInflater ();

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public class MenuInflater{
        MenuInflater (Context context);
        void inflate (int menuRes, Menu menu);
    };

}

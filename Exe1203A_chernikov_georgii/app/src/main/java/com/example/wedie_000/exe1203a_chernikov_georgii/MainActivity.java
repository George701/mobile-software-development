package com.example.wedie_000.exe1203a_chernikov_georgii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textHint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textHint = (TextView)findViewById(R.id.textHint);
    }

    public void onButtonClick(View view){
        if (view.getId()==R.id.btnExit) finish();
        else textHint.setText(((Button)view).getText());
    }

    /*public class ClickButton extends AppCompatActivity{

    }*/

}

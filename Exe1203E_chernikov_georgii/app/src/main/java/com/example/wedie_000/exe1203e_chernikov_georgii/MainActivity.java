package com.example.wedie_000.exe1203e_chernikov_georgii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText textInput;
    private EditText textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput = (EditText)findViewById(R.id.textInput);
        textOutput = (EditText)findViewById(R.id.textOutput);
    }

    public class SumDigits{
        public int compute (final String snbr){
            int sum=0;

            for (int i = 0; i < snbr.length(); i++){
                int d = snbr.charAt(i) - '0';
                sum += d;
            }

            if (sum<10) return sum;
            else if (sum % 11 == 0) return sum;
            else return compute(String.valueOf(sum));
        }
    }

    public void onClick(View v){
        if (v.getId()==R.id.btn_exit) finish();
        else textOutput.setText(((SumDigits)v).getText());
    }
}

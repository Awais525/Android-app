package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.rg);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rg1:
                    getWindow().getDecorView().setBackgroundColor(Color.RED);
                    break;
                    case R.id.rg2:
                        getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.rg3:
                        getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                        break;
                    case R.id.rg4:
                        getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                        break;
                }
            }
        });
    }
}
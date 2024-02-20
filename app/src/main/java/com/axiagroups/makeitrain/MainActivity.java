package com.axiagroups.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private TextView moneyValue;
    private Button makeItRain;
    private Button showInfo;
    private int moneyCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moneyValue = findViewById(R.id.moneyValue);
        showInfo = findViewById(R.id.buttonShowInfo);
        makeItRain = findViewById(R.id.buttonMakeItRain);
    }

    public void showInfo(View view) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 1000;
        moneyValue.setText(String.valueOf(numberFormat.format(moneyCounter)));
//        Log.d("showInfo")
    }
}
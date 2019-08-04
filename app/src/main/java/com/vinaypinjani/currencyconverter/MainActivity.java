package com.vinaypinjani.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        Log.i("info", "button pressed");

        double newValue = Double.parseDouble(editText.getText().toString()) * 1.22d;
        String newValueString = Double.toString(newValue);

        Toast.makeText(this, newValueString + "$", Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

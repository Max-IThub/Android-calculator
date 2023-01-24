package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView Result;
    private EditText Num1, Num2;

    @SuppressLint("CutPasteId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Result = findViewById(R.id.Result);
        Num1 = findViewById(R.id.Num1);
        Num2 = findViewById(R.id.Num2);
        Button plus_button = findViewById(R.id.plus_button);
        Button minus_button = findViewById(R.id.minus_button);
        Button increase_button = findViewById(R.id.increase_button);
        Button divide_button = findViewById(R.id.divide_button);

        plus_button.setOnClickListener(v -> {
            float number1 = Float.parseFloat(Num1.getText().toString());
            float number2 = Float.parseFloat(Num2.getText().toString());
            float Res = number1 + number2;
            Result.setText(String.valueOf(Res));
        });

        minus_button.setOnClickListener(v -> {
            float number1 = Float.parseFloat(Num1.getText().toString());
            float number2 = Float.parseFloat(Num2.getText().toString());
            float Res = number1 - number2;
            Result.setText(String.valueOf(Res));
        });

        increase_button.setOnClickListener(v -> {
            float number1 = Float.parseFloat(Num1.getText().toString());
            float number2 = Float.parseFloat(Num2.getText().toString());
            float Res = number1 * number2;
            Result.setText(String.valueOf(Res));
        });

        divide_button.setOnClickListener(v -> {
            float number1 = Float.parseFloat(Num1.getText().toString());
            float number2 = Float.parseFloat(Num2.getText().toString());
            float Res = number1 / number2;
            Result.setText(String.valueOf(Res));
        });
    }

}
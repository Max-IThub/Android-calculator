package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Gravity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView Result;
    private EditText Num1, Num2;

    public float parseNumber(EditText CurrentEditText) {
        float number = 0.0f;
        try {
            number = Float.parseFloat(CurrentEditText.getText().toString());
        } catch (NumberFormatException e) {
            // do nothing here
        }
        return number;
    }

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

        Toast toast = Toast.makeText(getApplicationContext(),
                "Answer`s ready!",
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.START, 500, 0);     //not working!!!


//        if((Num1 != null)||(Num2 != null)){


        plus_button.setOnClickListener(v -> {
//            float number1 = Float.parseFloat(Num1.getText().toString());
//            float number2 = Float.parseFloat(Num2.getText().toString());
            float number1 = this.parseNumber(Num1);
            float number2 = this.parseNumber(Num2);

            float Res = number1 + number2;
            Result.setText(String.valueOf(Res));
            toast.show();
        });

        minus_button.setOnClickListener(v -> {
//            float number1 = Float.parseFloat(Num1.getText().toString());
//            float number2 = Float.parseFloat(Num2.getText().toString());
            float number1 = this.parseNumber(Num1);
            float number2 = this.parseNumber(Num2);

            float Res = number1 - number2;
            Result.setText(String.valueOf(Res));
            toast.show();
        });

        increase_button.setOnClickListener(v -> {
//            float number1 = Float.parseFloat(Num1.getText().toString());
//            float number2 = Float.parseFloat(Num2.getText().toString());

            float number1 = this.parseNumber(Num1);
            float number2 = this.parseNumber(Num2);

            float Res = number1 * number2;
            Result.setText(String.valueOf(Res));
            toast.show();
        });

        divide_button.setOnClickListener(v -> {
//            float number1 = Float.parseFloat(Num1.getText().toString());
//            float number2 = Float.parseFloat(Num2.getText().toString());
            float number1 = this.parseNumber(Num1);
            float number2 = this.parseNumber(Num2);

            String result_as_text = "";

            if (number2 == 0.0f) {
                result_as_text = "Infinity =)";
            } else {
                float Res = number1 / number2;
                result_as_text = String.valueOf(Res);
            }

            Result.setText(result_as_text);


            toast.show();
        });
//    }
//        else if ((Num1 == null)||(Num2 == null)){
//            Toast toast = Toast.makeText(getApplicationContext(),
//                    "One of this places = null",
//                    Toast.LENGTH_SHORT);
//            toast.show();
//        }

    }
}
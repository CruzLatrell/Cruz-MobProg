package com.example.cruz_labexercise4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android. view. View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void sum (View v){
        EditText first = findViewById(R.id.editTextNumber);
        EditText second = findViewById(R.id.editTextNumber2);
        Button add= findViewById(R.id.button3);
        String a = first. getText().toString();
        String b = second. getText().toString();

        Integer val1 = Integer.parseInt(a);
        Integer val2 = Integer.parseInt(b);
        Integer add1 = val1 + val2;
        Toast.makeText(getApplicationContext(), "Sum = " + add1, Toast. LENGTH_LONG).show();
    }

    public void subtraction (View v) {
        EditText first = findViewById(R.id.editTextNumber);
        EditText second = findViewById(R.id.editTextNumber2);
        Button add2 = findViewById(R.id.button4);
        String a = first.getText().toString();
        String b = second.getText().toString();

        Integer val1 = Integer.parseInt(a);
        Integer val2 = Integer.parseInt(b);
        Integer add1 = val1 - val2;
        Toast.makeText(getApplicationContext(), "sub = " + add1, Toast.LENGTH_LONG).show();
    }

    public void Multiplication (View v) {
        EditText first = findViewById(R.id.editTextNumber);
        EditText second = findViewById(R.id.editTextNumber2);
        Button add3 = findViewById(R.id.button5);
        String a = first.getText().toString();
        String b = second.getText().toString();

        Integer val1 = Integer.parseInt(a);
        Integer val2 = Integer.parseInt(b);
        Integer add1 = val1 * val2;
        Toast.makeText(getApplicationContext(), "Product = " + add1, Toast.LENGTH_LONG).show();
    }

    public void Division (View v) {
        EditText first = findViewById(R.id.editTextNumber);
        EditText second = findViewById(R.id.editTextNumber2);
        Button add4 = findViewById(R.id.button6);
        String a = first.getText().toString();
        String b = second.getText().toString();

        Integer val1 = Integer.parseInt(a);
        Integer val2 = Integer.parseInt(b);
        Integer add1 = val1 / val2;
        Toast.makeText(getApplicationContext(), "Division = " + add1, Toast.LENGTH_LONG).show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
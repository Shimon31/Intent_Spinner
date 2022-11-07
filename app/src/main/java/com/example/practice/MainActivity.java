package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    Spinner spinner1;
    String name, age,gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editTextName);
        editText2 = findViewById(R.id.editTextAge);
        spinner1 = findViewById(R.id.spinnerID);


    }

    public void Details(View view) {

      name =  editText1.getText().toString();
      age = editText2.getText().toString();
      gender = spinner1.getSelectedItem().toString();

        Toast.makeText(this, "Name is :"+name+"\nAge is :"+age+"\nGender :"+gender, Toast.LENGTH_SHORT).show();

    }



    public void second(View view) {
        Intent myintent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(myintent);
    }
}
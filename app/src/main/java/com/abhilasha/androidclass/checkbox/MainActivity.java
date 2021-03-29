package com.abhilasha.androidclass.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox pizza, coffee, burger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizza = findViewById(R.id.pizza);
        coffee = findViewById(R.id.coffee);
        burger = findViewById(R.id.burger);
    }

    public void ButtonCheckBox(View view)
    {
        int total = 0;
        if (pizza.isChecked()) {
            total += 150;
            Toast.makeText(this, "Pizza is Checked", Toast.LENGTH_SHORT).show();
        }
        if (coffee.isChecked()) {
            total += 100;
            Toast.makeText(this, "Coffee is Checked", Toast.LENGTH_SHORT).show();
        }
        if (burger.isChecked())
        {
           total += 150;
            Toast.makeText(this, "Burger is Checked", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "Your Total bill amount is :" + total, Toast.LENGTH_SHORT).show();
    }
}


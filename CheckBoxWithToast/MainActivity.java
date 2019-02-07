package com.example.akshay.checkboxwithtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    CheckBox bread,milk,butter,egg,cheez,paneer;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bread = findViewById(R.id.bread_id);
        milk = findViewById(R.id.milk_id);
        butter = findViewById(R.id.butter_id);
        egg = findViewById(R.id.egg_id);
        cheez = findViewById(R.id.cheez_id);
        paneer = findViewById(R.id.paneer_id);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                StringBuffer list = new StringBuffer();
                if (bread.isChecked()) {
                    list.append(bread.getText());
                }
                if (milk.isChecked()) {
                    list.append("\n"+milk.getText());
                }
                if (butter.isChecked()){
                    list.append("\n"+butter.getText());
                }
                if(egg.isChecked()) {
                    list.append("\n"+egg.getText());
                }
                if(cheez.isChecked()) {
                    list.append("\n"+cheez.getText());
                }
                if(paneer.isChecked()) {
                    list.append("\n"+paneer.getText());
                }
                Toast.makeText(MainActivity.this, list,Toast.LENGTH_SHORT).show();
            }
        });


    }
}

package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageButton Bt = (ImageButton) findViewById(R.id.imageButton);
        Bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3.this,MainActivityN.class);
                startActivity(i);
            }
        });
        ImageButton Bt2 = (ImageButton) findViewById(R.id.imageButton2);
        Bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3.this,MainActivityN.class);
                startActivity(i);
            }
        });
        ImageButton Bt3 = (ImageButton) findViewById(R.id.imageButton3);
        Bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3.this,MainActivityN.class);
                startActivity(i);
            }
        });
        ImageButton Bt4 = (ImageButton) findViewById(R.id.imageButton4);
        Bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3.this,MainActivityN.class);
                startActivity(i);
            }
        });

    }
}
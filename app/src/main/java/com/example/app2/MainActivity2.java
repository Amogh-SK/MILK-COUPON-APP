package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView username = (TextView) findViewById(R.id.editTextUsername);
        TextView password = (TextView) findViewById(R.id.editTextPassword);

        Button loginbtn = (Button) findViewById(R.id.buttonlogin);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Amogh") && password.getText().toString().equals("password")) {
                    Toast.makeText(getApplicationContext(), "LOGIN SUCCESSFULL", Toast.LENGTH_LONG).show();
                    Intent i2 = new Intent(MainActivity2.this,MainActivity3.class);
                    startActivity(i2);







                }else Toast.makeText(getApplicationContext(), "LOGIN UNSUCCESSFULL", Toast.LENGTH_LONG).show();


            }
        });
    }
}
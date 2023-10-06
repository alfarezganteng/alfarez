package com.alfarez.alfarez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Etuser, EtPass;
    private Button btnLogin;

    private String username = "Alfarez724";
    private String password = "aleale";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Etuser = findViewById(R.id.Etuser);
        EtPass = findViewById(R.id.Etpass);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Etuser.getText().toString().equalsIgnoreCase(username) && EtPass.getText().toString().equalsIgnoreCase(password)){
                    Intent login = new Intent(MainActivity.this, Dashboard.class);
                    startActivity(login);

                    Toast.makeText(MainActivity.this, "Mantap Kamu!!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "SALAH", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
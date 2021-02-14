package com.example.cv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Estudios extends AppCompatActivity {

    Button bot;
    private Toolbar tb;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estudios);

        tb = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(tb);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Estudios");
    }

    public void certificados(View vista){
        Intent i = new Intent(this, Certificados.class);
        startActivity(i);
    }



}

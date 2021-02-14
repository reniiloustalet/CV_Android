package com.example.cv;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar tb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(tb);
        getSupportActionBar().setTitle("CV");
    }

    public void estudios(View vista){
        Intent i = new Intent(this, Estudios.class);
        startActivity(i);
    }

    public void linkedinSite(View vista){
        String url = "https://linkedin.com/in/renataloustalet";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void githubSite(View vista){
        String url = "https://github.com/reniiloustalet";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void datosPersonales(View vista){
        Intent i = new Intent(this, DatosPersonales.class);
        startActivity(i);
    }

}
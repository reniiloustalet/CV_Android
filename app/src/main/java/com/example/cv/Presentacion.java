package com.example.cv;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Presentacion extends AppCompatActivity {

    Button bot;
    VideoView vV;
    private Toolbar tb;

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presentacion);

            vV = (VideoView) findViewById(R.id.video);
            Uri uri = Uri.parse("android.resource://com.example.cv/" + R.raw.topa_juliana);

            tb = (Toolbar) findViewById(R.id.tool_bar);
            setSupportActionBar(tb);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle("Presentación");

            vV.setVideoURI(uri);
            vV.start();
            MediaController mc = new MediaController(this);
            vV.setMediaController(mc);
            mc.setAnchorView(vV);

    }

}

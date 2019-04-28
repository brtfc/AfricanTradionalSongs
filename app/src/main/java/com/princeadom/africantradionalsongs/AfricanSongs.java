package com.princeadom.africantradionalsongs;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfricanSongs extends AppCompatActivity {

    Button rainforest,
            lion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_african_songs);

        rainforest = findViewById(R.id.rainforest);
        lion = findViewById(R.id.lion);

        final MediaPlayer rain = MediaPlayer.create(this, R.raw.rainforest);
        final MediaPlayer Lions = MediaPlayer.create(this, R.raw.lionroar);

        rainforest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rain.start();
            }
        });

        lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lions.start();
            }
        });
    }
}

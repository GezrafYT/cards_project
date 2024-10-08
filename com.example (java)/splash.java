package com.example.card_game;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;


public class splash extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
    }


    public void moveToScreen(View view)
    {

        Intent i1 = new Intent(this, menu.class);
        startActivity(i1);
    }
}

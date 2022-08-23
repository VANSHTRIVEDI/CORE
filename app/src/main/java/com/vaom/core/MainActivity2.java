package com.vaom.core;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void fronte(View view) {
        Intent f=new Intent(this,frontend.class);
        startActivity(f);

    }

    public void back(View view) {
        Intent b=new Intent(this,backend.class);
        startActivity(b);
    }

    public void ui(View view)
    {

        Intent uii=new Intent(this,ui.class);
        startActivity(uii);

    }

    public void da(View view) {
     Intent daa=new Intent(this,data.class);
     startActivity(daa);
    }

    public void ur(View view) {
    Intent urr=new Intent(this,urgent.class);
    startActivity(urr);
    }
}
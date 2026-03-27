package com.example.lab_2;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity2(View view) {
        startActivity(new Intent(this, Activity2.class));
    }

    public void openActivity3(View view) {
        startActivity(new Intent(this, Activity3.class));
    }

    public void openActivity4(View view) {
        startActivity(new Intent(this, Activity4.class));
    }

    public void closeApp(View view) {
        finishAffinity();
    }
}
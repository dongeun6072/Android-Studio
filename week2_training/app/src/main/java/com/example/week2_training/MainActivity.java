package com.example.week2_training;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.week2_training.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnButton1clicked(View v){
        Intent intent = new Intent(getApplicationContext(),webActivity.class);
        startActivity(intent);
    }

    public void OnButton2clicked(View v){
        Intent intent = new Intent(getApplicationContext(),telActivity.class);
        startActivity(intent);
    }

}
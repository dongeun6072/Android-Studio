package com.example.week2_training;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.week2_training.R;

import java.net.URI;

public class telActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tel);
    }

    public void OnButton12clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-0000-0001"));
        startActivity(intent);
    }

    public void OnButton8clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-0000-0002"));
        startActivity(intent);
    }

    public void OnButton9clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-0000-0003"));
        startActivity(intent);
    }

    public void OnButton10clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-0000-0004"));
        startActivity(intent);
    }

    public void OnButton11clicked(View v){
        Toast.makeText(getApplicationContext(),"메인화면으로 이동합니다.",Toast.LENGTH_LONG).show();
        finish();
    }
}
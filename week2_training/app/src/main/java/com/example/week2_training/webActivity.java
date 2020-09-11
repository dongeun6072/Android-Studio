package com.example.week2_training;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.week2_training.R;

public class webActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
    }

    public void OnButton3clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }

    public void OnButton4clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.instagram.com"));
        startActivity(intent);
    }

    public void OnButton5clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.youtube.com"));
        startActivity(intent);
    }

    public void OnButton6clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.acmicpc.net"));
        startActivity(intent);
    }

    public void OnButton7clicked(View v){
        Toast.makeText(getApplicationContext(),"메인화면으로 이동합니다.",Toast.LENGTH_LONG).show();
        finish();
    }

}
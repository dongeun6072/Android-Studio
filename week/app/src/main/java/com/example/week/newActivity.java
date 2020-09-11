package com.example.week;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.week.R;

public class newActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

    }

    public void onBackButtonClicked(View v){
        Toast.makeText(getApplicationContext(),"돌아가기 버튼이 눌렸어요.",Toast.LENGTH_LONG).show();
        finish();
    }
}
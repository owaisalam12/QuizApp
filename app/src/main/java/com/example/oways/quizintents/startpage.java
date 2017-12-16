package com.example.oways.quizintents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class startpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpage);
    }

    public void startQuiz(View view){
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }
}

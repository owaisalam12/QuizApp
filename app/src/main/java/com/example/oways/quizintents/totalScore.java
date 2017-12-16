package com.example.oways.quizintents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.oways.quizintents.R.layout.totalscore;
import static com.example.oways.quizintents.question1.score;

public class totalScore extends AppCompatActivity {

    MainActivity mainActivity=new MainActivity();
    private int backButtonCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(totalscore);
        //Intent intent = new Intent(getApplicationContext(), question5.class);
        //startActivity(intent);
        TextView scoreView=(TextView)findViewById(R.id.total_score);
        //String ch=(String)score;
        scoreView.setText(Integer.toString(score));

    }

    @Override
    public void onBackPressed() {
        if (backButtonCount >= 1) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Press the back button once again to exit.", Toast.LENGTH_SHORT).show();
            backButtonCount++;
        }
    }
}

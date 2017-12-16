package com.example.oways.quizintents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.example.oways.quizintents.question1.score;
import static com.example.oways.quizintents.R.layout.totalscore;

public class totalScore extends AppCompatActivity {

    MainActivity mainActivity=new MainActivity();
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
//    public void nextQuestion(View view) {
//        //Intent intent=new Intent(this,question2.class);
//
//    }

}

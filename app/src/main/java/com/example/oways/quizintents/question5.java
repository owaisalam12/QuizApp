package com.example.oways.quizintents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static com.example.oways.quizintents.question1.score;
import static com.example.oways.quizintents.R.layout.question5;

public class question5 extends AppCompatActivity {

    MainActivity mainActivity=new MainActivity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(question5);
    }
    public void nextQuestion(View view){
        Intent intent=new Intent(getApplicationContext(),totalScore.class);
        startActivity(intent);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton ansRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
        String ans1 = ansRadioButton.getText().toString();
        if(ans1.equals("null")){
            score++;
            Log.v("question5","Score: "+score);

        }
        else {

        }
    }
    public void score(View view){
        //Toast.makeText(mainActivity, "Score: "+score, Toast.LENGTH_SHORT).show();
        Log.v("Total","Score: "+score);
        //Toast.makeText(this, "Score: "+score, Toast.LENGTH_SHORT).show();
    }
}

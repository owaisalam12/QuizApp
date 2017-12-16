package com.example.oways.quizintents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static com.example.oways.quizintents.question1.score;
import static com.example.oways.quizintents.R.layout.question4;

public class question4 extends AppCompatActivity {

    MainActivity mainActivity=new MainActivity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(question4);
    }
    public void nextQuestion(View view){
        //Intent intent=new Intent(this,question2.class);
        Intent intent=new Intent(getApplicationContext(),question5.class);
        startActivity(intent);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton ansRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
        String ans1 = ansRadioButton.getText().toString();
        if(ans1.equals("Static")){
            score++;
            Log.v("question4","Score: "+score);

        }
        else {

        }
    }

}

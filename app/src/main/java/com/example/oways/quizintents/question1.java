package com.example.oways.quizintents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class question1 extends AppCompatActivity {

    static int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
    }

    public void nextQuestion(View view){
        Intent intent=new Intent(getApplicationContext(),question2.class);
        startActivity(intent);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton ansRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
        String ans1 = ansRadioButton.getText().toString();
        if(ans1.equals("java runtime environment")){
            score++;
            Log.v("question1","Score: "+score);

        }
        else {

        }
    }
}

package com.example.oways.quizintents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.oways.quizintents.R.layout.question4;
import static com.example.oways.quizintents.question1.score;

public class question4 extends AppCompatActivity {

    MainActivity mainActivity=new MainActivity();
    private int backButtonCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(question4);
    }

    public void nextQuestion(View view){
        //Intent intent=new Intent(this,question2.class);
        Intent intent=new Intent(getApplicationContext(),question5.class);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one", Toast.LENGTH_SHORT).show();
        } else {

            RadioButton ansRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            String ans1 = ansRadioButton.getText().toString();
            if (ans1.equals("Static")) {
                score++;
                Log.v("question1", "Score: " + score);

            } else {

            }
            startActivity(intent);

        }

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
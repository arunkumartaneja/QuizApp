package com.abnd.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int correctAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {
        correctAnswers = 0;

        // Question1
        RadioButton radioButton = findViewById(R.id.q1_a);
        if (radioButton.isChecked()) {
            correctAnswers++;
        }
        // Question2
        radioButton = findViewById(R.id.q2_b);
        if (radioButton.isChecked()) {
            correctAnswers++;
        }

        // Question3
        EditText editText = findViewById(R.id.q3_a);
        String userInput = editText.getText().toString().toLowerCase();
        if (userInput.contains("earth")) {
            correctAnswers++;
        }
        // Question4
        editText = findViewById(R.id.q4_a);
        userInput = editText.getText().toString().toLowerCase();
        if (userInput.contains("moon")) {
            correctAnswers++;
        }

        // Question5
        CheckBox c1 = findViewById(R.id.q5_a);
        CheckBox c2 = findViewById(R.id.q5_b);
        CheckBox c3 = findViewById(R.id.q5_c);
        CheckBox c4 = findViewById(R.id.q5_d);

        if (c1.isChecked() && c3.isChecked() && !c2.isChecked() && !c4.isChecked()) {
            correctAnswers++;
        }

        // Question6
        c1 = findViewById(R.id.q6_a);
        c2 = findViewById(R.id.q6_b);
        c3 = findViewById(R.id.q6_c);
        c4 = findViewById(R.id.q6_d);
        if (!c1.isChecked() && !c2.isChecked() && c3.isChecked() && c4.isChecked()) {
            correctAnswers++;
        }

        Toast toast = Toast.makeText(MainActivity.this, "Correct Answers : " + correctAnswers, Toast.LENGTH_LONG);
        toast.show();

    }

}

package com.example.qiuzapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    Button button;
    TextView textView , textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        textView = findViewById(R.id.textView2);
        textView1  = findViewById(R.id.textView4);
        textView2 = findViewById(R.id.textView5);
        button = findViewById(R.id.restartBtn);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Correct Answers: "+ QuestionActivity.correct + "\n");
        StringBuffer stringBuffer1  = new StringBuffer();
        stringBuffer1.append("Wrong Answers:" + QuestionActivity.wrong + "\n");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Final Score: " + QuestionActivity.correct + "\n");


        textView.setText(stringBuffer);
        textView1.setText(stringBuffer1);
        textView2.setText(stringBuffer2);

        QuestionActivity.correct = 0;
        QuestionActivity.wrong = 0;


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}

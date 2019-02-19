package com.wmstudio.dlrexcom;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class questions extends AppCompatActivity {
    public static final String TRUE_SCORE = "trueScore";
    public static final String FALSE_SCORE = "falseScore";
    private static long COUNTDOWN_IN_MILLIS = 6000;
    ImageView shape_image;
    Button top_button,right_button,bottom_button;
    TextView questions_count,trues,falses;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;
    private List<question> questionList;
    int questionCounter;
    private int questionCountTotal;
    private question currentQustion;
    private int dogru;
    private int yanlis;
    private String yon_last;
    private String renk_last;
    private int dot_count_last;
    ArrayList<String> yon;
    ArrayList<String> renk;
    int a;
    int b;

    private boolean answered;
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        questions_count=findViewById(R.id.questions_count_custom);
        trues=findViewById(R.id.trues_custom);
        falses=findViewById(R.id.falses);
        final String level1 = "level1";
        final String level2 = "level2";
        Intent intentget = getIntent();
        String levels;
        levels = intentget.getStringExtra("levels");
        if (levels.matches(level1)){
            COUNTDOWN_IN_MILLIS=3000;
        }else if (levels.matches(level2)){
            COUNTDOWN_IN_MILLIS=4000;
        }else{
            COUNTDOWN_IN_MILLIS=5000;
        }
        shape_image = findViewById(R.id.shape_image);
        top_button = findViewById(R.id.top_button_custom);
        right_button = findViewById(R.id.right_button_custom);
        bottom_button = findViewById(R.id.bottom_button_custom);
        questionDBHelper dbHelper = new questionDBHelper(this);
        questionList = dbHelper.getAllquestions();
        questionCountTotal= questionList.size();
        Collections.shuffle(questionList);
        yon = new ArrayList<>();
        renk = new ArrayList<>();
        showNextQuestion();

        top_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer1();
            }
        });
        right_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer2();
            }
        });
        bottom_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer3();
            }
        });



    }
    private void startCountDown() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
            }

            @Override
            public void onFinish() {
                timeLeftInMillis = 0;
                showNextQuestion();
            }
        }.start();
    }

    private void checkAnswer1(){
        countDownTimer.cancel();
        if (renk.size()>1){
            a = questionCounter - 2;
            b = questionCounter-1;
            if (renk.get(a).equals(renk.get(b))){
                dogru++;
                trues.setText("True: "+dogru);
                showNextQuestion();
            }else if (!renk.get(a).equals(b)){
                yanlis++;
                falses.setText("False: "+ yanlis);
                showNextQuestion();

            }else{
                yanlis++;
                falses.setText("False: "+ yanlis);
                showNextQuestion();
            }
        }else{
            yanlis++;
            falses.setText("False: "+ yanlis);
            showNextQuestion();
        }

    }
    private void checkAnswer2(){
        countDownTimer.cancel();
        if (renk.size()>1){
            a = questionCounter - 2;
            b = questionCounter-1;
            if (!yon.get(a).equals(yon.get(b)) && !renk.get(a).equals(renk.get(b))){
                dogru++;
                trues.setText("True: "+dogru);
                showNextQuestion();
            }else if (yon.get(a).isEmpty()){
                dogru++;
                trues.setText("True: "+dogru);
                showNextQuestion();
            }else{
                yanlis++;
                falses.setText("False: "+ yanlis);
                showNextQuestion();
            }
        }else{
            dogru++;
            trues.setText("True: "+dogru);
            showNextQuestion();
        }


    }
    private void checkAnswer3(){
        countDownTimer.cancel();
        if (yon.size()>1){
            a = questionCounter - 2;
            b = questionCounter-1;
            if (yon.get(a).equals(yon.get(b))){
                dogru++;
                trues.setText("True: "+dogru);
                showNextQuestion();
            }else if (!yon.get(a).equals(yon.get(b))){
                yanlis++;
                falses.setText("False: "+ yanlis);
                showNextQuestion();
            }else{
                yanlis++;
                falses.setText("False: "+ yanlis);
                showNextQuestion();
            }
        }else{
            yanlis++;
            falses.setText("False: "+ yanlis);
            showNextQuestion();
        }


    }
    private void showNextQuestion(){
        if (questionCounter< questionCountTotal){
            questions_count.setText(questionCounter+" / "+questionCountTotal);
            currentQustion = questionList.get(questionCounter);
            yon_last = currentQustion.getQuestion_direction();
            renk_last = currentQustion.getQuestion_color();
            dot_count_last = currentQustion.getQuestion_dot();
            yon.add(yon_last);
            renk.add(renk_last);
            shape_image.setImageResource(currentQustion.getQuestion());
            questionCounter++;
            timeLeftInMillis = COUNTDOWN_IN_MILLIS;
            startCountDown();
            answered=false;
        }else {
            finishQuiz();
        }
    }

    private void finishQuiz(){
        Intent resultIntent = new Intent(getApplicationContext(),scores.class);
        String trues = String.valueOf(dogru);
        String falses = String.valueOf(yanlis);
        resultIntent.putExtra(TRUE_SCORE, trues);
        resultIntent.putExtra(FALSE_SCORE, falses);
        setResult(RESULT_OK, resultIntent);
        startActivity(resultIntent);
    }
    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            finishQuiz();
        } else {
            Toast.makeText(this, "Click double!", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}

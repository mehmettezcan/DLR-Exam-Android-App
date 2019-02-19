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

public class question_custom extends AppCompatActivity {
    public static final String TRUE_SCORE = "trueScore";
    public static final String FALSE_SCORE = "falseScore";
    private static long COUNTDOWN_IN_MILLIS = 6000;

    ImageView shape_image_custom;
    TextView questions_count_custom,trues_custom;
    TextView false_custom_;
    Button top_button_custom,right_button_custom,bottom_button_custom;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;
    private List<question> questionList;
    private int questionCounter;
    private int questionCountTotal;
    private question currentQustion;
    private int dogru_custom;
    private int yanlis_custom;
    private boolean answered;
    int second;
    int question_number;
    private long backPressedTime;
    private String yon_last;
    private String renk_last;
    private int dot_count_last;
    ArrayList<String> yon_custom;
    ArrayList<String> renk_custom;
    int a;
    int b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_custom);
        trues_custom=findViewById(R.id.truess_custom);
        false_custom_=findViewById(R.id.falses_custom);
        questions_count_custom=findViewById(R.id.questions_count_custom);
        Intent intent_get = getIntent();
        second = intent_get.getIntExtra("second",3);
        question_number = intent_get.getIntExtra("question_number",5);
        if (second == 3){
            COUNTDOWN_IN_MILLIS=3000;
        }else if (second == 4){
            COUNTDOWN_IN_MILLIS=4000;
        }else if (second == 5){
            COUNTDOWN_IN_MILLIS=5000;
        }else if (second == 6){
            COUNTDOWN_IN_MILLIS=6000;
        }else{
            COUNTDOWN_IN_MILLIS=7000;
        }
        shape_image_custom = findViewById(R.id.shape_image_custom);
        top_button_custom = findViewById(R.id.top_button_custom);
        right_button_custom = findViewById(R.id.right_button_custom);
        bottom_button_custom = findViewById(R.id.bottom_button_custom);
        questionDBHelper dbHelper = new questionDBHelper(this);
        questionList = dbHelper.getAllquestions();
        questionCountTotal= questionList.size();
        Collections.shuffle(questionList);
        yon_custom = new ArrayList<>();
        renk_custom = new ArrayList<>();
        showNextQuestion();

        top_button_custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer1();
            }
        });
        right_button_custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer2();
            }
        });
        bottom_button_custom.setOnClickListener(new View.OnClickListener() {
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
        if (renk_custom.size()>1){
            a = questionCounter - 2;
            b = questionCounter-1;
            if (renk_custom.get(a).equals(renk_custom.get(b))){
                dogru_custom++;
                trues_custom.setText("True: "+dogru_custom);
                showNextQuestion();
            }else if (!renk_custom.get(a).equals(b)){
                yanlis_custom++;
                false_custom_.setText("False: "+ yanlis_custom);
                showNextQuestion();

            }else{
                yanlis_custom++;
                false_custom_.setText("False: "+ yanlis_custom);
                showNextQuestion();
            }
        }else{
            yanlis_custom++;
            false_custom_.setText("False: "+ yanlis_custom);
            showNextQuestion();
        }

    }
    private void checkAnswer2(){
        countDownTimer.cancel();
        if (renk_custom.size()>1){
            a = questionCounter - 2;
            b = questionCounter-1;
            if (!yon_custom.get(a).equals(yon_custom.get(b)) && !renk_custom.get(a).equals(renk_custom.get(b))){
                dogru_custom++;
                trues_custom.setText("True: "+dogru_custom);
                showNextQuestion();
            }else if (yon_custom.get(a).isEmpty()){
                dogru_custom++;
                trues_custom.setText("True: "+dogru_custom);
                showNextQuestion();
            }else{
                yanlis_custom++;
                false_custom_.setText("False: "+ yanlis_custom);
                showNextQuestion();
            }
        }else{
            dogru_custom++;
            trues_custom.setText("True: "+dogru_custom);
            showNextQuestion();
        }


    }
    private void checkAnswer3(){
        countDownTimer.cancel();
        if (yon_custom.size()>1){
            a = questionCounter - 2;
            b = questionCounter-1;
            if (yon_custom.get(a).equals(yon_custom.get(b))){
                dogru_custom++;
                trues_custom.setText("True: "+dogru_custom);
                showNextQuestion();
            }else if (!yon_custom.get(a).equals(yon_custom.get(b))){
                yanlis_custom++;
                false_custom_.setText("False: "+ yanlis_custom);
                showNextQuestion();
            }else{
                yanlis_custom++;
                false_custom_.setText("False: "+ yanlis_custom);
                showNextQuestion();
            }
        }else{
            yanlis_custom++;
            false_custom_.setText("False: "+ yanlis_custom);
            showNextQuestion();
        }


    }
    private void showNextQuestion(){

        if (questionCounter< question_number){
            questions_count_custom.setText(questionCounter+" / "+question_number);
            currentQustion = questionList.get(questionCounter);
            yon_last = currentQustion.getQuestion_direction();
            renk_last = currentQustion.getQuestion_color();
            dot_count_last = currentQustion.getQuestion_dot();
            yon_custom.add(yon_last);
            renk_custom.add(renk_last);
            shape_image_custom.setImageResource(currentQustion.getQuestion());
            questionCounter++;
            timeLeftInMillis = COUNTDOWN_IN_MILLIS;
            startCountDown();
            answered=false;
            timeLeftInMillis = COUNTDOWN_IN_MILLIS;
        }else {
            finishQuiz();
        }
    }

    private void finishQuiz(){
        Intent resultIntent = new Intent(getApplicationContext(),scores.class);
        String trues = String.valueOf(dogru_custom);
        String falses = String.valueOf(yanlis_custom);
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


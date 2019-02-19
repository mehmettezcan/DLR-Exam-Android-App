package com.wmstudio.dlrexcom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static com.wmstudio.dlrexcom.questions.TRUE_SCORE;

public class rules extends AppCompatActivity {
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        next = findViewById(R.id.next);
        final String level1 = "level1";
        final String level2 = "level2";
        final String level3 = "level3";
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentget = getIntent();
                String levels;
                levels = intentget.getStringExtra("levels");
                if (levels.matches(level1)){
                    Intent intent = new Intent(getApplicationContext(),questions.class);
                    intent.putExtra("levels",level1);
                    startActivity(intent);
                }else if (levels.matches(level2)){
                    Intent intent = new Intent(getApplicationContext(),questions.class);
                    intent.putExtra("levels",level2);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(getApplicationContext(),questions.class);
                    intent.putExtra("levels",level3);
                    startActivity(intent);
                }
            }
        });
    }
}

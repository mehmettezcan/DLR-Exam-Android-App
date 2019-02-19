package com.wmstudio.dlrexcom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class start_page extends AppCompatActivity {
    ImageButton previous_button;
    Button level_1,level_2,level_3,custom_level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        previous_button = findViewById(R.id.previous_button);
        level_1 = findViewById(R.id.level_1);
        level_2 = findViewById(R.id.level_2);
        level_3 = findViewById(R.id.level_3);
        custom_level = findViewById(R.id.custom_level);

        previous_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),main_page.class);
                startActivity(intent);
            }
        });
        level_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String levels = "level1";
                Intent intent = new Intent(getApplicationContext(),rules.class);
                intent.putExtra("levels",levels);
                startActivity(intent);
            }
        });
        level_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String levels = "level2";
                Intent intent = new Intent(getApplicationContext(),rules.class);
                intent.putExtra("levels",levels);
                startActivity(intent);
            }
        });
        level_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String levels = "level3";
                Intent intent = new Intent(getApplicationContext(),rules.class);
                intent.putExtra("levels",levels);
                startActivity(intent);
            }
        });
        custom_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),custom_level_start.class);
                startActivity(intent);
            }
        });

    }
}

package com.wmstudio.dlrexcom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import com.wmstudio.dlrexcom.recycler_view.recycler_adapter;

import java.util.ArrayList;
import static com.wmstudio.dlrexcom.questions.FALSE_SCORE;
import static com.wmstudio.dlrexcom.questions.TRUE_SCORE;

public class scores extends AppCompatActivity {
    ImageButton previous;
    RecyclerView recyclerView;
    recycler_adapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        previous = findViewById(R.id.previous);
        ArrayList<String> true_scores = new ArrayList<>();
        ArrayList<String> false_scores = new ArrayList<>();
        Intent intent = getIntent();
        String true_degree;
        String false_degree;
        true_degree = intent.getStringExtra(TRUE_SCORE);
        false_degree = intent.getStringExtra(FALSE_SCORE);
        true_scores.add(true_degree);
        false_scores.add(false_degree);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerAdapter = new recycler_adapter(true_scores,false_scores);
        RecyclerView.LayoutManager recycler_layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(recycler_layoutManager);
        recyclerView.setAdapter(recyclerAdapter);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),main_page.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(),main_page.class);
        startActivity(intent);
    }
}

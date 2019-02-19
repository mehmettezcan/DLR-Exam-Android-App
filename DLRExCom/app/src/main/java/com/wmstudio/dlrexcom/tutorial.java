package com.wmstudio.dlrexcom;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.wmstudio.dlrexcom.fragments.Fragment_tutorial_1;
import com.wmstudio.dlrexcom.fragments.Fragment_tutorial_2;
import com.wmstudio.dlrexcom.fragments.Fragment_tutorial_3;
import com.wmstudio.dlrexcom.fragments.viewPagerAdapter;

public class tutorial extends AppCompatActivity {
    private ViewPager viewPager;
    ImageButton back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        viewPager = findViewById(R.id.view_pager);
        back =findViewById(R.id.back);
        viewPagerAdapter viewPagerAdapter = new viewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.AddFragment(new Fragment_tutorial_1(),"tutorial_1");
        viewPagerAdapter.AddFragment(new Fragment_tutorial_2(),"tutorial_2");
        viewPagerAdapter.AddFragment(new Fragment_tutorial_3(),"tutorial_3");
        viewPager.setAdapter(viewPagerAdapter);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),main_page.class);
                startActivity(intent);
            }
        });

    }
}

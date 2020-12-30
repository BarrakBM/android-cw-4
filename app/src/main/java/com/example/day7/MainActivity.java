package com.example.day7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = findViewById(R.id.vpp);
        TabLayout tb = findViewById(R.id.tbl);


        tb.setupWithViewPager(vp); // نربطهم مع بعض vp و tb
        FragmentPagerAdapter adapter = new FragmentAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);

        //tb.setupWithViewPager(vp); // نربطهم مع بعض vp و tb
        tb.getTabAt(0).setIcon(R.drawable.ic_baseline_flare_24);
        tb.getTabAt(1).setIcon(R.drawable.ic_baseline_home_24);
        tb.getTabAt(2).setIcon(R.drawable.ic_baseline_record_voice_over_24);

    }
}
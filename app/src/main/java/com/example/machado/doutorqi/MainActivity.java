package com.example.machado.doutorqi;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;



import android.support.v4.app.Fragment;
import android.os.Bundle;


public class MainActivity extends FragmentActivity {

    FragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        vpPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), MainActivity.this));

        // Give the TabLayout the ViewPager
        TabLayout tabLayout= (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(vpPager);
    }

}

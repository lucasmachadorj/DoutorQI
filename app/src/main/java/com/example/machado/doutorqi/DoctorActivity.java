package com.example.machado.doutorqi;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;


import android.os.Bundle;
import android.view.View;


public class DoctorActivity extends FragmentActivity {

    FragmentPagerAdapter adapterViewPager;

    public void updateDoctor(View v){
        Intent intent = new Intent(this, UpdateDoctorActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        vpPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), DoctorActivity.this));

        // Give the TabLayout the ViewPager
        TabLayout tabLayout= (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(vpPager);
    }

}

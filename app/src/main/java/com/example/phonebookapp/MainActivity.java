package com.example.phonebookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.myTablayout);
        viewpager = findViewById(R.id.myViewPager);
        
        setupViewPager(viewpager);

        tabLayout.setupWithViewPager(viewpager);
    }

    private void setupViewPager(ViewPager viewpager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new Contacts(), "Contacts");
        viewPagerAdapter.addFragment(new Info(), "Info");

        viewpager.setAdapter(viewPagerAdapter);
    }
}

package com.e.loginregister;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import Adapter.ViewPagerAdapter;
import Fragments.LoginActivity;
import Fragments.RegisterActivity;

public class ViewPagerActivity extends AppCompatActivity  {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_view_pager);

                viewPager=findViewById(R.id.viewpager);
                tabLayout=findViewById(R.id.tabId);

                ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

                viewPagerAdapter.addFragment(new LoginActivity(),"Login");
                viewPagerAdapter.addFragment(new RegisterActivity(),"Register");

                viewPager.setAdapter(viewPagerAdapter);
                tabLayout.setupWithViewPager(viewPager);

        }
    }


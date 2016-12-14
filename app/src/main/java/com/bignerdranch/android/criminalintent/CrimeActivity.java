package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFrament() {
        return new CrimeFragment();
    }

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        *//**
         * 我们使用了支持库的 FragmentManager,
         *
         * 使用 FragmentManager 来把 frame 的视图托管给 Activity
         * *//*
        FragmentManager fm = getSupportFragmentManager();

        *//**
         * 获取 FragmentManager 后，就可以获取一个 Fragment （本例中也就是 Activity 中放置 fragment 视图的容器中的 Fragment 实例）来让 FragmentManager 来管理
         *
         * FragmentManager.findFragmentById(layoutId) 能自动放回 layoutId 容器中的 Fragment 实例， 一个 Fragment 只能保存一个 Fragment 实例。
         * *//*

        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = new CrimeFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }*/
}

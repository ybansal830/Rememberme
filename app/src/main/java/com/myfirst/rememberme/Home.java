package com.myfirst.rememberme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private TextView mTvOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mTvOne = findViewById(R.id.tvOne);
        if(PreferenceHelper.getStringFromSharedPreference(Home.this,"key1") != null){
            mTvOne.setText(PreferenceHelper.getStringFromSharedPreference(Home.this,"key1"));
        }
        else
            mTvOne.setText(getIntent().getStringExtra("key"));
    }
}
package com.myfirst.rememberme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEtOne;
    private CheckBox mCbOne;
    private Button mBtOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(PreferenceHelper.getStringFromSharedPreference(MainActivity.this,"key1") != null){
            Intent intent = new Intent(MainActivity.this,Home.class);
            startActivity(intent);
        }
        findId();
        mBtOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mCbOne.isChecked()){
                    PreferenceHelper.putStringToSharedPreference(MainActivity.this,"key1",mEtOne.getText().toString());
                }
                Intent intent = new Intent(MainActivity.this,Home.class);
                intent.putExtra("key",mEtOne.getText().toString());
                startActivity(intent);
            }
        });
    }

    private void findId() {
        mEtOne = findViewById(R.id.etOne);
        mCbOne = findViewById(R.id.cbOne);
        mBtOne = findViewById(R.id.btOne);
    }
}
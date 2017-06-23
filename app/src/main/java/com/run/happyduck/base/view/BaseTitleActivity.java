package com.run.happyduck.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.run.happyduck.R;

public class BaseTitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_title);
    }
}

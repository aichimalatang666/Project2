package com.example.project2;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ConstraintLayoutActivity_2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint2);
    }
    public void goBack(View view) {
        finish(); // 返回到主界面
    }
}
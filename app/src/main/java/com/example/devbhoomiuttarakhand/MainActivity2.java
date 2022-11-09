package com.example.devbhoomiuttarakhand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
        public void openFloral(View v){
            Intent intent= new Intent(this, FloralActivity.class);
            startActivity(intent);
    }
    public void openFaunal(View v) {
        Intent intent = new Intent(this, FaunalActivity.class);
        startActivity(intent);
    }
    public void openFun(View v) {
        Intent intent = new Intent(this, Functionals.class);
        startActivity(intent);
    }
    public void openCul(View v) {
        Intent intent = new Intent(this, CultureActivity.class);
        startActivity(intent);
    }
}
package com.example.devbhoomiuttarakhand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openCategories(View v){
        Intent intent= new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openThreats(View v){
        Intent intent= new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
    public void openCons(View v){
        Intent intent= new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}
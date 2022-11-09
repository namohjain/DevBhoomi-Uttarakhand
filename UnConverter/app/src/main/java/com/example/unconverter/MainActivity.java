package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button convert;
    private EditText input;
    private TextView r1;
    private TextView r2;
    private TextView r3;
    private TextView r4;
    private TextView r5;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convert = findViewById(R.id.button);
        input = findViewById(R.id.editText_input);
        r1 = findViewById(R.id.textViewgram);
        r2 = findViewById(R.id.textViewmg);
        r3 = findViewById(R.id.textViewmcg);
        r4 = findViewById(R.id.textViewtonne);
        r5 = findViewById(R.id.textViewpound);

        convert.setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View view){
              Toast.makeText(MainActivity.this, "Your result is ready", Toast.LENGTH_SHORT).show();
              String s = input.getText().toString();
              int kg = Integer.parseInt(s);
              double gram = 1000 * kg;
              r1.setText("The corresponding value in Grams is "+gram);
              double mg = 1000000 * kg;
              r2.setText("The corresponding value in Milligrams is "+mg);
              double mcg = 1000000000 * kg;
              r3.setText("The corresponding value in Micrograms is "+mcg);
              double tonne = 0.001 * kg;
              r4.setText("The corresponding value in Tonne is "+tonne);
              double pound = 2.205 * kg;
              r5.setText("The corresponding value in pounds is "+pound);
          };
        }
        );
    }
}
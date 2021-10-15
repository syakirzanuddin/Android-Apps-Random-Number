package com.example.ourfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener()

        {
           public void onClick(View view) {
               EditText f = (EditText) findViewById(R.id.fetch); //declare editView
               TextView re = (TextView) findViewById(R.id.put); //declare textView
               TextView res = (TextView) findViewById(R.id.putt); //declare textView
               int range = Integer.parseInt(f.getText().toString()); //get integer number from textview

               Random r = new Random();
               int rand_no = r.nextInt(range - 0) + 0; //generate random number based on input from textView

               res.setText("random number in range " + range + "");
               re.setText(rand_no + " "); //display in textView

           }
        });

        Button btn1 = (Button) findViewById(R.id.btntotal);
        btn1.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View view) { //onClick() reserve method in android studio
                    EditText fn1 = (EditText) findViewById(R.id.fn); //declare for editText
                    EditText sn2 = (EditText) findViewById(R.id.sn); //declare for edtiText
                    TextView result = (TextView) findViewById(R.id.sum); //declare textView

                    int sumof = Integer.parseInt(fn1.getText().toString()) + Integer.parseInt(sn2.getText().toString()); //sum of two number

                    result.setText("Sum of first and second number is: " + sumof ); //display total number in textView

            }

        });


    }
}
package com.example.task11;

import android.graphics.Color;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    RadioGroup rg;
    LinearLayout lay;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=(RadioGroup)findViewById(R.id.rg);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        lay=(LinearLayout)findViewById(R.id.lay);
        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);
    }

    public void check(View view) {
        if (rb1.isChecked()) {
            lay.setBackgroundColor(getResources().getColor(R.color.Green));
        }
        if (rb2.isChecked()){
            lay.setBackgroundColor(getResources().getColor(R.color.Red));
        }
        if (rb3.isChecked()) {
            lay.setBackgroundColor(getResources().getColor(R.color.Blue));
        }
    }

    public void change(View view) {
        lay.setBackgroundColor(Color.WHITE);
        rg.clearCheck();
    }
}

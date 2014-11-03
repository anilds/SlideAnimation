package com.example.slideanimation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends RootActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.tvTitle);
        tv.setText("First Activity");
        Button bt = (Button) findViewById(R.id.buttonNext);
        bt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(i);
                
                Log.i("First Click Animation", "First");

            }
        });
    }

}
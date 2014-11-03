package com.example.slideanimation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends RootActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysecond);
        TextView tv = (TextView) findViewById(R.id.tvTitle);
        tv.setText("Second Activity");
        Button bt = (Button) findViewById(R.id.buttonNext);
        bt.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                Log.i("Second Animation", "Second");
                startActivity(i);
                
                
                

            }
        });

    }

}
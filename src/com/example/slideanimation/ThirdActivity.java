package com.example.slideanimation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends RootActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView tv = (TextView) findViewById(R.id.tvTitle);
        tv.setText("Third Activity");
        Button bt = (Button) findViewById(R.id.buttonNext);
        bt.setText("previous");
        bt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Log.i("Third Animation", "Third");

            }
        });
    }

}
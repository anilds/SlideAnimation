package com.example.slideanimation;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class RootActivity extends Activity {
    int onStartCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onStartCount = 1;
        if (savedInstanceState == null) // 1st time
        {
            this.overridePendingTransition(R.anim.anim_slide_in_left,
                    R.anim.anim_slide_out_left);
            Log.i("Root Animation", "Root");
        } else // already created so reverse animation
        { 
            onStartCount = 2;
        }
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        if (onStartCount > 1) {
            this.overridePendingTransition(R.anim.anim_slide_in_right,
                    R.anim.anim_slide_out_right);
            
            Log.i("On Start Root Animation", "Root");

        } else if (onStartCount == 1) {
            onStartCount++;
        }

    }

}
package com.google.cloud.android.speech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import java.util.Timer;
import java.util.TimerTask;

public class mergeRight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merge_right);

        new Timer().schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        returnActivity();
                    }
                },
                5000
        );
    }

    private void returnActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

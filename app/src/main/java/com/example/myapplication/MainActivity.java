package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread  welcomeThread = new Thread(){
            @Override
            public void run(){
                try {
                    super.run();
                    sleep(5000);
                }
                catch (Exception e){

                }
                finally {
                    Intent i = new Intent(MainActivity.this, login.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        welcomeThread.start();
    }
}
package com.CSC.othello3054.game.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.CSC.othello3054.game.MainMenu;
import com.CSC.othello3054.game.R;

import java.util.Timer;
import java.util.TimerTask;

public class Othello extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_othello);
        final Intent intent = new Intent(this, MainMenu.class);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                startActivity(intent);
            }
        };
        Timer splash = new Timer();
        splash.schedule(task,7000);

    }
}
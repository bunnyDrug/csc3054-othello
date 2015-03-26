package com.example.don.othello;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.don.othello.Game.OthelloSystem;

public class MainActivity extends ActionBarActivity {

    OthelloSystem othelloSystem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);

        // creates the game system that manages the game.
        // TODO: remove hard coded values

        String topPlayer = "";
        String bottomPlayer = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            topPlayer = extras.getString("topPlayer");
            bottomPlayer = extras.getString("bottomPlayer");
        }

        new AlertDialog.Builder(this).setTitle("Game start")
                         .setMessage("The game will begin as soon as the " +
                                 "bottom player makes their move")
                         .setIcon(android.R.drawable.ic_lock_idle_alarm)
                         .show();

        othelloSystem = new OthelloSystem(this, false);
        othelloSystem.startGame(topPlayer, bottomPlayer);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.game_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
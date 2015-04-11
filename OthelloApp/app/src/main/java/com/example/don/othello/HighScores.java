package com.example.don.othello;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.TextView;


import com.example.don.othello.GameDataBase.DBHelper;
import com.example.don.othello.GameDataBase.score;




public class HighScores extends ActionBarActivity {
    //variables
    DBHelper DB;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);


        display.findViewById(R.id.textScores);
        //database controls


        //rawinsert();
       printDatabase();

    }
    public void viewButtonClicked(View view){
        String dbString = DB.databaseToString();
        display.setText(dbString);
        printDatabase ();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_high_scores, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


public void printDatabase (){
    String dbString = DB.databaseToString();
    display.setText(dbString);
}
//    public void rawinsert(){
//        score player1 = new score("jon",30);
//        score player2 = new score("jayjay",40);
//        DB.add(player1);
//        DB.add(player2);
//    }


}

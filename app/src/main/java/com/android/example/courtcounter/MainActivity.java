package com.android.example.courtcounter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Displays the given score for Team A.
     */
    int quantity =0 ;
    public void teamScore1(View view){
        quantity = quantity +3 ;
        displayForTeamA(quantity);

    }
    public void teamScore2(View view){
        quantity = quantity +2 ;
        displayForTeamA(quantity);

    }
    public void teamScore3(View view){
        quantity = quantity +1 ;
        displayForTeamA(quantity);

    }

    int quantity1 =0 ;
    public void teamScore11(View view){
        quantity1 = quantity1 +3 ;
        displayForTeamB(quantity1);

    }
    public void teamScore22(View view){
        quantity1 = quantity1 +2 ;
        displayForTeamB(quantity1);

    }
    public void teamScore33(View view){
        quantity1 = quantity1 +1 ;
        displayForTeamB(quantity1);

    }
    public void reset(View view){
        quantity1 = 0 ;
        quantity = 0;
        displayForTeamB(quantity1);
        displayForTeamA(quantity);

    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}


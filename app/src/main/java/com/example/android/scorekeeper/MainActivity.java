package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    //int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    //touchdown
    public void addTouchdownForTeamA(View view) {
        scoreTeamA += 6;
        displayScoreForTeamA(scoreTeamA);
    }


    //extrapoint
    public void addExtraPointForTeamA(View view) {
        scoreTeamA += 1;
        displayScoreForTeamA(scoreTeamA);
    }

    //conversion
    public void addConversionForTeamA(View view) {
        scoreTeamA += 2;
        displayScoreForTeamA(scoreTeamA);
    }

    //fieldgoal
    public void addFieldGoalForTeamA(View view) {
        scoreTeamA += 3;
        displayScoreForTeamA(scoreTeamA);
    }

    //safety
    public void addSafetyForTeamA(View view) {
        scoreTeamA += 2;
        displayScoreForTeamA(scoreTeamA);
    }

    //reset
    public void resetBothTeamScores(View view){
        scoreTeamA = 0;
        //scoreTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        //displayForTeamB(scoreTeamB);
    }
}

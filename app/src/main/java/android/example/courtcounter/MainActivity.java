package android.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**Tracks the scores for Team A*/
    int teamAScore = 0;

    /**Tracks the scores for Team B*/
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase the score for team A by 3 points
     * */
    public void addThreePoints(View view){
        displayForTeamA(teamAScore += 3);
    }

    /**
     * Increase the score for team A by 2 points
     * */
    public void addTwoPoints(View view){
        displayForTeamA(teamAScore += 2);
    }

    /**
     * Increase the score for team A by 1 points
     * */
    public void addFreeThrowPoints(View view){
        displayForTeamA(teamAScore += 1);
    }


    /**
     * Increase the score for team B by 3 points
     * */
    public void addThreePointsB(View view){
        displayForTeamB(teamBScore += 3);
    }
    /**
     * Increase the score for team B by 2 points
     * */
    public void addTwoPointsB(View view){
        displayForTeamB(teamBScore += 2);
    }
    /**
     * Increase the score for team B by 1 points
     * */
    public void addFreeThrowPointsB(View view){
        displayForTeamB(teamBScore += 1);
    }

    public void resetScores(View view){
        displayForTeamA(teamAScore = 0);
        displayForTeamB(teamBScore = 0);
    }
}
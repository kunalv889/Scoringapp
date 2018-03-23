package com.example.kunalverma.scoringapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Scorecalculator extends AppCompatActivity {



    Button sevenrun,fiverun,sixrun,fourrun,onerun,wicket,threerun,tworun,zerorun,misc,undoball,legbys,bys,noball,wide;
    TextView team_name,total_runs,total_wickets,total_overs,bowler_name_bowling,batsman1_runs,batsman1_balls,batsman2_runs,batsman2_balls,batsman1_SR,batsman2_SR,bowler_runs_given,bowler_wickets_taken,bowlers_overs_bowled,match_status,extras_given,Current_runrate,Required_runrate;
    RadioGroup batsman1_name,batsman2_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorecalculator);


        sevenrun=(Button)findViewById(R.id.button4);
        fiverun=(Button)findViewById(R.id.button5);
        sixrun=(Button)findViewById(R.id.button6);
        fourrun=(Button)findViewById(R.id.button7);
        onerun=(Button)findViewById(R.id.button8);
        wicket=(Button)findViewById(R.id.button9);
        threerun=(Button)findViewById(R.id.button10);
        tworun=(Button)findViewById(R.id.button11);
        zerorun=(Button)findViewById(R.id.button12);
        misc=(Button)findViewById(R.id.button13);
        undoball=(Button)findViewById(R.id.button14);
        legbys=(Button)findViewById(R.id.button15);
        bys=(Button)findViewById(R.id.button16);
        noball=(Button)findViewById(R.id.button17);
        wide=(Button)findViewById(R.id.button18);

        team_name=(TextView)findViewById(R.id.textView);
        total_runs=(TextView)findViewById(R.id.textView2);
        total_wickets=(TextView)findViewById(R.id.textView4);
        total_overs=(TextView)findViewById(R.id.textView6);
        bowler_name_bowling=(TextView)findViewById(R.id.textView10);
        batsman1_runs=(TextView)findViewById(R.id.textView11);
        batsman1_balls=(TextView)findViewById(R.id.textView12);
        batsman2_runs=(TextView)findViewById(R.id.textView13);
        batsman2_balls=(TextView)findViewById(R.id.textView14);
        batsman1_SR=(TextView)findViewById(R.id.textView16);
        batsman2_SR=(TextView)findViewById(R.id.textView17);
        bowler_runs_given=(TextView)findViewById(R.id.textView19);
        bowler_wickets_taken=(TextView)findViewById(R.id.textView21);
        bowlers_overs_bowled=(TextView)findViewById(R.id.textView23);
        match_status=(TextView)findViewById(R.id.textView27);
        extras_given=(TextView)findViewById(R.id.textView31);
        Current_runrate=(TextView)findViewById(R.id.textView32);
        Required_runrate=(TextView)findViewById(R.id.textView33);

//        batsman1_name=(RadioGroup)findViewById(R.id.r1);
 //       batsman2_name=(RadioGroup)findViewById(R.id.r2);





    }
}

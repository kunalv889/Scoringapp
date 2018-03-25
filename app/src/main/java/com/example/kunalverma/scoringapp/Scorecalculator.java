package com.example.kunalverma.scoringapp;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Scorecalculator extends AppCompatActivity {



    Button sevenrun,fiverun,sixrun,fourrun,onerun,wicket,threerun,tworun,zerorun,misc,undoball,legbys,bys,noball,wide;
    TextView team_name,total_runs,total_wickets,total_overs,balls_bowled,bowler_name_bowling,batsman1_runs,batsman1_balls,batsman2_runs,batsman2_balls,batsman1_SR,batsman2_SR,bowler_runs_given,bowler_wickets_taken,bowlers_overs_bowled,match_status,extras_given,Current_runrate,Required_runrate;
    RadioGroup batsman_name;
    RadioButton batsman1_name,batsman2_name;
    int Runs=0,Wickets,batsman1_scored=0,batsman2_scored=0,batsman1_ballsfaced=0,batsman2_ballsfaced=0;
    int overs=0,balls=0,Extras=0;


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
        balls_bowled=(TextView)findViewById(R.id.textView35);

        batsman_name=(RadioGroup)findViewById(R.id.rd);
        batsman1_name=(RadioButton)findViewById(R.id.r1);
        batsman2_name=(RadioButton)findViewById(R.id.r2);


     //   batsman1_name.setText("kunal");
     //   batsman2_name.setText("arman");

    //    ((RadioButton)batsman_name.getChildAt(0)).setText(""+"kunal");
    //    ((RadioButton)batsman_name.getChildAt(1)).setText(""+"Arman");


        one_run();
        four_run();
        six_run();
        five_run();
        seven_run();
        three_run();
        two_run();
        zero_run();
        wicket_fallen();
        undo_function();
        LB_function();
        B_function();
        NB_function();
        wide_function();
        misc_function();

        run_rate_calculator();



    }


    public void one_run(){
        onerun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Runs++;
                total_runs.setText("" + Runs);
                batsman_select(1);
                strike_changer();
                over_count();
                run_rate_calculator();

            }
        });

    }
    public void four_run(){
        fourrun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Runs=Runs+4;
                total_runs.setText("" + Runs);
                batsman_select(4);
                over_count();
                run_rate_calculator();

            }
        });

    }
    public void six_run(){
        sixrun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Runs = Runs + 6;
                total_runs.setText("" + Runs);
                batsman_select(6);
                over_count();
                run_rate_calculator();

            }
        });

    }
    public void five_run(){
        fiverun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Runs=Runs+5;
                total_runs.setText("" + Runs);
                batsman_select(5);
                strike_changer();
                over_count();
                run_rate_calculator();

            }
        });

    }
    public void seven_run(){
        sevenrun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Runs=Runs+7;
                total_runs.setText("" + Runs);
                batsman_select(7);
                strike_changer();
                over_count();
                run_rate_calculator();


            }
        });

    }
    public void three_run(){
        threerun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Runs=Runs+3;
                total_runs.setText("" + Runs);
                batsman_select(3);
                strike_changer();
                over_count();
                run_rate_calculator();

            }
        });

    }
    public void two_run(){
        tworun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Runs=Runs+2;
                total_runs.setText("" + Runs);
                batsman_select(2);
                over_count();
                run_rate_calculator();

            }
        });

    }
    public void zero_run(){
        zerorun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Runs = Runs + 0;
                total_runs.setText("" + Runs);
                batsman_select(0);
                over_count();
                run_rate_calculator();

            }
        });

    }
    public void wide_ball(int n){

        Runs=Runs+n;
        Extras=Extras+n;
        if(n==2||n==4||n==6||n==8){
            strike_changer();
            Toast.makeText(Scorecalculator.this, "check for batsman in strike", Toast.LENGTH_SHORT).show();
        }
        total_runs.setText(""+Runs);
        extras_given.setText("" + Extras);
    }


    public void no_ball(int n){
        Runs=Runs+n;
        Extras=Extras+n;
        if(n==2||n==4||n==6||n==8){
            strike_changer();
            Toast.makeText(Scorecalculator.this, "check for batsman in strike", Toast.LENGTH_SHORT).show();
        }
        total_runs.setText("" + Runs);
        extras_given.setText(""+Extras);
    }


    public void By_function(int n){

        Runs=Runs+n;
        Extras=Extras+n;
        over_count();
        zero_run();

        batsman_select_for_bys(n);
        if(n==1||n==3||n==5||n==7)
            run_rate_calculator();
            strike_changer();
        extras_given.setText(""+Extras);
        total_runs.setText(""+Runs);
    }


    public void over_count() {

        balls=balls+1;
        if(balls==6){
            balls=0;
            overs=overs+1;
           strike_changer();
        }


        total_overs.setText(""+overs);
        balls_bowled.setText("" + balls);

    }


    public void wicket_fallen(){
        wicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupmenu = new PopupMenu(Scorecalculator.this, wicket);
                popupmenu.getMenuInflater().inflate(R.menu.menu_wickets, popupmenu.getMenu());
                popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(Scorecalculator.this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popupmenu.show();
            }
        });
    }


    public void undo_function(){
        undoball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupmenu = new PopupMenu(Scorecalculator.this, undoball);
                popupmenu.getMenuInflater().inflate(R.menu.menu_undo, popupmenu.getMenu());
                popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(Scorecalculator.this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popupmenu.show();

            }
        });
    }


    public void LB_function(){
        legbys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupmenu = new PopupMenu(Scorecalculator.this, legbys);
                popupmenu.getMenuInflater().inflate(R.menu.menu_lb, popupmenu.getMenu());
                popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.item1) {
                            By_function(1);
                            return true;
                        } else if (item.getItemId() == R.id.item2) {

                            By_function(2);
                            return true;
                        } else if (item.getItemId() == R.id.item3) {

                            By_function(3);
                            return true;
                        } else if (item.getItemId() == R.id.item4) {

                            By_function(4);
                            return true;
                        } else if (item.getItemId() == R.id.item5) {

                            By_function(5);
                            return true;
                        } else if (item.getItemId() == R.id.item6) {

                            By_function(6);
                            return true;
                        } else if (item.getItemId() == R.id.item7) {

                            By_function(7);
                            return true;
                        } else if (item.getItemId() == R.id.item8) {

                            return true;
                        }
                        return  true;
                    }
                });
                popupmenu.show();

            }
        });
    }
    public void B_function(){
        bys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupmenu = new PopupMenu(Scorecalculator.this, bys);
                popupmenu.getMenuInflater().inflate(R.menu.menu_b, popupmenu.getMenu());
                popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        if (item.getItemId() == R.id.item1) {
                            By_function(1);
                            return true;
                        } else if (item.getItemId() == R.id.item2) {

                            By_function(2);
                            return true;
                        } else if (item.getItemId() == R.id.item3) {

                            By_function(3);
                            return true;
                        } else if (item.getItemId() == R.id.item4) {

                            By_function(4);
                            return true;
                        } else if (item.getItemId() == R.id.item5) {

                            By_function(5);
                            return true;
                        } else if (item.getItemId() == R.id.item6) {

                            By_function(6);
                            return true;
                        } else if (item.getItemId() == R.id.item7) {

                            By_function(7);
                            return true;
                        } else if (item.getItemId() == R.id.item8) {

                            return true;
                        }
                        return  true;
                    }
                });
                popupmenu.show();
            }
        });
    }

    public void NB_function(){
        noball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupmenu = new PopupMenu(Scorecalculator.this, noball);
                popupmenu.getMenuInflater().inflate(R.menu.menu_nb, popupmenu.getMenu());
                popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        if (item.getItemId() == R.id.item1) {

                            no_ball(1);
                            return true;
                        }
                        else if (item.getItemId() == R.id.item2) {

                            no_ball(2);
                            return true;
                        }
                        else if (item.getItemId() == R.id.item3) {

                            no_ball(3);
                            return true;
                        }
                        else if (item.getItemId() == R.id.item4) {

                            no_ball(4);
                            return true;
                        }
                        else if (item.getItemId() == R.id.item5) {

                            no_ball(5);
                            return true;
                        }
                        else if (item.getItemId() == R.id.item6) {

                            no_ball(6);
                            return true;
                        }
                        else if (item.getItemId() == R.id.item7) {

                            no_ball(7);
                            return true;
                        }
                        else if (item.getItemId() == R.id.item8) {
                            no_ball(8);
                            return true;
                        }
                      /*  else if (item.getItemId() == R.id.item9) {
                            //   Toast.makeText(Scorecalculator.this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                            wide_ball(0);
                            return true;
                        }  */
                        return true;
                    }
                });
                popupmenu.show();
            }
        });
    }

    public void wide_function(){
        wide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupmenu = new PopupMenu(Scorecalculator.this, wide);
                popupmenu.getMenuInflater().inflate(R.menu.menu_wide, popupmenu.getMenu());
                popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        if (item.getItemId() == R.id.item1) {

                            wide_ball(1);
                            return true;
                        }
                        else if (item.getItemId() == R.id.item2) {

                            wide_ball(2);
                            return true;
                        }
                        else if (item.getItemId() == R.id.item3) {

                            wide_ball(3);
                            return true;
                        }
                        else if (item.getItemId() == R.id.item4) {

                            wide_ball(4);
                            return true;
                        }
                        else if (item.getItemId() == R.id.item5) {

                            wide_ball(5);
                            return true;
                        }
                        else if (item.getItemId() == R.id.item6) {

                            wide_ball(6);
                            return true;
                        }
                        else if (item.getItemId() == R.id.item7) {

                            wide_ball(7);
                            return true;
                        }
                        else if (item.getItemId() == R.id.item8) {
                            wide_ball(8);
                            return true;
                        }
                      /*  else if (item.getItemId() == R.id.item9) {
                            //   Toast.makeText(Scorecalculator.this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                            wide_ball(0);
                            return true;
                        }  */
                        return true;
                    }
                });
                popupmenu.show();
            }
        });
    }

    public void misc_function(){
        misc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupmenu = new PopupMenu(Scorecalculator.this, misc);
                popupmenu.getMenuInflater().inflate(R.menu.menu_misc, popupmenu.getMenu());
                popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(Scorecalculator.this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popupmenu.show();
            }
        });
    }

    public void batsman_select(int n){
        if(batsman1_name.isChecked()){
            batsman1_scored=batsman1_scored+n;
            batsman1_runs.setText(""+batsman1_scored);
            batsman1_ballsfaced++;
            batsman1_balls.setText(""+batsman1_ballsfaced);
            Double sr=Strike_rate_calculator(batsman1_scored,batsman1_ballsfaced);
            batsman1_SR.setText(""+sr);
        }
        else if(batsman2_name.isChecked()){
            batsman2_scored=batsman2_scored+n;
            batsman2_runs.setText(""+batsman2_scored);
            batsman2_ballsfaced++;
            batsman2_balls.setText(""+batsman2_ballsfaced);
            Double sr=Strike_rate_calculator(batsman2_scored,batsman2_ballsfaced);
            batsman2_SR.setText(""+sr);
        }
    }
    public void batsman_select_for_bys(int n) {
        if (batsman1_name.isChecked()) {
            //batsman1_scored=batsman1_scored+n;
            batsman1_runs.setText("" + batsman1_scored);
            batsman1_ballsfaced++;
            batsman1_balls.setText("" + batsman1_ballsfaced);
            Double sr = Strike_rate_calculator(batsman1_scored, batsman1_ballsfaced);
            batsman1_SR.setText("" + sr);
        } else if (batsman2_name.isChecked()) {
            //batsman2_scored=batsman2_scored+n;
            batsman2_runs.setText("" + batsman2_scored);
            batsman2_ballsfaced++;
            batsman2_balls.setText("" + batsman2_ballsfaced);
            Double sr = Strike_rate_calculator(batsman2_scored, batsman2_ballsfaced);
            batsman2_SR.setText("" + sr);
        }
    }


    public Double Strike_rate_calculator(int r,int b){

        double sr=(double)(r*100)/b;
        double new_sr=Math.round(sr*100.0)/100.0;
        return new_sr;
    }

    public void strike_changer(){
        if(batsman1_name.isChecked()){
            batsman1_name.setChecked(false);
            batsman2_name.setChecked(true);
        }
        else if(batsman2_name.isChecked()){
            batsman2_name.setChecked(false);
            batsman1_name.setChecked(true);
        }
    }
    public void run_rate_calculator(){

        float total_balls=(float)overs*6+balls;
        float rr=(Runs/total_balls)*6;
        double new_rr=Math.round(rr*100.0)/100.0;
        Current_runrate.setText(""+new_rr);
        System.out.println(""+new_rr+" "+overs+" "+balls+" "+Runs);
    }


}


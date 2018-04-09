package com.example.kunalverma.scoringapp;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Scorecalculator extends AppCompatActivity {



    Button sevenrun,fiverun,sixrun,fourrun,onerun,wicket,threerun,tworun,zerorun,misc,undoball,legbys,bys,noball,wide;
    TextView team_name,total_runs,total_wickets,total_overs,balls_bowled,bowler_name_bowling,batsman1_runs,batsman1_balls,batsman2_runs,batsman2_balls,batsman1_SR,batsman2_SR,bowler_runs_given,bowler_wickets_taken,bowlers_overs_bowled,match_status,extras_given,Current_runrate,Required_runrate,max_overs,bowlers_balls_bowled,curent_over;
    EditText next_bowler;
    RadioGroup batsman_name;
    RadioButton batsman1_name,batsman2_name;
    int Team_A_overs=0,Team_B_overs=0,balls=0,Extras_A=0,Extras_B=0,max_overs_count=4;
    int A_wickets=0,B_wickets=0;
    String Team_A_batsman[]=new String[16];
    String Team_B_batsman[]=new String[16];
    String Team_A_bowler[]=new String[16];
    String Team_B_bowler[]=new String[16];
    int Team_A_runs=0,Team_B_runs=0;
    int Team_A_balls=0,Team_B_balls=0;
    int Team_A_player_runs[]=new int[16];
    int Team_B_player_runs[]=new int[16];
    int Team_A_player_wickets[]=new int[16];
    int Team_B_player_wickets[]=new int[16];
    int Team_A_ballsfaced[]=new int[16];
    int Team_B_ballsfaced[]=new int[16];
    int Team_A_ballsbowled[]=new int[16];
    int Team_B_ballsbowled[]=new int[16];
    int Team_A_player_runs_given[]=new int[16];
    int Team_B_player_runs_given[]=new int[16];
    int Team_A_players_balls_bowled[]=new int[16];
    int Team_A_players_overs[]=new int[16];
    int Team_B_players_overs[]=new int[16];
    int Team_B_players_balls_bowled[]=new int[16];
    int Team_A_batsman_fours[]=new int[16];
    int Team_B_batsman_fours[]=new int[16];
    int Team_A_batsman_sixes[]=new int[16];
    int Team_B_batsman_sixes[]=new int[16];
    int Team_A_extras[]=new int[4];
    int Team_B_extras[]=new int[4];
    Double Team_A_strike_rate[]=new Double [16];
    Double Team_B_strike_rate[]=new Double [16];
    int Team_A_extras_given[]=new int[16];
    int Team_B_extras_given[]=new int[16];
    String thisover="";



    int m=1,n=0,p=0,half,b=0;
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
        bowlers_balls_bowled=(TextView)findViewById(R.id.textView39);
        match_status=(TextView)findViewById(R.id.textView27);
        extras_given=(TextView)findViewById(R.id.textView31);
        Current_runrate=(TextView)findViewById(R.id.textView32);
        Required_runrate=(TextView)findViewById(R.id.textView33);
        balls_bowled=(TextView)findViewById(R.id.textView35);
        max_overs=(TextView)findViewById(R.id.textView37);
        curent_over=(TextView)findViewById(R.id.textView40);



        batsman_name=(RadioGroup)findViewById(R.id.rd);
        batsman1_name=(RadioButton)findViewById(R.id.r1);
        batsman2_name=(RadioButton)findViewById(R.id.r2);

      /*   half=max_overs_count*3;
        if(Team_A_balls<=half) {
            n=1;
        }
        if(n==1){
            m=0;
            p=1;
            balls=0;
        }  */

        for(int i=0;i<16;i++){
            int j=i+1;
            Team_A_batsman[i]="Batsman_A"+j;
            Team_B_batsman[i]="Batsman_B"+j;
            Team_A_bowler[i]="Bowler_A"+j;
            Team_B_bowler[i]="Bowler_B"+j;
            Team_A_player_runs[i]=0;
            Team_B_player_runs[i]=0;
            Team_A_ballsfaced[i]=0;
            Team_B_ballsfaced[i]=0;
            Team_A_batsman_fours[i]=0;
            Team_A_batsman_sixes[i]=0;
            Team_B_batsman_sixes[i]=0;
            Team_B_batsman_fours[i]=0;
            Team_A_player_wickets[i]=0;
            Team_B_player_wickets[i]=0;
            Team_A_player_runs_given[i]=0;
            Team_B_player_runs_given[i]=0;
            Team_B_players_balls_bowled[i]=0;
            Team_A_players_balls_bowled[i]=0;
            Team_A_players_overs[i]=0;
            Team_B_players_overs[i]=0;
            Team_A_ballsbowled[i]=0;
            Team_B_ballsbowled[i]=0;
            Team_A_extras_given[i]=0;
            Team_B_extras_given[i]=0;
            Team_A_strike_rate[i]=0.0;
            Team_B_strike_rate[i]=0.0;

        }
        for(int i=0;i<4;i++){
            Team_A_extras[i]=0;
            Team_B_extras[i]=0;
        }
        if(n==0) {
            batsman1_name.setText("" + Team_A_batsman[p]);
            batsman2_name.setText("" + Team_A_batsman[m]);
        }
        else if(n==1){
            batsman1_name.setText("" + Team_B_batsman[p]);
            batsman2_name.setText("" + Team_B_batsman[m]);
        }



        int innings=max_overs_count/2;
        max_overs.setText("" + innings);




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

   /* public void innnigs_changer(){
        if(Team_A_balls<=half) {
            n=0;}
            else
            n=1;

        if(n==1){
            m=0;
            p=1;
            balls=0;
        }

    }  */

    public void currentover(String q){

        thisover=thisover.concat(" "+q);
        if(balls==0){
            thisover="";

        }
        curent_over.setText(thisover);
    }

    public void one_run(){
    //    innnigs_changer();
        onerun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n == 0) {
                    Team_A_runs++;
                    total_runs.setText("" + Team_A_runs);

                } else if (n == 1) {
                    Team_B_runs++;
                    total_runs.setText("" + Team_B_runs);
                }

                batsman_select(1);
                strike_changer();
                balls_bowled_bowler(1);
                over_count();
                String temp = Integer.toString(1);
                currentover(temp);
                run_rate_calculator();
            }
        });

    }
    public void four_run(){
     //   innnigs_changer();
        fourrun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n==0) {
                    Team_A_runs=Team_A_runs+4;
                    total_runs.setText("" + Team_A_runs);

                }
                else if(n==1){
                    Team_B_runs=Team_B_runs+4;
                    total_runs.setText("" + Team_B_runs);
                }
                batsman_select(4);
                Boundry_record_maintainer(4);
                balls_bowled_bowler(4);
                over_count();
                String temp=Integer.toString(4);
                currentover(temp);
                run_rate_calculator();
            }
        });

    }
    public void six_run(){
      //  innnigs_changer();
        sixrun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n==0) {
                    Team_A_runs=Team_A_runs+6;
                    total_runs.setText("" + Team_A_runs);

                }
                else if(n==1){
                    Team_B_runs=Team_B_runs+6;
                    total_runs.setText("" + Team_B_runs);
                }
                batsman_select(6);
                Boundry_record_maintainer(6);
                balls_bowled_bowler(6);
                over_count();
                String temp=Integer.toString(6);
                currentover(temp);
                run_rate_calculator();
            }
        });

    }
    public void five_run(){
   //     innnigs_changer();
        fiverun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n==0) {
                    Team_A_runs=Team_A_runs+5;
                    total_runs.setText("" + Team_A_runs);

                }
                else if(n==1){
                    Team_B_runs=Team_B_runs+5;
                    total_runs.setText("" + Team_B_runs);
                }
                batsman_select(5);
                strike_changer();
                balls_bowled_bowler(5);
                over_count();
                String temp=Integer.toString(5);
                currentover(temp);
                run_rate_calculator();
            }
        });

    }
    public void seven_run(){
    //    innnigs_changer();
        sevenrun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n==0) {
                    Team_A_runs=Team_A_runs+7;
                    total_runs.setText("" + Team_A_runs);

                }
                else if(n==1){
                    Team_B_runs=Team_B_runs+7;
                    total_runs.setText("" + Team_B_runs);
                }
                batsman_select(7);
                strike_changer();
                balls_bowled_bowler(7);
                over_count();
                String temp=Integer.toString(7);
                currentover(temp);
                run_rate_calculator();
            }
        });

    }
    public void three_run(){
   //     innnigs_changer();
        threerun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n==0) {
                    Team_A_runs=Team_A_runs+3;
                    total_runs.setText("" + Team_A_runs);

                }
                else if(n==1){
                    Team_B_runs=Team_B_runs+3;
                    total_runs.setText("" + Team_B_runs);
                }
                batsman_select(3);
                strike_changer();
                balls_bowled_bowler(3);
                over_count();
                String temp=Integer.toString(3);
                currentover(temp);
                run_rate_calculator();
            }
        });

    }
    public void two_run(){
      //  innnigs_changer();
        tworun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n==0) {
                    Team_A_runs=Team_A_runs+2;
                    total_runs.setText("" + Team_A_runs);

                }
                else if(n==1){
                    Team_B_runs=Team_B_runs+2;
                    total_runs.setText("" + Team_B_runs);
                }
                batsman_select(2);
                balls_bowled_bowler(2);
                over_count();
                String temp=Integer.toString(2);
                currentover(temp);
                run_rate_calculator();


            }
        });

    }
    public void zero_run(){
    //    innnigs_changer();
        zerorun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n==0) {

                    Team_A_runs=Team_A_runs+0;
                    total_runs.setText("" + Team_A_runs);

                }
                else if(n==1){
                    Team_B_runs=Team_B_runs+0;
                    total_runs.setText("" + Team_B_runs);
                }
                batsman_select(0);
                balls_bowled_bowler(0);
                over_count();
                String temp=Integer.toString(0);
                currentover(temp);
                run_rate_calculator();


            }
        });

    }



    public void wide_ball(int q){
  //      innnigs_changer();
        if(n==0) {
            Team_B_player_runs_given[b]=Team_B_player_runs_given[b]+q;
            bowler_runs_given.setText(""+Team_B_player_runs_given[b]);
            Team_A_runs=Team_A_runs+q;
            total_runs.setText("" + Team_A_runs);
            Extras_A=Extras_A+q;
            extras_given.setText("" + Extras_A);
            Team_A_extras[0]=Team_A_extras[0]+1;
        }
        else if(n==1){
            Team_A_player_runs_given[b]=Team_A_player_runs_given[b]+q;
            bowler_runs_given.setText(""+Team_A_player_runs_given[b]);
            Team_B_runs=Team_B_runs+q;
            total_runs.setText("" + Team_B_runs);
            Extras_B=Extras_B+q;
            extras_given.setText("" + Extras_B);
            Team_B_extras[0]=Team_B_extras[0]+1;
        }

        if(q==2||q==4||q==6||q==8){
            strike_changer();
            Toast.makeText(Scorecalculator.this, "check for batsman in strike", Toast.LENGTH_SHORT).show();
        }
        String temp=Integer.toString(q-1);
        String temp1=" ".concat(temp).concat("wd");
        thisover=thisover.concat(temp1);
        curent_over.setText(" " + thisover);

    }


    public void no_ball(int q){
     //   innnigs_changer();
        if(n==0) {
            Team_B_player_runs_given[b]=Team_B_player_runs_given[b]+q;
            bowler_runs_given.setText(""+Team_B_player_runs_given[b]);
            Team_A_runs=Team_A_runs+q;
            total_runs.setText("" + Team_A_runs);
            Extras_A=Extras_A+q;
            extras_given.setText("" + Extras_A);
            Team_A_extras[1]=Team_A_extras[1]+1;
        }
        else if(n==1){
            Team_A_player_runs_given[b]=Team_A_player_runs_given[b]+q;
            bowler_runs_given.setText(""+Team_A_player_runs_given[b]);
            Team_B_runs=Team_B_runs+q;
            total_runs.setText("" + Team_B_runs);
            Extras_B=Extras_B+q;
            extras_given.setText("" + Extras_B);
            Team_A_extras[1]=Team_A_extras[1]+1;
        }


        if(q==2||q==4||q==6||q==8){
            strike_changer();
            Toast.makeText(Scorecalculator.this, "check for batsman in strike", Toast.LENGTH_SHORT).show();
        }
        String temp=Integer.toString(q-1);
        String temp1=" ".concat(temp).concat("nb");
        thisover=thisover.concat(temp1);
        curent_over.setText(" "+thisover);
    }


    public void By_function(int q){
     //   innnigs_changer();

        if(n==0) {
            Team_B_player_runs_given[b]=Team_B_player_runs_given[b]+q;
            bowler_runs_given.setText(""+Team_B_player_runs_given[b]);
            Team_A_runs=Team_A_runs+q;
            total_runs.setText("" + Team_A_runs);
            Extras_A=Extras_A+q;
            extras_given.setText("" + Extras_A);
            Team_A_extras[2]=Team_A_extras[2]+q;
        }
        else if(n==1){
            Team_A_player_runs_given[b]=Team_A_player_runs[b]+q;
            bowler_runs_given.setText(""+Team_A_player_runs_given[b]);
            Team_B_runs=Team_B_runs+q;
            total_runs.setText("" + Team_B_runs);
            Extras_B=Extras_B+q;
            extras_given.setText("" + Extras_B);
            Team_A_extras[2]=Team_A_extras[2]+q;
        }

        balls_bowled_bowler(0);
        over_count();
        batsman_select_for_bys();
        run_rate_calculator();
        if(q==1||q==3||q==5||q==7)
            strike_changer();
        String temp=Integer.toString(q);
        String temp1=" ".concat(temp).concat("b");
        thisover=thisover.concat(temp1);
        if(balls==0){
            thisover="";
        }
        curent_over.setText(" "+thisover);
    }

    public void Leg_By_function(int q){
        //   innnigs_changer();

        if(n==0) {
            Team_B_player_runs_given[b]=Team_B_player_runs_given[b]+q;
            bowler_runs_given.setText(""+Team_B_player_runs_given[b]);
            Team_A_runs=Team_A_runs+q;
            total_runs.setText("" + Team_A_runs);
            Extras_A=Extras_A+q;
            extras_given.setText("" + Extras_A);
            Team_A_extras[2]=Team_A_extras[2]+q;
        }
        else if(n==1){
            Team_A_player_runs_given[b]=Team_A_player_runs[b]+q;
            bowler_runs_given.setText(""+Team_A_player_runs_given[b]);
            Team_B_runs=Team_B_runs+q;
            total_runs.setText("" + Team_B_runs);
            Extras_B=Extras_B+q;
            extras_given.setText("" + Extras_B);
            Team_A_extras[2]=Team_A_extras[2]+q;
        }

        balls_bowled_bowler(0);
        over_count();
        batsman_select_for_bys();
        run_rate_calculator();
        if(q==1||q==3||q==5||q==7)
            strike_changer();
        String temp=Integer.toString(q);
        String temp1=" ".concat(temp).concat("lb");
        thisover=thisover.concat(temp1);
        if(balls==0){
            thisover="";
        }
        curent_over.setText(" "+thisover);
    }


    public void over_count() {
      //  innnigs_changer();
        if (n == 0) {
            Team_A_balls=Team_A_balls+1;
            balls=balls+1;
            if (balls== 6) {
                balls = 0;
                Team_A_overs = Team_A_overs + 1;
                b++;
                strike_changer();
                new_bowler();
            }


            total_overs.setText("" + Team_A_overs);
            balls_bowled.setText("" + balls);
        }
        else if(n==1){
            {
                Team_B_balls=Team_B_balls+1;
                balls=balls+1;
                if (balls == 6) {
                    balls = 0;
                    Team_B_overs = Team_B_overs + 1;
                    strike_changer();


                }


                total_overs.setText("" + Team_B_overs);
                balls_bowled.setText("" + balls);
            }

        }
        if(Team_A_overs==2){
         //   n=1;
        }
    }


    public void new_bowler(){

        setContentView(R.layout.new_bowler);
        next_bowler=(EditText)findViewById(R.id.editText10);
      /*  int=b;
        for(int i=0;i<b;i++) {
            if (next_bowler.getText().toString()==Team_B_bowler[i]){
                b=i;
                break;
            }

        }
        //b=d+1;

        setContentView(R.layout.activity_scorecalculator); */
        String s=next_bowler.getText().toString();
        Toast.makeText(Scorecalculator.this, ""+s, Toast.LENGTH_SHORT).show();
    }

    public void wicket_fallen(){
      //  innnigs_changer();
        wicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupmenu = new PopupMenu(Scorecalculator.this, wicket);
                popupmenu.getMenuInflater().inflate(R.menu.menu_wickets, popupmenu.getMenu());
                popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getItemId()==R.id.item1){
                            wicket_fall();
                            return true;
                        }
                        return true;
                    }
                });
                popupmenu.show();
            }
        });
    }


    public void undo_function(){
       // innnigs_changer();
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
                            Leg_By_function(1);
                            return true;
                        } else if (item.getItemId() == R.id.item2) {

                            Leg_By_function(2);
                            return true;
                        } else if (item.getItemId() == R.id.item3) {

                            Leg_By_function(3);
                            return true;
                        } else if (item.getItemId() == R.id.item4) {

                            Leg_By_function(4);
                            return true;
                        } else if (item.getItemId() == R.id.item5) {

                            Leg_By_function(5);
                            return true;
                        } else if (item.getItemId() == R.id.item6) {

                            Leg_By_function(6);
                            return true;
                        } else if (item.getItemId() == R.id.item7) {

                            Leg_By_function(7);
                            return true;
                        } else if (item.getItemId() == R.id.item8) {

                            dialog_for_extras_wicket("Leg Bys");
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

                            dialog_for_extras_wicket("Bys");
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
                        else if (item.getItemId() == R.id.item9) {
                            //   Toast.makeText(Scorecalculator.this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                          //  wide_ball(0);
                            dialog_for_extras_wicket("N0");
                            return true;
                        }
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
                        else if (item.getItemId() == R.id.item9) {
                            //   Toast.makeText(Scorecalculator.this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();
                            //wide_ball(0);
                            dialog_for_extras_wicket("wide");
                            return true;
                        }
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

    public void batsman_select(int q){
     //   innnigs_changer();

        if(n==0) {

            if (batsman1_name.isChecked()) {

                Team_A_player_runs[p] = Team_A_player_runs[p] + q;
                batsman1_runs.setText("" + Team_A_player_runs[p]);
                Team_A_ballsfaced[p]++;
                batsman1_balls.setText("" + Team_A_ballsfaced[p]);
                Double sr = Strike_rate_calculator(Team_A_player_runs[p], Team_A_ballsfaced[p]);
                Team_A_strike_rate[p] = sr;
                batsman1_SR.setText("" + sr);
            } else if (batsman2_name.isChecked()) {
                Team_A_player_runs[m] = Team_A_player_runs[m] + q;
                batsman2_runs.setText("" + Team_A_player_runs[m]);
                Team_A_ballsfaced[m]++;
                batsman2_balls.setText("" + Team_A_ballsfaced[m]);
                Double sr = Strike_rate_calculator(Team_A_player_runs[m], Team_A_ballsfaced[m]);
                Team_A_strike_rate[m] = sr;
                batsman2_SR.setText("" + sr);
            }
        }
            else if(n==1) {
               if (batsman1_name.isChecked()) {
                   Team_B_player_runs[p] = Team_B_player_runs[p] + q;
                   batsman1_runs.setText("" + Team_B_player_runs[p]);
                   Team_B_ballsfaced[p]++;
                   batsman1_balls.setText("" + Team_B_ballsfaced[p]);
                   Double sr = Strike_rate_calculator(Team_B_player_runs[p], Team_B_ballsfaced[p]);
                   Team_B_strike_rate[p]=sr;
                   batsman1_SR.setText("" + sr);
               } else if (batsman2_name.isChecked()) {
                   Team_B_player_runs[m] = Team_B_player_runs[m] + q;
                   batsman2_runs.setText("" + Team_B_player_runs[m]);
                   Team_B_ballsfaced[m]++;
                   batsman2_balls.setText("" + Team_B_ballsfaced[m]);
                   Double sr = Strike_rate_calculator(Team_B_player_runs[m], Team_B_ballsfaced[m]);
                   Team_B_strike_rate[m]=sr;
                   batsman2_SR.setText("" + sr);
               }

           }
        }

    public void batsman_select_for_bys() {
      //  innnigs_changer();
        if(n==0) {

            if (batsman1_name.isChecked()) {
                batsman1_runs.setText("" + Team_A_player_runs[p]);
                Team_A_ballsfaced[p]++;
                batsman1_balls.setText("" + Team_A_ballsfaced[p]);
                Double sr = Strike_rate_calculator(Team_A_player_runs[p], Team_A_ballsfaced[p]);
                Team_A_strike_rate[p] = sr;
                batsman1_SR.setText("" + sr);
            } else if (batsman2_name.isChecked()) {
                //batsman2_scored=batsman2_scored+n;
                batsman2_runs.setText("" + Team_A_player_runs[m]);
                Team_A_ballsfaced[m]++;
                batsman2_balls.setText("" + Team_A_ballsfaced[m]);
                Double sr = Strike_rate_calculator(Team_A_player_runs[m], Team_A_ballsfaced[m]);
                batsman2_SR.setText("" + sr);
            }
        }
        else if(n==1){
            if (batsman1_name.isChecked()) {
                //batsman1_scored=batsman1_scored+n;
                batsman1_runs.setText("" + Team_B_player_runs[p]);
                Team_B_ballsfaced[p]++;
                batsman1_balls.setText("" + Team_B_ballsfaced[p]);
                Double sr = Strike_rate_calculator(Team_B_player_runs[p], Team_B_ballsfaced[p]);
                Team_B_strike_rate[m] = sr;
                batsman1_SR.setText("" + sr);
            } else if (batsman2_name.isChecked()) {
                //batsman2_scored=batsman2_scored+n;
                batsman2_runs.setText("" + Team_B_player_runs[m]);
                Team_B_ballsfaced[m]++;
                batsman2_balls.setText("" + Team_B_ballsfaced[m]);
                Double sr = Strike_rate_calculator(Team_A_player_runs[m], Team_B_ballsfaced[m]);
                batsman2_SR.setText("" + sr);
            }
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
     //   innnigs_changer();


        if(n==0) {
            float total_balls = (float) Team_A_balls;
            float rr = (Team_A_runs / total_balls) * 6;
            double new_rr = Math.round(rr * 100.0) / 100.0;
            Current_runrate.setText("" + new_rr);
        }
        else if(n==1){
            float total_balls = (float) Team_B_balls;
            float rr = (Team_B_runs/ total_balls) * 6;
            double new_rr = Math.round(rr * 100.0) / 100.0;
            Current_runrate.setText("" + new_rr);
        }
    }




    public void wicket_fall(){
        over_count();
        balls_bowled_bowler(0);
        A_wickets++;
        total_wickets.setText(""+A_wickets);
        if(n==0){
            Team_B_player_wickets[b]++;
            if(batsman1_name.isChecked()){
                if(p<m)
                    p=m+1;
                else
                    p=p+1;
                batsman1_name.setText("" + Team_A_batsman[p]);
                batsman1_runs.setText(""+Team_A_player_runs[p]);
                batsman1_balls.setText(""+Team_A_ballsfaced[p]);
                batsman1_SR.setText(""+Team_A_strike_rate[p]);
                bowler_wickets_taken.setText(""+Team_B_player_wickets[b]);

            }
            if(batsman2_name.isChecked()){
                Team_A_player_wickets[b]++;
                if(p<m)
                    m=m+1;
                else
                    m=p+1;
                batsman2_name.setText("" + Team_A_batsman[m]);
                batsman2_runs.setText(""+Team_A_player_runs[m]);
                batsman2_balls.setText(""+Team_A_ballsfaced[m]);
                batsman2_SR.setText(""+Team_A_strike_rate[m]);
                bowler_wickets_taken.setText(""+Team_A_player_wickets[b]);
            }
        }
        if(n==1){
            if(batsman1_name.isChecked()) {
                if (p < m)
                    p = m + 1;
                else
                    p = p + 1;
                batsman1_name.setText("" + Team_B_batsman[p]);
                batsman1_runs.setText("" + Team_B_player_runs[p]);
                batsman1_balls.setText("" + Team_B_ballsfaced[p]);
                batsman1_SR.setText("" + Team_B_strike_rate[p]);
            }
            else if(batsman2_name.isChecked()) {
                if (p < m)
                    m = m + 1;
                else
                    m = p + 1;
                batsman2_name.setText("" + Team_B_batsman[m]);
                batsman2_runs.setText("" + Team_B_player_runs[m]);
                batsman2_balls.setText("" + Team_B_ballsfaced[m]);
                batsman2_SR.setText("" + Team_B_strike_rate[m]);
            }
        }
        thisover=thisover.concat(" W");
        if(balls==0){
            thisover="";
        }
        curent_over.setText(" "+thisover);

    }

    public void Boundry_record_maintainer(int q){
      //  innnigs_changer();
        if(q==6){
            if(n==0){
                if(batsman1_name.isChecked()){
                    Team_A_batsman_sixes[p]++;
                }
                else if(batsman2_name.isChecked()){
                    Team_A_batsman_sixes[m]++;
                }
            }
            else if(n==1){
                if(batsman1_name.isChecked()){
                    Team_B_batsman_sixes[p]++;
                }
                else if(batsman2_name.isChecked()){
                    Team_B_batsman_sixes[m]++;
                }
            }
        }
        else if(q==4){
            if(n==0){
                if(batsman1_name.isChecked()){
                    Team_A_batsman_sixes[p]++;
                }
                else if(batsman2_name.isChecked()){
                    Team_A_batsman_sixes[m]++;
                }
            }
            else if(n==1){
                if(batsman1_name.isChecked()){
                    Team_B_batsman_sixes[p]++;
                }
                else if(batsman2_name.isChecked()){
                    Team_B_batsman_sixes[m]++;
                }
            }
        }

    }
    public void balls_bowled_bowler(int q){

        if(n==0){
            bowler_name_bowling.setText(""+Team_B_bowler[b]);
            Team_B_player_runs_given[b]=Team_B_player_runs_given[b]+q;
            bowler_runs_given.setText(""+Team_B_player_runs_given[b]);
            Team_B_players_balls_bowled[b]=Team_B_players_balls_bowled[b]+1;
            bowler_over_calculator();
        }
        else if(n==1){
            bowler_name_bowling.setText(""+Team_A_bowler[b]);
            Team_A_player_runs_given[b]=Team_A_player_runs_given[b]+q;
            bowler_runs_given.setText(""+Team_A_player_runs_given[b]);
            Team_A_players_balls_bowled[b]=Team_A_players_balls_bowled[b]+1;
            bowler_over_calculator();

        }
    }
    public void bowler_over_calculator(){
        if(n==1){
            if(Team_A_players_balls_bowled[b]==6){
                Team_A_players_balls_bowled[b]=0;
                Team_A_players_overs[b]=Team_A_players_overs[b]+1;
            }
            bowlers_balls_bowled.setText(""+Team_A_players_balls_bowled[b]);
            bowlers_overs_bowled.setText(""+Team_A_players_overs[b]);
        }
        if(n==0){
            if(Team_B_players_balls_bowled[b]==6){
                Team_B_players_balls_bowled[b]=0;
                Team_B_players_overs[b]=Team_B_players_overs[b]+1;
            }
            bowlers_balls_bowled.setText(""+Team_B_players_balls_bowled[b]);
            bowlers_overs_bowled.setText("" + Team_B_players_overs[b]);
        }
    }


    public void dialog_for_extras_wicket(String A){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Wicket "+A+" Ball");
        builder.setMessage("To add a wicket on "+A+" Ball.Press W and select wicket type,you will get the option to choose "+A+" Ball");
        builder.setPositiveButton("OK!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Scorecalculator.this, "ok pressed", Toast.LENGTH_SHORT).show();
            }
        }).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Scorecalculator.this, "cancel pressed", Toast.LENGTH_SHORT).show();
            }
        });
        builder.create().show();
    }

}

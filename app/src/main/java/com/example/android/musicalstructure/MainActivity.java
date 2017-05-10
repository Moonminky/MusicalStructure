package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the Layout that shows the focus category
        LinearLayout focus = (LinearLayout) findViewById(R.id.focus);

        // Set a click listener on that View
        focus.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the focus LinearLayout is clicked on.
            @Override
            public void onClick(View view) {
                Intent focusIntent = new Intent(MainActivity.this, FocusActivity.class);
                startActivity(focusIntent);
            }
        });

        // Find the Layout that shows the sleep category
        LinearLayout sleep = (LinearLayout) findViewById(R.id.sleep);

        // Set a click listener on that Layout
        sleep.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the focus LinearLayout is clicked on.
            @Override
            public void onClick(View view) {
                Intent sleepIntent = new Intent(MainActivity.this, SleepActivity.class);
                startActivity(sleepIntent);
            }
        });

        // Find the Layout that shows the chill category
        LinearLayout chill = (LinearLayout) findViewById(R.id.chill);

        // Set a click listener on that Layout
        chill.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the focus LinearLayout is clicked on.
            @Override
            public void onClick(View view) {
                Intent chillIntent = new Intent(MainActivity.this, ChillActivity.class);
                startActivity(chillIntent);
            }
        });

        // Find the Layout that shows the party category
        LinearLayout party = (LinearLayout) findViewById(R.id.party);

        // Set a click listener on that Layout
        party.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the focus LinearLayout is clicked on.
            @Override
            public void onClick(View view) {
                Intent partyIntent = new Intent(MainActivity.this, PartyActivity.class);
                startActivity(partyIntent);
            }
        });

        // Find the Layout that shows the wakeUp category
        LinearLayout wakeUp = (LinearLayout) findViewById(R.id.wakeUp);

        // Set a click listener on that Layout
        wakeUp.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the focus LinearLayout is clicked on.
            @Override
            public void onClick(View view) {
                Intent wakeUpIntent = new Intent(MainActivity.this, WakeUpActivity.class);
                startActivity(wakeUpIntent);
            }
        });

        // Find the Layout that shows the workout category
        LinearLayout workout = (LinearLayout) findViewById(R.id.workout);

        // Set a click listener on that Layout
        workout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the focus LinearLayout is clicked on.
            @Override
            public void onClick(View view) {
                Intent workoutIntent = new Intent(MainActivity.this, WorkoutActivity.class);
                startActivity(workoutIntent);
            }
        });
    }


}

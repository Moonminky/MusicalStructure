package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class WorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        // Find the settings Button
        ImageView settings = (ImageView) findViewById(R.id.settings);

        // Set a click listener on that View
        settings.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the focus LinearLayout is clicked on.
            @Override
            public void onClick(View view) {
                Intent SettingsIntent = new Intent(WorkoutActivity.this, Settings.class);
                startActivity(SettingsIntent);
            }
        });

        // Find the list Button
        ImageView list = (ImageView) findViewById(R.id.list);

        // Set a click listener on that View
        list.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the focus LinearLayout is clicked on.
            @Override
            public void onClick(View view) {
                Intent ListIntent = new Intent(WorkoutActivity.this, MainActivity.class);
                startActivity(ListIntent);
            }
        });
    }
}

package com.example.listerapp.MainInterface;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listerapp.R;
import com.example.listerapp.DataManagement.SavedSharedPreference;

public class Dashboard extends AppCompatActivity {

    Button btn_profile, btn_recent, btn_home, btn_school, btn_logout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        btn_profile = findViewById(R.id.dashboard_btnprofile);
        btn_recent = findViewById(R.id.dashboard_btnrecent);
        btn_home = findViewById(R.id.dashboard_btnhometask);
        btn_school = findViewById(R.id.dashboard_btnschooltask);
        btn_logout = findViewById(R.id.dashboard_btnlogout);

        final String logged_name = SavedSharedPreference.getUserName(Dashboard.this);

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(Dashboard.this, Profile.class);
                profileIntent.putExtra("profile_name", logged_name);
                startActivity(profileIntent);
            }
        });

        btn_recent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, Recent.class));
            }
        });

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, HomeTask_Main.class));
            }
        });

        btn_school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, SchoolTask_Main.class));
            }
        });

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(Dashboard.this, MainActivity.class));
                Toast.makeText(Dashboard.this, "Log-out Successful.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

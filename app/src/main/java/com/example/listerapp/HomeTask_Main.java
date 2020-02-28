package com.example.listerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeTask_Main extends AppCompatActivity {

    Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_task_main);

        btn_add = findViewById(R.id.hometask_main_btnadd);


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeTask_Main.this, HomeTask_Add.class));
            }
        });
    }
}

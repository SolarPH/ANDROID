package com.example.listerapp.MainInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.listerapp.R;

public class SchoolTask_Main extends AppCompatActivity {

    Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.school_task_main);

        btn_add = findViewById(R.id.schooltask_main_btnadd);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SchoolTask_Main.this, SchoolTask_Add.class));
            }
        });
    }
}

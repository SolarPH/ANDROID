package com.example.listerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SchoolTask_Add extends AppCompatActivity {

    EditText et_name, et_desc, et_date, et_time;
    Button btn_add, btn_cancel;
    TextFieldChecker tfc = new TextFieldChecker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.school_task_add);

        et_name = findViewById(R.id.schooltask_add_taskname);
        et_desc = findViewById(R.id.schooltask_add_taskdesc);
        et_date = findViewById(R.id.schooltask_add_taskdate);
        et_time = findViewById(R.id.schooltask_add_tasktime);
        btn_add = findViewById(R.id.schooltask_add_btnadd);
        btn_cancel = findViewById(R.id.schooltask_add_btncancel);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tfc.checkField_filled(et_name)
                        && tfc.checkField_filled(et_desc)
                        && tfc.checkField_filled(et_date)
                        && tfc.checkField_filled(et_time)){
                    finish();
                    Toast.makeText(SchoolTask_Add.this, "Task added successfully!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(SchoolTask_Add.this, "Fill up all fields.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

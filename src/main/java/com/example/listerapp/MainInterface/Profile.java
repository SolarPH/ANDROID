package com.example.listerapp.MainInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.listerapp.R;

public class Profile extends AppCompatActivity {

    TextView tv_name, tv_age, tv_gender, tv_birthdate, tv_address, tv_username;
    Button btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        btn_return = findViewById(R.id.profile_btnreturn);
        tv_name = findViewById(R.id.profile_name);

        try{
            String data = getIntent().getStringExtra("profile_name");
            Toast.makeText(Profile.this, data, Toast.LENGTH_SHORT).show();
            tv_name.setText(data);
        }
        catch (Exception e){
            Toast.makeText(Profile.this, e.toString(), Toast.LENGTH_SHORT).show();
        }

        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

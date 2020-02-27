package com.example.listerapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_login, btn_register;
    EditText et_username, et_password;
    TextFieldChecker tfc = new TextFieldChecker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = findViewById(R.id.login_btnlogin);
        btn_register = findViewById(R.id.login_btnregister);
        et_username = findViewById(R.id.login_username);
        et_password = findViewById(R.id.login_password);

        final Editable username_parse = et_username.getText();
        final Editable password_parse = et_password.getText();

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (tfc.checkField_filled(et_username) && tfc.checkField_filled(et_password)){
                    // If matches with Database
                    et_username.setText(null);
                    et_password.setText(null);
                    startActivity(new Intent(MainActivity.this, Dashboard.class));
                    finish();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Fields must not be empty.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegisterForm.class));
            }
        });
    }
}

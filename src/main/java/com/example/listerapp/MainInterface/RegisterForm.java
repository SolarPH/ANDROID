package com.example.listerapp.MainInterface;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listerapp.R;
import com.example.listerapp.Validators.TextFieldChecker;

public class RegisterForm extends AppCompatActivity {

    EditText et_name, et_age, et_gender, et_birthday, et_address, et_username, et_password;
    Button btn_confirm, btn_return;
    TextFieldChecker tfc = new TextFieldChecker();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_form);

        et_name = findViewById(R.id.register_name);
        et_age = findViewById(R.id.register_age);
        et_gender = findViewById(R.id.register_gender);
        et_birthday = findViewById(R.id.register_birthday);
        et_address = findViewById(R.id.register_address);
        et_username = findViewById(R.id.register_username);
        et_password = findViewById(R.id.register_password);
        btn_confirm = findViewById(R.id.register_btnconfirm);
        btn_return = findViewById(R.id.register_btnreturn);

        btn_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tfc.checkField_filled(et_name)
                && tfc.checkField_filled(et_age)
                && tfc.checkField_filled(et_gender)
                && tfc.checkField_filled(et_birthday)
                && tfc.checkField_filled(et_address)
                && tfc.checkField_filled(et_username)
                && tfc.checkField_filled(et_password)){
                    et_name.setText(null);
                    et_age.setText(null);
                    et_gender.setText(null);
                    et_birthday.setText(null);
                    et_address.setText(null);
                    et_username.setText(null);
                    et_password.setText(null);
                    startActivity(new Intent(RegisterForm.this, MainActivity.class));
                    Toast.makeText(RegisterForm.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(RegisterForm.this, "Registration Unsuccessful!\nPlease fill in all fields!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

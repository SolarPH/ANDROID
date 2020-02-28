package com.example.listerapp.Validators;

import android.widget.EditText;

public class TextFieldChecker {
    private EditText field;

    public boolean checkField_filled(EditText newField){
        return !(newField.getText().toString().trim().length() == 0);
    }
}

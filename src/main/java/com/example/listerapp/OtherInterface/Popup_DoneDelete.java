package com.example.listerapp.OtherInterface;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listerapp.R;

public class Popup_DoneDelete extends AppCompatActivity {

    Button btn_done, btn_delete;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.done_delete_popup);

        btn_done = findViewById(R.id.popup_btndone);
        btn_delete = findViewById(R.id.popup_btndelete);
    }
}

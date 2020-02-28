package com.example.listerapp.DataManagement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseRecorder {
    public static Cursor cursor;
    Context context;
    DBHelper helper;
    public static SQLiteDatabase db;

    public DatabaseRecorder(Context context){
        this.context = context;
        helper = new DBHelper(context);

        try {;}catch (Exception e){}
    }

    public void StartDatabase() throws Exception{
        db = helper.getWritableDatabase();
    }

    public boolean RegisterAccount(String name, String age, String gender, String birthday, String address, String username, String password){
        ContentValues values = new ContentValues();
        values.put("C_NAME",name);
        values.put("C_AGE",age);
        values.put("C_GENDER",gender);
        values.put("C_BIRTHDAY",birthday);
        values.put("C_ADDRESS",address);
        values.put("C_USERNAME",username);
        values.put("C_PASSWORD",password);
        long id = db.insert(DBHelper.C_TABLE, null, values);
        if (id > -1){return true;}else{return false;}
    }

    //RESUME HERE || SOLARPH
    //public boolean AddTaskHome()
}

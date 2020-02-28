package com.example.listerapp.DataManagement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static String DATABASE_NAME = "dbListerApp";
    public static int DATABASE_VERSION = 1;

    public static String C_TABLE = "C_TABLE";
    public static String C_ID = "C_ID";
    public static String C_NAME = "C_NAME";
    public static String C_AGE = "C_AGE";
    public static String C_GENDER = "C_GENDER";
    public static String C_BIRTHDAY = "C_BIRTHDAY";
    public static String C_ADDRESS = "C_ADDRESS";
    public static String C_USERNAME = "C_USERNAME";
    public static String C_PASSWORD = "C_PASSWORD";

    public static String H_TABLE = "H_TABLE";
    public static String H_ID = "H_ID";
    public static String H_TYPE = "H_TYPE";
    public static String H_NAME = "H_NAME";
    public static String H_DESC = "H_DESC";
    public static String H_DATE = "H_DATE";
    public static String H_TIME = "H_TIME";
    public static String H_STATUS = "H_STATUS";
    public static String H_OWNER = "H_OWNER";

    public static String S_TABLE = "S_TABLE";
    public static String S_ID = "S_ID";
    public static String S_TYPE = "S_TYPE";
    public static String S_NAME = "S_NAME";
    public static String S_DESC = "S_DESC";
    public static String S_DATE = "S_DATE";
    public static String S_TIME = "S_TIME";
    public static String S_STATUS = "S_STATUS";
    public static String S_OWNER = "S_OWNER";
    
    public DBHelper(Context context){super(context, DATABASE_NAME, null, 1);}

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE " + C_TABLE + "(" + C_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                C_NAME + " TEXT," +
                C_AGE + " TEXT," +
                C_GENDER + " TEXT," +
                C_BIRTHDAY + " TEXT," +
                C_ADDRESS + " TEXT," +
                C_USERNAME + " TEXT," +
                C_PASSWORD + " TEXT)");
        
        db.execSQL("CREATE TABLE " + H_TABLE + "(" + H_ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                H_TYPE + " TEXT," +
                H_NAME + " TEXT," +
                H_DESC + " TEXT," +
                H_DATE + " TEXT," +
                H_TIME + " TEXT," +
                H_STATUS + " TEXT," +
                H_OWNER + " TEXT)");

        db.execSQL("CREATE TABLE " + S_TABLE + "(" + S_ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                S_TYPE + " TEXT," +
                S_NAME + " TEXT," +
                S_DESC + " TEXT," +
                S_DATE + " TEXT," +
                S_TIME + " TEXT," +
                S_STATUS + " TEXT," +
                S_OWNER + " TEXT)");
    }

    public void onUpgrade(SQLiteDatabase db, int ondVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + C_TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + H_TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + S_TABLE);
    }
}

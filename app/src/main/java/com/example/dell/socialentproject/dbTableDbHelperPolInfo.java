package com.example.dell.socialentproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.dell.socialentproject.dbTables.Pol_Info;

public class dbTableDbHelperPolInfo extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "problem_db";
    public dbTableDbHelperPolInfo(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        // create notes table
        db.execSQL(Pol_Info.getSqlCreateEntries());
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL(Pol_Info.getSqlDeleteEntries());

        // Create tables again
        onCreate(db);
    }
}
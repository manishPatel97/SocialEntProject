package com.example.dell.socialentproject;

import android.content.*;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class Register extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public void disCreds(View view)
    {
        /*EditText name = (EditText) findViewById(R.id.id_name);
        EditText email = (EditText) findViewById(R.id.id_email);
        EditText phone = (EditText) findViewById(R.id.id_phone);
        EditText address = (EditText) findViewById(R.id.id_address);
        //Spinner ward = (Spinner) findViewById(R.id.ward_dropdown);
        dbTableDbHelper h = new dbTableDbHelper(getBaseContext());
        SQLiteDatabase db = h.getWritableDatabase();
        ContentValues vals = new ContentValues();
        vals.put(dbTables.User.COLUMN_USER_NAME, name.getText().toString());
        vals.put(dbTables.User.COLUMN_USER_EMAIL, email.getText().toString());
        vals.put(dbTables.User.COLUMN_USER_PHONE, phone.getText().toString());
        vals.put(dbTables.User.COLUMN_USER_ADDRESS, address.getText().toString());
        long newUserId = db.insert(dbTables.User.TABLE_USER, null, vals);
        System.out.println(newUserId);*/


        //Bundle b = new Bundle();
        Intent i = new Intent (this,PassLayout.class);
        startActivity(i);
    }
}

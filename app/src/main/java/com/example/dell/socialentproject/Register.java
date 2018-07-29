package com.example.dell.socialentproject;

import android.content.*;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Register extends AppCompatActivity {
    String username;
    Spinner spinner;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        addItemsOnSpinner2();

    }

    public void addItemsOnSpinner2() {

        spinner = (Spinner) findViewById(R.id.ward_dropdown);
        List<String> list = new ArrayList<String>();
        list.add(0,"choose your ward ");
        list.add(1,"001-E MAYUR VIHAR PHASE-I");

        list.add(2,"002-E TRILOKPURI-EAST");
        list.add(3,"003-E TRILOKPURI-WEST");
        list.add(4,"004-E NEW ASHOK NAGAR");
        list.add(5,"005-E KONDLI");
        list.add(6,"006-E GHAROLI");
        list.add(7,"007-E DALLUPURA");
        list.add(8,"008-E KALYAN PURI");
        list.add(9,"009-E MANDAWALI");
        list.add(10,"010-E VINOD NAGAR");
        list.add(11,"011-E MAYUR VIHAR PHASE-II");
        list.add(12,"012-E PATPAR GANJ");
        list.add(13,"013-E KISHAN KUNJ");
        list.add(14,"014-E LAKSHMI NAGAR");
        list.add(15,"015-E SHAKARPUR");
        list.add(16,"016-E PANDAV NAGAR");
        list.add(17,"017-E VISHWAS NAGAR");
        list.add(18,"018-E ANAND VIHAR");
        list.add(19,"019-E I.P. EXTENSION");
        list.add(20,"020-E PREET VIHAR");
        list.add(21,"021-E KRISHNA NAGAR");
        list.add(22,"022-E ANARKALI");
        list.add(23,"023-E GHONDLI");
        list.add(24,"024-E GEETA COLONY");
        list.add(25,"025-E GANDHI NAGAR");
        list.add(26,"026-E KANTI NAGAR");
        list.add(27,"027-E RAGHUBARPURA");
        list.add(28,"028-E DILSHAD COLONY");
        list.add(29,"029-E VIVEK VIHAR");
        list.add(30,"030-E JHILMIL");
        list.add(31,"031-E SHAHDARA");
        list.add(32,"032-E NAND NAGRI");
        list.add(33,"033-E SUNDER NAGRI");
        list.add(34,"034-E NEW SEEMAPURI");
        list.add(35,"035-E DILSHAD GARDEN");
        list.add(36,"036-E ASHOK NAGAR");
        list.add(37,"037-E RAM NAGAR");
        list.add(38,"038-E ROHTASH NAGAR");
        list.add(39,"039-E WELCOME COLONY");
        list.add(40,"040-E MAUJPUR");
        list.add(41,"041-E CHAUHAN BANGER");
        list.add(42,"042-E SEELAMPUR");
        list.add(43,"043-E GAUTAM PURI");
        list.add(44,"044-E BHAJAN PURA");
        list.add(45,"045-E YAMUNA VIHAR");






        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }

   /* public void login(View view){
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }*/
    public void disCreds(View view)
    {
        EditText name = (EditText) findViewById(R.id.id_name);
        EditText email = (EditText) findViewById(R.id.id_email);
        EditText phone = (EditText) findViewById(R.id.id_phone);
        EditText address = (EditText) findViewById(R.id.id_address);
        Spinner ward = (Spinner) findViewById(R.id.ward_dropdown);
    System.out.println("ward "+String.valueOf(ward.getSelectedItem()));
        dbTableDbHelper h = new dbTableDbHelper(getBaseContext());
        SQLiteDatabase db = h.getWritableDatabase();
        ContentValues vals = new ContentValues();
        vals.put(dbTables.User.COLUMN_USER_NAME, name.getText().toString());
        username = name.getText().toString();
        vals.put(dbTables.User.COLUMN_USER_EMAIL, email.getText().toString());
        vals.put(dbTables.User.COLUMN_USER_PHONE, phone.getText().toString());
        vals.put(dbTables.User.COLUMN_USER_ADDRESS, address.getText().toString());
        long newUserId = db.insert(dbTables.User.TABLE_USER, null, vals);
        System.out.println(newUserId);


        //Bundle b = new Bundle();
        Intent i = new Intent (this,PassLayout.class);
        i.putExtra("type","Register");
        i.putExtra("username",username);
        startActivity(i);
    }
}

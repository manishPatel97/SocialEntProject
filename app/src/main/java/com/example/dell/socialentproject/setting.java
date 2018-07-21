package com.example.dell.socialentproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class setting extends AppCompatActivity {

    String name, ward,type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        name = getIntent().getExtras().getString("username");
        //System.out.println("user" +name);
        type =getIntent().getExtras().getString("type");
        ward = getIntent().getExtras().getString("ward");
    }
    public void login(View view){
        Intent i= new Intent(this, LoginActivity.class);
        startActivity(i);
    }
    public void home(View view){
        Intent i = new Intent(this,userHome.class);
        i.putExtra("username",name);
        i.putExtra("ward",ward);
        startActivity(i);

    }
    public void change_password(View view){
        Intent i = new Intent(this,PassLayout.class);


        i.putExtra("username",name);
        i.putExtra("type",type);
        startActivity(i);}

    }



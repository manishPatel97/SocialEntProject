package com.example.dell.socialentproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class userHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
    }
    public void login(View view){
        Intent i= new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}

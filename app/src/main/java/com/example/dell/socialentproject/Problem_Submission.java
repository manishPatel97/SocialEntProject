package com.example.dell.socialentproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Problem_Submission extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem__submission);
    }
    public void login(View view){
        Intent i =  new Intent(this,LoginActivity.class);
        startActivity(i);
    }
    public  void userHome(View view){
        Intent i = new Intent(this,userHome.class);
        startActivity(i);
    }
}

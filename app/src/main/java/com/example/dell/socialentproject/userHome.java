package com.example.dell.socialentproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


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

    public void submitProblem(View view){
        Intent i = new Intent(this,Problem_Submission.class);
        startActivity(i);
    }

}

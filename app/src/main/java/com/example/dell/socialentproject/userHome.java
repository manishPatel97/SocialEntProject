package com.example.dell.socialentproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class userHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
    }
<<<<<<< HEAD
    public void login(View view){
        Intent i= new Intent(this, LoginActivity.class);
        startActivity(i);
    }

    public void submitProblem(View view){
        Intent i = new Intent(this,Problem_Submission.class);
        startActivity(i);
    }
=======
>>>>>>> 51c8838cd5581c0fa8c5a2d7f0c3c635477f305f
}

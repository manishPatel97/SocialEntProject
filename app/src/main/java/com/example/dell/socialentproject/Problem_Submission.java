package com.example.dell.socialentproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Problem_Submission extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem__submission);
    }
    public void login(View view){
        Intent i =  new Intent(this,LoginActivity.class);

        startActivity(i);
    }
    public  void userHome(final View view){

        AlertDialog alertDialog = new AlertDialog.Builder(Problem_Submission.this).create();
        alertDialog.setTitle("Message");
        alertDialog.setMessage("Thank you for your response");
       // alertDialog.setIcon(R.drawable.tick);
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                click(view);
            }
        });
        alertDialog.show();


    }
    public void click(View view){
        Intent i = new Intent(this,userHome.class);
        startActivity(i);
    }
}

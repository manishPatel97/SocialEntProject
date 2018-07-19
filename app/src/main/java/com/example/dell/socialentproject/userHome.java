package com.example.dell.socialentproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;


public class userHome extends AppCompatActivity {

    public String name,ward;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);

        TextView textView =(TextView) findViewById(R.id.textView2);
        textView.setText("Hello, "+getIntent().getExtras().getString("username"));
        name = getIntent().getExtras().getString("username");
        //System.out.println("user" +name);
        ward = getIntent().getExtras().getString("ward");

    }

    public void login(View view){
        Intent i= new Intent(this, LoginActivity.class);

        startActivity(i);
    }

    public void submitProblem(View view){
        Intent i = new Intent(this,Problem_Submission.class);
        //System.out.println("user1 "+ name);
        i.putExtra("username",name);
        i.putExtra("ward",ward);
        startActivity(i);
    }
    public void setting(View view){
        Intent i = new Intent(this,setting.class);
        i.putExtra("username",name);
        i.putExtra("ward",ward);
        startActivity(i);
    }

}

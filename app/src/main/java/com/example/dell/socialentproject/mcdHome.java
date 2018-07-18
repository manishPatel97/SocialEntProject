package com.example.dell.socialentproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mcdHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcd_home);
        TextView textView =(TextView) findViewById(R.id.textView2);
        textView.setText("Hello, "+getIntent().getExtras().getString("username"));

    }
    public void login(View view){
        Intent i= new Intent(this, LoginActivity.class);
        startActivity(i);
    }

}

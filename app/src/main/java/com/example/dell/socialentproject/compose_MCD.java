package com.example.dell.socialentproject;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class compose_MCD extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose__mcd);
        TextView textView =(TextView) findViewById(R.id.textView2);
        textView.setText("Hello, "+getIntent().getExtras().getString("username"));
    }
    public void login(View view){
        Intent i= new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}

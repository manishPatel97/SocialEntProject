package com.example.dell.socialentproject;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class compose_MCD extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose__mcd);
    }
    public void login(View view){
        Intent i= new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}

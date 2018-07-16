package com.example.dell.socialentproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class mcdHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcd_home);
        Button b1 = (Button) findViewById(R.id.button_mcd);
        Button b2 = (Button) findViewById(R.id.mcd_info);
        b1.callOnClick(

        );
        b2.callOnClick(
                //function
        );
    }
}

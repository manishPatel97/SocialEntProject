package com.example.dell.socialentproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class PassLayout extends AppCompatActivity {
    String type, name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_layout);
        type = getIntent().getExtras().getString("type");
        name= getIntent().getExtras().getString("username");
    }
    public void home(View view){

        Intent i = new Intent(this,userHome.class);
        Intent m = new Intent(this,mcdHome.class);
        if(type.compareTo("userhome")==0){
            i.putExtra("username",name);
            startActivity(i);
        }
        else if(type.compareTo("mcdhome")==0){
            m.putExtra("username",name);
            startActivity(m);

        }else{
            System.out.println("error");
        }




    }
}

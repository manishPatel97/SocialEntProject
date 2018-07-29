package com.example.dell.socialentproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class PassLayout extends AppCompatActivity {
    String type, name;
    String ipassword,icnfpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_layout);
        type = getIntent().getExtras().getString("type");
        name= getIntent().getExtras().getString("username");
    }
    public void home(View view){
        EditText pswd = findViewById(R.id.password);
        EditText cpswd = findViewById(R.id.Confirm_password);
        ipassword = pswd.getText().toString();
        icnfpassword = cpswd.getText().toString();
        if(ipassword.compareTo(icnfpassword)==0){
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
                i.putExtra("username",name);
                startActivity(i);
            }
        }
        else{
            TextView textView =(TextView) findViewById(R.id.textView4);
            textView.setText("Re-Enter your password");
        }





    }
}

package com.example.final_year_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText logemail,logpassword;
CardView siginclick;
TextView forgetpassword;
String getEmail,getPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        logemail=findViewById(R.id.logemail);
        logpassword=findViewById(R.id.logpassword);
        siginclick=findViewById(R.id.cardView3);
        forgetpassword=findViewById(R.id.logforget);
        siginclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEmail=logemail.getText().toString();
                getPassword=logpassword.getText().toString();
                if (getEmail.isEmpty()){
                    logemail.setError("Email required");
                    return;
                }
                else if(getPassword.isEmpty()){
                    logpassword.setError("Password required");
                    return;
                }
                else if(getPassword.length()<6)
                {
                    logpassword.setError("Password incorrect");
                    return;
                }
                else
                {
                    Intent i = new Intent(MainActivity.this, SignUp.class);
                    startActivity(i);
                }
            }
        });
    }
}
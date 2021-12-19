package com.example.final_year_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

        EditText name,email,password,confirmpassword;


        CardView siginup;


        String newname,newemail,newpassword,newcpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name=findViewById(R.id.sigName);
        email=findViewById(R.id.signemail);
        password=findViewById(R.id.signPassword);
        confirmpassword=findViewById(R.id.cpassword);
        siginup=findViewById(R.id.cardViewsignin);
        siginup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newname=name.getText().toString().trim();
                newemail=email.getText().toString().trim();
                newpassword=password.getText().toString().trim() ;
                newcpassword=confirmpassword.getText().toString().trim();
                if (newname.isEmpty()){
                    name.setError("name required");
                    return;
                }
                else if(newemail.isEmpty()){
                    email.setError("Password required");
                    return;
                }
                else if(newpassword.length()<6)
                {
                    password.setError("Password incorrect");
                    return;
                }
                else if(newcpassword.isEmpty()){
                    confirmpassword.setError("Password required");
                    return;
                }
                else if(newpassword!=newcpassword)
                {
                    password.setError("Password not match");
                    confirmpassword.setError("Password not match");
                    return;
                }
                else
                {
                    Intent i = new Intent(SignUp.this, HomePage.class);
                    startActivity(i);
                }
            }
        });
    }
}
// Copyright (c) 2016 Amanda Murphy & Randy Perrone
// This code is available under the "MIT License".
// Please see the file COPYING in this distribution
// for license terms.

package com.example.amanda.trails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CreateSignUp extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_sign_up);


    }

    public void onSignUpClick(View view){
        if(view.getId() == R.id.Bsignupbutton){
            EditText name = (EditText) findViewById(R.id.TFname);
            EditText userNme = (EditText) findViewById(R.id.TFusername);
            EditText password1 = (EditText) findViewById(R.id.TFpass1);
            EditText password2 = (EditText) findViewById(R.id.TFpass2);

            String nameString = name.getText().toString();
            String userNameString = userNme.getText().toString();
            String pass1String = password1.getText().toString();
            String pass2String = password2.getText().toString();

            if(nameString.isEmpty() || userNameString.isEmpty()){
                Toast error = Toast.makeText(CreateSignUp.this, "Name and username must not be blank!", Toast.LENGTH_SHORT);
                error.show();
            }
            else if(!(pass1String.equals(pass2String))){
                Toast pass = Toast.makeText(CreateSignUp.this, "Passwords don't match!", Toast.LENGTH_SHORT);
                pass.show();
            }
            else if(!(pass1String.length() > 4)){
                Toast pass = Toast.makeText(CreateSignUp.this, "Passwords must be at least 5 characters long!", Toast.LENGTH_SHORT);
                pass.show();
            }
            else{
                //insert into database
                User tempUser = new User(nameString, userNameString, pass1String);
                helper.insertContact(tempUser);
                finish();

            }
        }
    }
}

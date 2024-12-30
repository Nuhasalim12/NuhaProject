package com.example.flexgym;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class login2 extends AppCompatActivity {

    EditText Email,password;
    TextView logT,Sig;
    Button login;
    ProgressBar PB;
    FirebaseAuth ff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        ff=FirebaseAuth.getInstance();
        Email=(EditText) findViewById(R.id.EnterEmail);
        password=(EditText) findViewById(R.id.Password);
        login=(Button) findViewById(R.id.LoginButton);
        logT=(TextView) findViewById(R.id.login2);
        Sig=(TextView) findViewById(R.id.signupLink);
        PB=(ProgressBar) findViewById(R.id.progressBar);




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUser();

            }
        });

        Sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login2.this, Register.class);
                startActivity(intent);
                finish();
            }

            });

        }


        public void loginUser() {

        PB.setVisibility(View.VISIBLE);
        String email1 = Email.getText().toString();
        String pass1 = password.getText().toString();

        if (TextUtils.isEmpty(email1)) {
            Toast.makeText(getApplicationContext(), "Please Enter Your Email", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(pass1)) {
            Toast.makeText(getApplicationContext(), "Please Enter Your Password", Toast.LENGTH_LONG).show();
            return;
        }

        ff.signInWithEmailAndPassword(email1, pass1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), "Login Successful!", Toast.LENGTH_LONG).show();
                    PB.setVisibility(View.VISIBLE);
                    Intent mp = new Intent(login2.this, home.class);
                    startActivity(mp);
                } else {
                    Toast.makeText(getApplicationContext(), "Login Failed,Please Login Again", Toast.LENGTH_LONG).show();
                    PB.setVisibility(View.GONE);
                }

            }

        });


    }}

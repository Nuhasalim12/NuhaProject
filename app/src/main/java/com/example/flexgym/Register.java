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

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    EditText YName,PhNUM,eml,pas,ComPa;
    Button REG;
    TextView Register,SignUp;
    ProgressBar PB1;
    FirebaseAuth fbu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fbu=FirebaseAuth.getInstance();

        YName=(EditText) findViewById(R.id.Name);
        PhNUM=(EditText) findViewById(R.id.phoneNum);
        eml=(EditText) findViewById(R.id.YEmail);
        pas=(EditText) findViewById(R.id.YPassword);
        ComPa=(EditText) findViewById(R.id.confirmPass);
        Register=(TextView) findViewById(R.id.register);
        SignUp=(TextView) findViewById(R.id.LogLink);
        REG=(Button) findViewById(R.id.regBTN);
        PB1=(ProgressBar) findViewById(R.id.progressB);


        REG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                registerNewUser();
            }
        });

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, login2.class);
                startActivity(intent);
                finish();
            }
        });

    }


    public void registerNewUser(){
        PB1.setVisibility(View.VISIBLE);
        String em=eml.getText().toString();
        String yn=YName.getText().toString();
        String pn=PhNUM.getText().toString();
        String p1=pas.getText().toString();
        String cp=ComPa.getText().toString();
        String rg=Register.getText().toString();
        String Sig=SignUp.getText().toString();



        if(TextUtils.isEmpty(em)){
            Toast.makeText(getApplicationContext(),"Please Enter Your Email",Toast.LENGTH_LONG).show();;
            return;
        }

        if(TextUtils.isEmpty(p1)){
            Toast.makeText(getApplicationContext(),"Please Enter Your Password",Toast.LENGTH_LONG).show();;
            return;
        }

        fbu.createUserWithEmailAndPassword(em,p1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Sign up Complete!",Toast.LENGTH_LONG).show();
                    PB1.setVisibility(View.VISIBLE);
                    Intent mm=new Intent(Register.this, login2.class);
                    startActivity(mm);
                }

                else
                {
                    Toast.makeText(getApplicationContext(),"Registration Failed. Please Try Again.",Toast.LENGTH_LONG).show();;
                    PB1.setVisibility(View.GONE);
                }


            }
        });
    }


}

package com.example.flexgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    Button BookCl,LOut,AdminN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BookCl=(Button) findViewById(R.id.BookC);
        LOut=(Button) findViewById(R.id.LogO1);
        AdminN=(Button)findViewById(R.id.Ad12);


        BookCl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, MenuPage.class);
                startActivity(intent);
            }
        });


        AdminN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this, AdminPage.class);
                startActivity(intent);
                finish();
            }
        });

        LOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(home.this,login2.class);
                startActivity(intent);
                finish();

            }
        });





    }
}

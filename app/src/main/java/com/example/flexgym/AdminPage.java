package com.example.flexgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminPage extends AppCompatActivity {

    Button AddSession,UpdateSession, deleteSession, HomeBB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);

        AddSession=(Button) findViewById(R.id.AddS);
        UpdateSession =(Button) findViewById(R.id.UpdateSS);
        deleteSession =(Button) findViewById(R.id.DeleteS);
        HomeBB =(Button) findViewById(R.id.BackHome);

        HomeBB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminPage.this,home.class);
                startActivity(intent);
                finish();
            }
        });

        AddSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminPage.this, Add.class);
                startActivity(intent);
            }
        });

        deleteSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminPage.this, DeletePage.class);
                startActivity(intent);
            }
        });
        UpdateSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminPage.this, Update.class);
                startActivity(intent);
            }
        });




    }




}

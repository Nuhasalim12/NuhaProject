package com.example.flexgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Update extends AppCompatActivity {
    TextView UpdateSe;
    EditText SessionUP, PriceUP;
    Button Bup, Bba;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        UpdateSe = findViewById(R.id.Update2);
        PriceUP = findViewById(R.id.Price3);
        SessionUP = findViewById(R.id.Session3);
        Bup = findViewById(R.id.UpdateU);
        Bba = findViewById(R.id.Back4);


        Bba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Update.this,AdminPage.class);
                startActivity(intent);
                finish();
            }
        });
    }
}


package com.example.flexgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Add extends AppCompatActivity {
    TextView AddSe;
    EditText SE,PR;
    Button SAVEs,BACKs;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        AddSe = (TextView) findViewById(R.id.Add2);
        SE =(EditText) findViewById(R.id.Session);
        PR =(EditText) findViewById(R.id.Price2);
        SAVEs =(Button) findViewById(R.id.saveB);
        BACKs= (Button) findViewById(R.id.BackAdmin);

        BACKs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Add.this, AdminPage.class);
                startActivity(intent);
                finish();
            }
        });



    }



}

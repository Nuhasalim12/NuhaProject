package com.example.flexgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Checkout extends AppCompatActivity {
    TextView TV1,TV2;
    Button BB1,BB2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        String SessionName = getIntent().getStringExtra("Session Name");
        String SessionPrice = getIntent().getStringExtra("Session Price");


         TV1 =(TextView) findViewById(R.id.SessionNN);
         TV2 =(TextView) findViewById(R.id.SessionPrice);
         BB1 =(Button) findViewById(R.id.confirmBTN);
         BB2= (Button) findViewById(R.id.BackMenu1);

        TV1.setText(SessionName);
       TV2.setText("Price: " + SessionPrice);

        BB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Checkout.this,MenuPage.class);
                startActivity(intent);
                finish();
            }
        });


        BB1.setOnClickListener(v -> {
            Toast.makeText(Checkout.this, "Book Confirmed: " + SessionName, Toast.LENGTH_SHORT).show();
        });
    }
}

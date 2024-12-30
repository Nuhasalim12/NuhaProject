package com.example.flexgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class MenuPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);


        Button BTNHome = findViewById(R.id.HomeB);
        BTNHome.setOnClickListener(v -> {

            Intent intent = new Intent(MenuPage.this,home.class);
            startActivity(intent);
            finish();
        });


        Button BookCardio = findViewById(R.id.CardioB);
        BookCardio.setOnClickListener(v -> {
            Intent intent = new Intent(MenuPage.this, Checkout.class);
            intent.putExtra("Session Name", "Cardio Session");
            intent.putExtra("Session Price", "10.00 OMR");
            startActivity(intent);
        });

        Button BookZumba = findViewById(R.id.ZumbaB);
        BookZumba.setOnClickListener(v -> {
            Intent intent = new Intent(MenuPage.this, Checkout.class);
            intent.putExtra("Session Name", "Zumba Class");
            intent.putExtra("Session Price", "12.00 OMR");
            startActivity(intent);
        });


        Button BookYoga = findViewById(R.id.YogaB);
        BookYoga.setOnClickListener(v -> {
            Intent intent = new Intent(MenuPage.this, Checkout.class);
            intent.putExtra("Session Name", "Yoga Class");
            intent.putExtra("Session Price", "11.00 OMR");
            startActivity(intent);
        });

        Button BookBoxing = findViewById(R.id.BoxingB);
        BookBoxing.setOnClickListener(v -> {
            Intent intent = new Intent(MenuPage.this, Checkout.class);
            intent.putExtra("Session Name", "Boxing Session");
            intent.putExtra("Session Price", "10.00 OMR");
            startActivity(intent);
        });



    }
}

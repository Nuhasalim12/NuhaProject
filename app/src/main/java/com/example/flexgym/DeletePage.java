package com.example.flexgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DeletePage extends AppCompatActivity {

    TextView TDelete;
    EditText DeleteSession, DSessionPrice;
    Button DeleteBtn, Back2Home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_page);

        TDelete =(TextView) findViewById(R.id.Delete);
        DeleteSession= (EditText) findViewById(R.id.DSession);
        DSessionPrice =(EditText) findViewById(R.id.DPrice);
        DeleteBtn =(Button) findViewById(R.id.SDelete);
        Back2Home =(Button) findViewById(R.id.Back5);


        Back2Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DeletePage.this, AdminPage.class);
                startActivity(intent);
                finish();
            }
        });



    }
}

package com.example.chhun.buyfromus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PurchaseUnit extends AppCompatActivity {

    TextView desc, price_per_unit, total, unit;
     int cv = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_unit);

        unit = (TextView) findViewById(R.id.unit);

        unit.setText("1");

    }

    public void plus(View view){
        if (cv < 10) {
            cv += 1;
            unit.setText(""+cv);
        }

    }
    public void minus(View view){
        if (cv > 0) {
            cv -= 1;
            unit.setText(""+cv);
        }

    }
    public void confirm (View view) {
        Intent i = new Intent(PurchaseUnit.this, PhoneNumber.class);
        startActivity(i);
    }
}

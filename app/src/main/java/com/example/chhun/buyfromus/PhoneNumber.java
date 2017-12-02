package com.example.chhun.buyfromus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PhoneNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);
    }
    public void submit(View view){
        Intent i = new Intent(PhoneNumber.this, PINVerification.class);
        startActivity(i);
    }
    public void cancel (View view) {
        Intent i = new Intent(PhoneNumber.this, PurchaseUnit.class);
        startActivity(i);
    }
}

package com.example.chhun.buyfromus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton main_cat_btn1, main_cat_btn2, main_cat_btn3, main_cat_btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_cat_btn1 = (ImageButton) findViewById(R.id.main_cat_btn1);
        main_cat_btn2 = (ImageButton) findViewById(R.id.main_cat_btn2);
        main_cat_btn3 = (ImageButton) findViewById(R.id.main_cat_btn3);
        main_cat_btn4 = (ImageButton) findViewById(R.id.main_cat_btn4);

    }

    public void goToCat1(View view){
        startActivity(new Intent(MainActivity.this, CategoryList.class));
    }
}

package com.example.chhun.buyfromus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button main_cat_btn1, main_cat_btn2, main_cat_btn3, main_cat_btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_cat_btn1 = (Button) findViewById(R.id.main_cat_btn1);
        main_cat_btn2 = (Button) findViewById(R.id.main_cat_btn2);
        main_cat_btn3 = (Button) findViewById(R.id.main_cat_btn3);
        main_cat_btn4 = (Button) findViewById(R.id.main_cat_btn4);

    }

    public void goToCat1(View view){
        startActivity(new Intent(MainActivity.this, CategoryList.class));
    }
}

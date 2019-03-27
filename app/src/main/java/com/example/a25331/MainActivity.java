package com.example.a25331;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button)findViewById(R.id.btn_one);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Layout1.class);
                startActivity(intent);
            }
        });
        Button btn2=(Button)findViewById(R.id.btn_two);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Layout2.class);
                startActivity(intent);
            }
        });
        Button btn3=(Button)findViewById(R.id.btn_three);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Layout3.class);
                startActivity(intent);
            }
        });
    }
}

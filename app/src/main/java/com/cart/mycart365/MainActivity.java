package com.cart.mycart365;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn_pickorder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_pickorder = findViewById(R.id.btn_pickorder);
        btn_pickorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int_map=new Intent(MainActivity.this,Activity2.class);
                startActivity(int_map);
            }
        });
    }
}
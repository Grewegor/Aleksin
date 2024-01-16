package com.example.aleksin.Navigaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.aleksin.R;
import com.example.aleksin.Shop.ElectronicsActivity;
import com.example.aleksin.Shop.HoztovarsActivity;
import com.example.aleksin.Shop.OdezhdaActivity;
import com.example.aleksin.Shop.ProductsActivity;
import com.example.aleksin.Shop.SportsActivity;
import com.example.aleksin.Shop.TorgZentrActivity;
import com.example.aleksin.Shop.VapeActivity;
import com.example.aleksin.Shop.ZootovarsActivity;

public class ShopActivity extends AppCompatActivity{

    private ListView list;
    private Button shop_btn1, shop_btn2, shop_btn3, shop_btn4, shop_btn5, shop_btn6, shop_btn7, shop_btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_activity);
        addOnListViewShop();

        shop_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ShopActivity.this, ProductsActivity.class);
                startActivity(i);
            }
        });

        shop_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ShopActivity.this, ElectronicsActivity.class);
                startActivity(i);
            }
        });

        shop_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ShopActivity.this, SportsActivity.class);
                startActivity(i);
            }
        });

        shop_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ShopActivity.this, OdezhdaActivity.class);
                startActivity(i);
            }
        });

        shop_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ShopActivity.this, ZootovarsActivity.class);
                startActivity(i);
            }
        });

        shop_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ShopActivity.this, HoztovarsActivity.class);
                startActivity(i);
            }
        });

        shop_btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ShopActivity.this, VapeActivity.class);
                startActivity(i);
            }
        });

        shop_btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ShopActivity.this, TorgZentrActivity.class);
                startActivity(i);
            }
        });


    }

    public void addOnListViewShop()
    {
        shop_btn1 = findViewById(R.id.shop_btn1);
        shop_btn2 = findViewById(R.id.shop_btn2);
        shop_btn3 = findViewById(R.id.shop_btn3);
        shop_btn4 = findViewById(R.id.shop_btn4);
        shop_btn5 = findViewById(R.id.shop_btn5);
        shop_btn6 = findViewById(R.id.shop_btn6);
        shop_btn7 = findViewById(R.id.shop_btn7);
        shop_btn8 = findViewById(R.id.shop_btn8);
        list = findViewById(R.id.listView);
    }
}
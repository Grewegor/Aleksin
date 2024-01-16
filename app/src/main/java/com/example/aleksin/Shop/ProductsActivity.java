package com.example.aleksin.Shop;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aleksin.R;
import com.example.aleksin.RecyclerView.Club;
import com.example.aleksin.RecyclerView.ClubAdapter;
import com.example.aleksin.Text_Content_Activitys.Text_Content_Activity_Shops;

import java.util.ArrayList;
import java.util.List;

public class ProductsActivity extends AppCompatActivity implements ClubAdapter.OnClickShowListener{

    private RecyclerView list;
    private List<Club> clubList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        initListProducts();

        list = findViewById(R.id.listView);
        ClubAdapter clubAdapter = new ClubAdapter(this, clubList, this);

        list.setAdapter(clubAdapter);
        list.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initListProducts() {
        clubList = new ArrayList<>();
        clubList.add(new Club("SPAR Гипермаркет", getString(R.string.shop_products_1), R.drawable.shop_product_1));
        clubList.add(new Club("SPAR", getString(R.string.shop_products_2), R.drawable.shop_product_2));
        clubList.add(new Club("Мисс", getString(R.string.shop_products_3), R.drawable.shop_product_3));
        clubList.add(new Club("Пятёрочка", getString(R.string.shop_products_4), R.drawable.shop_product_4));
        clubList.add(new Club("Магнит", getString(R.string.shop_products_5), R.drawable.shop_product_5));
        clubList.add(new Club("Красное|Белое", getString(R.string.shop_products_6), R.drawable.shop_product_6));
        clubList.add(new Club("Светофор", getString(R.string.shop_products_7), R.drawable.shop_product_7));
        clubList.add(new Club("Fix Price", getString(R.string.shop_products_8), R.drawable.shop_product_8));
    }


    @Override
    public void onClickShowListener(int position) {
        String name = clubList.get(position).getName();
        String description = clubList.get(position).getDescription();
        int logo = clubList.get(position).getLogo();

        Intent intent = new Intent(this, Text_Content_Activity_Shops.class);
        intent.putExtra("name", name);
        intent.putExtra("description", description);
        intent.putExtra("logo", logo);
        intent.putExtra("category", 0);
        startActivity(intent);
    }

}

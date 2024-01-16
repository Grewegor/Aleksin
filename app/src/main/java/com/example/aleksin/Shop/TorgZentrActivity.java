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

public class TorgZentrActivity extends AppCompatActivity implements ClubAdapter.OnClickShowListener{

    private RecyclerView list;
    private List<Club> clubList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        initListTorgZentr();

        list = findViewById(R.id.listView);
        ClubAdapter clubAdapter = new ClubAdapter(this, clubList, this);

        list.setAdapter(clubAdapter);
        list.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initListTorgZentr() {
        clubList = new ArrayList<>();
        clubList.add(new Club("Октябрьский", getString(R.string.shop_torgzentr_1), R.drawable.shop_torgzentr_1));
        clubList.add(new Club("Золотая аллея", getString(R.string.shop_torgzentr_2), R.drawable.shop_torgzentr_2));
        clubList.add(new Club("Комсомольский", getString(R.string.shop_torgzentr_3), R.drawable.shop_torgzentr_3));
        clubList.add(new Club("Слобода-2", getString(R.string.shop_torgzentr_4), R.drawable.shop_torgzentr_4));
        clubList.add(new Club("МЦ Диагональ", getString(R.string.shop_torgzentr_5), R.drawable.shop_torgzentr_5));
        clubList.add(new Club("Коммерсант", getString(R.string.shop_torgzentr_6), R.drawable.shop_torgzentr_6));
        clubList.add(new Club("Центральный", getString(R.string.shop_torgzentr_7), R.drawable.shop_torgzentr_7));
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
        intent.putExtra("category", 7);
        startActivity(intent);
    }
}

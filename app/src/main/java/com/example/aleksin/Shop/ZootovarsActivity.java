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

public class ZootovarsActivity extends AppCompatActivity implements ClubAdapter.OnClickShowListener{

    private RecyclerView list;
    private List<Club> clubList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        initListZootovars();

        list = findViewById(R.id.listView);
        ClubAdapter clubAdapter = new ClubAdapter(this, clubList, this);

        list.setAdapter(clubAdapter);
        list.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initListZootovars() {
        clubList = new ArrayList<>();
        clubList.add(new Club("Зоогалерея", getString(R.string.shop_zootovars_1), R.drawable.shop_zootovar_1));
        clubList.add(new Club("МилорД", getString(R.string.shop_zootovars_2), R.drawable.shop_zootovar_2));
        clubList.add(new Club("Айболит", getString(R.string.shop_zootovars_3), R.drawable.shop_zootovar_3));
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
        intent.putExtra("category", 4);
        startActivity(intent);
    }
}

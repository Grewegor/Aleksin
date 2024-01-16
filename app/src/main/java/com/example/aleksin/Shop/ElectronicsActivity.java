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

public class ElectronicsActivity extends AppCompatActivity implements ClubAdapter.OnClickShowListener{

    private RecyclerView list;
    private List<Club> clubList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        initListElectronics();

        list = findViewById(R.id.listView);
        ClubAdapter clubAdapter = new ClubAdapter(this, clubList, this);

        list.setAdapter(clubAdapter);
        list.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initListElectronics() {
        clubList = new ArrayList<>();
        clubList.add(new Club("МТС", getString(R.string.shop_electronic_1), R.drawable.shop_elcronic_1));
        clubList.add(new Club("DNS", getString(R.string.shop_electronic_2), R.drawable.shop_elcronic_2));
        clubList.add(new Club("Эльдорадо", getString(R.string.shop_electronic_3), R.drawable.shop_elcronic_3));
        clubList.add(new Club("Связной", getString(R.string.shop_electronic_4), R.drawable.shop_elcronic_4));
        clubList.add(new Club("Netwit", getString(R.string.shop_electronic_5), R.drawable.shop_elcronic_5));
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
        intent.putExtra("category", 1);
        startActivity(intent);
    }

}

package com.example.aleksin.Schools;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aleksin.R;
import com.example.aleksin.RecyclerView.Club;
import com.example.aleksin.RecyclerView.ClubAdapter;
import com.example.aleksin.Text_Content_Activitys.Text_Content_Activity_School;

import java.util.ArrayList;
import java.util.List;

public class SchoolaActivity extends AppCompatActivity implements ClubAdapter.OnClickShowListener {
    private RecyclerView list;
    private List<Club> clubList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        initListSchool();

        list = findViewById(R.id.listView);
        ClubAdapter clubAdapter = new ClubAdapter(this, clubList, this);

        list.setAdapter(clubAdapter);
        list.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initListSchool() {
        clubList = new ArrayList<>();
        clubList.add(new Club("МБОУ СОШ № 11", getString(R.string.school_1), R.drawable.school_1));
        clubList.add(new Club("МБОУ Гимназия № 18", getString(R.string.school_2), R.drawable.school_2));
        clubList.add(new Club("МБОУ СОШ № 3", getString(R.string.school_3), R.drawable.school_3));
        clubList.add(new Club("МБОУ Спас-Конинская СОШ№24", getString(R.string.school_4), R.drawable.school_4));
        clubList.add(new Club("МБОУ Шелепинская СОШ № 27", getString(R.string.school_5), R.drawable.school_5));
        clubList.add(new Club("МБОУ СОШ №9", getString(R.string.school_6), R.drawable.school_6));
        clubList.add(new Club("МБОУ СОШ №1", getString(R.string.school_7), R.drawable.school_7));
        clubList.add(new Club("МБОУ Поповская СОШ №19", getString(R.string.school_8), R.drawable.school_8));
        clubList.add(new Club("МБОУ Борисовская НОШ №26", getString(R.string.school_9), R.drawable.school_9));
        clubList.add(new Club("МБОУ Сеневская СОШ №21", getString(R.string.school_10), R.drawable.school_10));
        clubList.add(new Club("МБОУ Авангардская СОШ №7", getString(R.string.school_11), R.drawable.school_11));
        clubList.add(new Club("МБОУ Пушкинская СОШ №22", getString(R.string.school_12), R.drawable.school_12));
        clubList.add(new Club("МБОУ Буныревская СОШ №14", getString(R.string.school_13), R.drawable.school_13));
        clubList.add(new Club("МБОУ Гимназия №13", getString(R.string.school_14), R.drawable.school_14));
    }


    @Override
    public void onClickShowListener(int position) {
        String name = clubList.get(position).getName();
        String description = clubList.get(position).getDescription();
        int logo = clubList.get(position).getLogo();

        Intent intent = new Intent(this, Text_Content_Activity_School.class);
        intent.putExtra("name", name);
        intent.putExtra("description", description);
        intent.putExtra("logo", logo);
        intent.putExtra("category", 1);
        startActivity(intent);
    }
}

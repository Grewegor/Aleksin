package com.example.aleksin.Navigaton;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aleksin.R;
import com.example.aleksin.RecyclerView.Club;
import com.example.aleksin.RecyclerView.ClubAdapter;
import com.example.aleksin.Text_Content_Activitys.Text_Content_Activity;

import java.util.ArrayList;
import java.util.List;

public class DostopriActitvity extends AppCompatActivity implements ClubAdapter.OnClickShowListener{

    private RecyclerView list;
    private List<Club> clubList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        initListDostopri();

        list = findViewById(R.id.listView);
        ClubAdapter clubAdapter = new ClubAdapter(this, clubList, this);

        list.setAdapter(clubAdapter);
        list.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initListDostopri() {
        clubList = new ArrayList<>();
        clubList.add(new Club("Алексин-бор", getString(R.string.dostopri_1), R.drawable.dostopri_1));
        clubList.add(new Club("Барский дом", getString(R.string.dostopri_2), R.drawable.dostopri_2));
        clubList.add(new Club("Гигантский стул", getString(R.string.dostopri_3), R.drawable.dostopri_3));
        clubList.add(new Club("Храм Воскресения Христовах", getString(R.string.dostopri_4), R.drawable.dostopri_4));
        clubList.add(new Club("Художественно-краеведческий музей", getString(R.string.dostopri_5), R.drawable.dostopri_5));
        clubList.add(new Club("Лысая гора", getString(R.string.dostopri_6), R.drawable.dostopri_6));
        clubList.add(new Club("Памятник Ленину", getString(R.string.dostopri_7), R.drawable.dostopri_7));
        clubList.add(new Club("Кинотеатр \"Союз\"", getString(R.string.dostopri_8), R.drawable.dostopri_8));
        clubList.add(new Club("Парк \"Жалка\"", getString(R.string.dostopri_9), R.drawable.dostopri_9));
        clubList.add(new Club("Мемориал Курган Славы", getString(R.string.dostopri_10), R.drawable.dostopri_10));
        clubList.add(new Club("Станция «Рюриково»", getString(R.string.dostopri_11), R.drawable.dostopri_11));
        clubList.add(new Club("Колосовский замок", getString(R.string.dostopri_12), R.drawable.dostopri_12));
        clubList.add(new Club("Мемориальный комплекс в память событий 1472 года", getString(R.string.dostopri_13), R.drawable.dostopri_13));
        clubList.add(new Club("Царевиче-Алексиевский храм", getString(R.string.dostopri_14), R.drawable.dostopri_14));
    }


    @Override
    public void onClickShowListener(int position) {
        String name = clubList.get(position).getName();
        String description = clubList.get(position).getDescription();
        int logo = clubList.get(position).getLogo();

        Intent intent = new Intent(this, Text_Content_Activity.class);
        intent.putExtra("name", name);
        intent.putExtra("description", description);
        intent.putExtra("logo", logo);
        intent.putExtra("category", 1);
        startActivity(intent);
    }
}